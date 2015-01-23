package com.telos.hyd;

import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.pages.HomePage;

import java.io.IOException;

/**
 * Created by karthikmarupeddi on 9/30/14.
 */
public class TouchTelos {
    private Form current;
    Resources theme;
    Boolean tablet = false;

    public void init(Object context) {
        try{
            theme = Resources.openLayered("/theme");
            UIManager.getInstance().setThemeProps(theme.getTheme(theme.getThemeResourceNames()[0]));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        final Form f = new Form();
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
        bannerContainer.getStyle().setBgTransparency(225);
        bannerContainer.getUnselectedStyle().setBgTransparency(255);
        bannerContainer.getSelectedStyle().setBgTransparency(255);
        bannerContainer.setUIID("bannerContainer");
//        Color color = new Color(72, 90, 162);
//        int rgb = color.getRGB();
//        bannerContainer.getStyle().setBgColor(rgb);
//        bannerContainer.getUnselectedStyle().setBgColor(rgb);
//        bannerContainer.getSelectedStyle().setBgColor(rgb);


        Container imageContainer = new Container();
        TableLayout imageTableLayout = new TableLayout(2,2);
        TableLayout.Constraint imageRowConstraint = imageTableLayout.createConstraint();
        imageRowConstraint.setWidthPercentage(50);
        imageRowConstraint.setHeightPercentage(50);
        imageRowConstraint.setHorizontalAlign(Component.CENTER);
        imageRowConstraint.setVerticalAlign(Component.CENTER);
        imageContainer.setLayout(imageTableLayout);
        imageContainer.getStyle().setBgTransparency(225);
        imageContainer.getUnselectedStyle().setBgTransparency(225);
        imageContainer.getSelectedStyle().setBgTransparency(225);
        imageContainer.getStyle().setBgColor(0xffffff);
        imageContainer.getUnselectedStyle().setBgColor(0xffffff);
        imageContainer.getSelectedStyle().setBgColor(0xffffff);


        Container fieldsContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        fieldsContainer.setName("fieldsContainer");
        TableLayout fieldTableLayout = new TableLayout(3,1);
        TableLayout.Constraint fieldRowConstraint = imageTableLayout.createConstraint();
        fieldRowConstraint.setWidthPercentage(100);
        fieldRowConstraint.setHorizontalAlign(Component.CENTER);
        fieldRowConstraint.setVerticalAlign(Component.CENTER);
        fieldsContainer.setLayout(imageTableLayout);
        fieldsContainer.getStyle().setBgTransparency(225);
        fieldsContainer.getUnselectedStyle().setBgTransparency(225);
        fieldsContainer.getSelectedStyle().setBgTransparency(225);
//        fieldsContainer.getStyle().setBgColor(Styles.getGray());
//        fieldsContainer.getUnselectedStyle().setBgColor(Styles.getGray());
//        fieldsContainer.getSelectedStyle().setBgColor(Styles.getGray());
        fieldsContainer.setUIID("logInContainer");
        fieldsContainer.setLayout(fieldTableLayout);
        fieldsContainer.getStyle().setPadding(20,20,0,0);




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

        //Home page Image
        Label carImage = new Label();
        carImage.setIcon(theme.getImage("carImage.png"));


        //Home page Image
        Label shipImage = new Label();
        shipImage.setIcon(theme.getImage("shipImage.png"));


        //Home page Image
        Label fireImage = new Label();
        fireImage.setGap(0);
        fireImage.setIcon(theme.getImage("fireImage.png"));

        //Home page Image
        Label travelImage = new Label();
        travelImage.setGap(0);
        travelImage.setIcon(theme.getImage("travelImage.png"));


        imageContainer.addComponent(imageRowConstraint,carImage);
        imageContainer.addComponent(imageRowConstraint,shipImage);
        imageContainer.addComponent(imageRowConstraint,fireImage);
        imageContainer.addComponent(imageRowConstraint,travelImage);


        f.addComponent(BorderLayout.CENTER, imageContainer);


        //text fields
        TextField userName = new TextField();
        userName.setHint("Username");
        userName.getStyle().setPadding(10,10,0,0);
        userName.getUnselectedStyle().setPadding(10,10,0,0);
        userName.getSelectedStyle().setPadding(10,10,0,0);
        userName.getPressedStyle().setPadding(10,10,0,0);
        userName.setRowsGap(0);
        TextField passWord = new TextField();
        passWord.getStyle().setPadding(10,10,0,0);
        passWord.getUnselectedStyle().setPadding(10,10,0,0);
        passWord.getSelectedStyle().setPadding(10,10,0,0);
        passWord.getPressedStyle().setPadding(10,10,0,0);
        passWord.setConstraint(TextField.PASSWORD);
        passWord.setHint("Password");

        //login Button
        final Button loginButton = new Button();
        loginButton.setUIID("logInButton");
        loginButton.setIcon(theme.getImage("login.png"));


        fieldsContainer.addComponent(fieldRowConstraint,userName);
        fieldsContainer.addComponent(fieldRowConstraint,passWord);
        fieldsContainer.addComponent(fieldRowConstraint,loginButton);


        f.addComponent(BorderLayout.SOUTH, fieldsContainer);



        ActionListener action = new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                HomePage homePage = new HomePage(f);
                homePage.createPage();

            }
        };

        loginButton.addActionListener(action);


        f.show();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }

    public void destroy() {
    }
}