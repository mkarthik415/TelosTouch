package com.telos.hyd.pages;

import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.TouchTelos;
import com.telos.hyd.Styles.Styles;

import java.io.IOException;

/**
 * Created by karthikmarupeddi on 9/27/14.
 */
public class HomePage {

Form logInForm;
    Resources theme;
   public HomePage(Form form)
    {
        this.logInForm = form;
        try {
        this.theme = Resources.openLayered("/theme");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


   public void createPage()
    {
        final Form homePageForm = new Form();
        homePageForm.setScrollable(false);
        homePageForm.setLayout(new BorderLayout());

        // Banner container
        Container bannerContainer = new Container();
        TableLayout bannerTableLayout = new TableLayout(1,1);
        TableLayout.Constraint rowConstraint = bannerTableLayout.createConstraint();
        rowConstraint.setWidthPercentage(100);
        rowConstraint.setHorizontalAlign(Component.CENTER);
        rowConstraint.setVerticalAlign(Component.CENTER);
        bannerContainer.setUIID("bannerContainer");
        bannerContainer.setLayout(bannerTableLayout);
        bannerContainer.getStyle().setBgTransparency(225);
        bannerContainer.getUnselectedStyle().setBgTransparency(255);
        bannerContainer.getSelectedStyle().setBgTransparency(255);

//        Color color = new Color(72, 90, 162);
//        int rgb = color.getRGB();
//        bannerContainer.getStyle().setBgColor(rgb);
//        bannerContainer.getUnselectedStyle().setBgColor(rgb);
//        bannerContainer.getSelectedStyle().setBgColor(rgb);

        //Banner
        Label banner = new Label();
        banner.getStyle().setBgTransparency(0);
        banner.getUnselectedStyle().setBgTransparency(0);
        banner.getSelectedStyle().setBgTransparency(0);
        banner.setGap(0);
        banner.setIcon(theme.getImage("telosLogo.png"));
        bannerContainer.addComponent(rowConstraint,banner);
        homePageForm.addComponent(BorderLayout.NORTH, bannerContainer);


        Container buttonsContainer = new Container();
        TableLayout imageTableLayout = new TableLayout(3,2);
        TableLayout.Constraint buttonRowConstraint = imageTableLayout.createConstraint();
        buttonRowConstraint.setWidthPercentage(50);
        buttonRowConstraint.setHeightPercentage(33);
        buttonRowConstraint.setHorizontalAlign(Component.CENTER);
        buttonRowConstraint.setVerticalAlign(Component.CENTER);
        buttonsContainer.setLayout(imageTableLayout);
        buttonsContainer.getStyle().setBgTransparency(225);
        buttonsContainer.getUnselectedStyle().setBgTransparency(225);
        buttonsContainer.getSelectedStyle().setBgTransparency(225);
        buttonsContainer.getStyle().setBgColor(0xffffff);
        buttonsContainer.getUnselectedStyle().setBgColor(0xffffff);
        buttonsContainer.getSelectedStyle().setBgColor(0xffffff);


        //search Button
        final Button searchButton = new Button();
        searchButton.setGap(0);
        Styles.ButtonStyles(searchButton, "searchButton.png", theme);


        //report Button
        final Button reportButton = new Button();
        reportButton.setGap(0);
        Styles.ButtonStyles(reportButton, "reportButton.png", theme);

        //graph Button
        final Button graphButton = new Button();
        graphButton.setGap(0);
        Styles.ButtonStyles(graphButton, "graphButton.png", theme);


        //contact Button
        final Button contactButton = new Button();
        contactButton.setGap(0);
        Styles.ButtonStyles(contactButton, "contactButton.png", theme);

        //locate Button
        final Button locateButton = new Button();
        locateButton.setGap(0);
        Styles.ButtonStyles(locateButton, "locateButton.png", theme);


        //help Button
        final Button helpButton = new Button();
        helpButton.setGap(0);
        Styles.ButtonStyles(helpButton, "helpButton.png 1", theme);


        buttonsContainer.addComponent(buttonRowConstraint,searchButton);
        buttonsContainer.addComponent(buttonRowConstraint,reportButton);
        buttonsContainer.addComponent(buttonRowConstraint,graphButton);
        buttonsContainer.addComponent(buttonRowConstraint,contactButton);
        buttonsContainer.addComponent(buttonRowConstraint,locateButton);
        buttonsContainer.addComponent(buttonRowConstraint,helpButton);

        homePageForm.addComponent(BorderLayout.CENTER, buttonsContainer);


        Container detailsContainer = new Container(new BoxLayout(BoxLayout.X_AXIS));

        Container imageContainer = new Container();
        TableLayout picTableLayout = new TableLayout(1,1);
        imageContainer.setLayout(picTableLayout);
        TableLayout.Constraint picTableLayoutConstraint = picTableLayout.createConstraint();
        picTableLayoutConstraint.setHorizontalAlign(Component.CENTER);
        picTableLayoutConstraint.setVerticalAlign(Component.CENTER);
        Label pic = new Label();
        pic.getStyle().setBgTransparency(0);
        pic.getUnselectedStyle().setBgTransparency(0);
        pic.getSelectedStyle().setBgTransparency(0);
        pic.setGap(0);
        pic.setIcon(theme.getImage("karthikPhoto.png"));
        imageContainer.addComponent(picTableLayoutConstraint,pic);
        pic.getStyle().setPadding(10,0,10,0);
        detailsContainer.addComponent(imageContainer);


        Container nameContainer = new Container();
        TableLayout namedTableLayout = new TableLayout(1,1);
        nameContainer.setLayout(namedTableLayout);
        TableLayout.Constraint fieldRowConstraint = namedTableLayout.createConstraint();
        fieldRowConstraint.setHorizontalAlign(Component.CENTER);
        fieldRowConstraint.setVerticalAlign(Component.CENTER);
        Label name = new Label("Karthik Marupeddi");
        name.setUIID("nameLabel");
        name.getStyle().setPadding(50,0,20,0);
        nameContainer.addComponent(fieldRowConstraint,name);
        detailsContainer.addComponent(nameContainer);


        Container statusContainer = new Container();
        TableLayout statusTableLayout = new TableLayout(3,1);
        statusContainer.setLayout(statusTableLayout);
        TableLayout.Constraint statusRowConstraint = statusTableLayout.createConstraint();
        statusRowConstraint.setHorizontalAlign(Component.RIGHT);
        statusRowConstraint.setVerticalAlign(Component.CENTER);
        statusRowConstraint.setWidthPercentage(-2);


        final Button signedIn = new Button();
        signedIn.setGap(0);
        Styles.ButtonStylesForHomePage(signedIn, "agentSign.png", theme);

        final Button account = new Button();
        account.setGap(0);
        Styles.ButtonStylesForHomePage(account, "manageAccount.png", theme);

        final Button signOut = new Button();
        signOut.setGap(0);
        Styles.ButtonStylesForHomePage(signOut, "signOut.png", theme);


        statusContainer.addComponent(statusRowConstraint, signedIn);
        statusContainer.addComponent(statusRowConstraint, account);
        statusContainer.addComponent(statusRowConstraint, signOut);
        detailsContainer.addComponent(statusContainer);
        detailsContainer.setUIID("logInContainer");




        homePageForm.addComponent(BorderLayout.SOUTH, detailsContainer);
        homePageForm.show();



        ActionListener action = new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                SearchPage searchPage = new SearchPage(homePageForm);
                try {
                    searchPage.createPage();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        };


        ActionListener logOff = new ActionListener() {

            public void actionPerformed(ActionEvent evt) {

                TouchTelos touchTelos = new TouchTelos();


            }
        };

        searchButton.addActionListener(action);
        signOut.addActionListener(logOff);
    }
}
