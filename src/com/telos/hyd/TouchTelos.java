package com.telos.hyd;

import com.codename1.components.InfiniteProgress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.Log;
import com.codename1.io.NetworkManager;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.Styles;
import com.telos.hyd.pages.HomePage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by karthikmarupeddi on 9/30/14.
 */
public class TouchTelos {
    private Form current;
    Resources theme;
    Boolean tablet = false;
    Form f;
    TextField username;
    TextField password;
    Label errorLabel;
    private static String name;
    boolean login = false;

    public void init(Object context) {
        try{
            theme = Resources.openLayered("/theme");
            UIManager.getInstance().setThemeProps(theme.getTheme(theme.getThemeResourceNames()[0]));
            Display.getInstance().addEdtErrorHandler(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    evt.consume();
                    Log.p("Exception in AppName version " + Display.getInstance().getProperty("AppVersion", "Unknown"));
                    Log.p("OS " + Display.getInstance().getPlatformName());
                    Log.p("Error " + evt.getSource());
                    Log.p("Current Form " + Display.getInstance().getCurrent().getName());
                    Log.e((Throwable)evt.getSource());
                    Log.sendLog();
                }
            });
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        f = new Form();
        f.setScrollable(false);
        f.setLayout(new BorderLayout());


        // text field container
         System.out.println("displaysize is "+Display.getInstance().getDisplayWidth());

        Container textfieldContainer = new Container();
        textfieldContainer.setUIID("logInContainer");
        textfieldContainer.getStyle().setPadding(20,0,0,0);
        TableLayout fieldTableLayout = new TableLayout(4,1);
        TableLayout.Constraint fieldRowConstraint = fieldTableLayout.createConstraint();
        fieldRowConstraint.setWidthPercentage(100);
        fieldRowConstraint.setHorizontalAlign(Component.CENTER);
        fieldRowConstraint.setVerticalAlign(Component.CENTER);
        textfieldContainer.setLayout(fieldTableLayout);

        username = new TextField();
        username.setHint("UserName");
        textfieldContainer.addComponent(fieldRowConstraint,username);


        password = new TextField();
        password.setHint("Password");
        password.setConstraint(TextField.PASSWORD);
        textfieldContainer.addComponent(fieldRowConstraint,password);

        errorLabel = new Label("Please check your username or password");
        errorLabel.setVisible(false);
        textfieldContainer.addComponent(fieldRowConstraint,errorLabel);

        //login Button
        final Button loginButton = new Button();
        Styles.ButtonStylesForHomePage(loginButton, "login.png", theme);
        textfieldContainer.addComponent(fieldRowConstraint,loginButton);
        loginButton.addActionListener(action);

        f.addComponent(BorderLayout.CENTER,textfieldContainer);


        //Header container


        Container bannerContainer = new Container();
        TableLayout bannerTableLayout = new TableLayout(1,1);
        TableLayout.Constraint rowConstraint = bannerTableLayout.createConstraint();
        rowConstraint.setWidthPercentage(100);
        rowConstraint.setHorizontalAlign(Component.CENTER);
        rowConstraint.setVerticalAlign(Component.CENTER);
        bannerContainer.setLayout(bannerTableLayout);
        bannerContainer.setUIID("bannerContainer");



        Label banner = new Label();
        banner.getStyle().setBgTransparency(0);
        banner.getUnselectedStyle().setBgTransparency(0);
        banner.getSelectedStyle().setBgTransparency(0);
        banner.setGap(0);
        banner.setIcon(theme.getImage("telosLogo.png"));
        bannerContainer.addComponent(rowConstraint,banner);
        f.addComponent(BorderLayout.NORTH, bannerContainer);

        f.show();
    }


    ActionListener action = new ActionListener() {


        public void actionPerformed(ActionEvent evt) {

            System.out.println("the value of log in is "+login);
            if(webservice())
            {
                errorLabel.setVisible(false);
                HomePage homePage = new HomePage(f);
                homePage.createPage();
                homePage.getForm().show();
            }
            else
            {
                errorLabel.setVisible(true);
            }



        }
    };

    public void stop() {
        current = Display.getInstance().getCurrent();
    }

    public void destroy() {
    }


    public boolean  webservice()
    {
        int i = 0;
        System.out.println("inside the webservices method  "+i++);

        if (password.getText() != null && username.getText() != null) {
            f.setName(username.getText());

            ConnectionRequest cr = new ConnectionRequest() {

                public Map<String, Object> totalList;

                protected void readResponse(InputStream is)
                        throws IOException {

                    JSONParser p = new JSONParser();
                    totalList = p.parseJSON(new InputStreamReader(is));

                }


                /**
                 * A callback method that's invoked on the EDT after the readResponse() method has finished,
                 * this is the place where developers should change their Codename One user interface to
                 * avoid race conditions that might be triggered by modifications within readResponse.
                 * Notice this method is only invoked on a successful response and will not be invoked in case
                 * of a failure.
                 */
                @Override
                protected void postResponse() {

                    List dataList = new List();
                    dataList.setItemGap(0);
                    ArrayList list = (ArrayList) totalList.get("root");
                    if (list != null) {

                        for (Object object : list) {

                            login = true;
                            break;

                        }
                    }



                }


            };


            cr.setUrl("http://telosws-poplar5.rhcloud.com/findUser");
            cr.setPost(false);

            InfiniteProgress progress = new InfiniteProgress();
            progress.setUIID("InfiniteProgress");
            Dialog dialogProgress = progress.showInifiniteBlocking();
            cr.setDisposeOnCompletion(dialogProgress);


            cr.addArgument("userName", username.getText());
            cr.addArgument("password", password.getText());
            NetworkManager.getInstance().addToQueueAndWait(cr);

        }

        //I can log in one click when returned true;
        //return true;
        return login;
    }
}