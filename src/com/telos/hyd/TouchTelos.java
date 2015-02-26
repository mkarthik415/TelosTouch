package com.telos.hyd;

import com.codename1.io.Log;
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


        // text field container
         System.out.println("displaysize is "+Display.getInstance().getDisplayWidth());

        Container textfieldContainer = new Container();

        TextField username = new TextField();
        username.setHint("UserName");
        textfieldContainer.addComponent(username);
        TextField password = new TextField();
        password.setHint("Password");
        textfieldContainer.addComponent(password);

        //login Button
        final Button loginButton = new Button();
        Styles.ButtonStylesForHomePage(loginButton, "login.png", theme);
        textfieldContainer.addComponent(loginButton);
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