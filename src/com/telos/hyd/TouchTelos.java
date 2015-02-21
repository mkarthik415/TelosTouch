package com.telos.hyd;

import com.codename1.io.Log;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.Styles;
import com.telos.hyd.pages.HomePage;

import java.io.IOException;

/**
 * Created by karthikmarupeddi on 9/30/14.
 */
public class TouchTelos {
    private Form current;
    Resources theme;
    Boolean tablet = false;
    Form f;

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
        //container
         System.out.println("displaysize is "+Display.getInstance().getDisplayWidth());


        Container bannerContainer = new Container();
        TableLayout bannerTableLayout = new TableLayout(1,1);
        TableLayout.Constraint rowConstraint = bannerTableLayout.createConstraint();
        rowConstraint.setWidthPercentage(100);
        rowConstraint.setHorizontalAlign(Component.CENTER);
        rowConstraint.setVerticalAlign(Component.CENTER);
        bannerContainer.setLayout(bannerTableLayout);
        bannerContainer.setUIID("bannerContainer");


        Container fieldsContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        fieldsContainer.setName("fieldsContainer");
        TableLayout fieldTableLayout = new TableLayout(3,1);
        TableLayout.Constraint fieldRowConstraint = fieldTableLayout.createConstraint();
        fieldRowConstraint.setWidthPercentage(100);
        fieldRowConstraint.setHorizontalAlign(Component.CENTER);
        fieldRowConstraint.setVerticalAlign(Component.CENTER);
        fieldsContainer.setUIID("logInContainer");
        fieldsContainer.setLayout(fieldTableLayout);
        fieldsContainer.getStyle().setPadding(20,0,0,0);

        //text fields
        TextField userName = new TextField();
        userName.setHint("Username");
        userName.getStyle().setPadding(10,10,0,0);
        userName.getUnselectedStyle().setPadding(10,10,0,0);
        userName.getSelectedStyle().setPadding(10,10,0,0);
        userName.getPressedStyle().setPadding(10,10,0,0);
        TextField passWord = new TextField();
        passWord.getStyle().setPadding(10,10,0,0);
        passWord.getUnselectedStyle().setPadding(10,10,0,0);
        passWord.getSelectedStyle().setPadding(10,10,0,0);
        passWord.getPressedStyle().setPadding(10,10,0,0);
        passWord.setConstraint(TextField.PASSWORD);
        passWord.setHint("Password");

        //login Button
        final Button loginButton = new Button();
        Styles.ButtonStylesForHomePage(loginButton,"login.png",theme);

        fieldsContainer.addComponent(fieldRowConstraint,userName);
        fieldsContainer.addComponent(fieldRowConstraint,passWord);
        fieldsContainer.addComponent(fieldRowConstraint,loginButton);


        f.addComponent(BorderLayout.CENTER, fieldsContainer);




        Container formContainer = new Container();
        formContainer.setName("formContainer");
        formContainer.setScrollable(false);
        formContainer.setLayout(new BorderLayout());


        //Banner
        Label banner = new Label();
        banner.getStyle().setBgTransparency(0);
        banner.getUnselectedStyle().setBgTransparency(0);
        banner.getSelectedStyle().setBgTransparency(0);
        banner.setGap(0);
        banner.setIcon(theme.getImage("telosLogo.png"));
        bannerContainer.addComponent(rowConstraint,banner);
        f.addComponent(BorderLayout.NORTH, bannerContainer);


        loginButton.addActionListener(action);


        f.show();
    }


    ActionListener action = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {

            HomePage homePage = new HomePage(f);
            homePage.createPage();

        }
    };

    public void stop() {
        current = Display.getInstance().getCurrent();
    }

    public void destroy() {
    }
}