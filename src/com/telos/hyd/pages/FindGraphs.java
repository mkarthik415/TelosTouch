package com.telos.hyd.pages;

import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;

import java.io.IOException;

/**
 * Created by karthikmarupeddi on 6/6/15.
 */
public class FindGraphs {

    Form grapghsHomePageForm;
    Resources theme;

    FindGraphs() {

        try {
            this.theme = Resources.openLayered("/theme");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void createPage() {
        grapghsHomePageForm = new Form();
        grapghsHomePageForm.setScrollable(false);
        grapghsHomePageForm.setLayout(new BorderLayout());


        // Banner container
        Container bannerContainer = new Container();
        TableLayout bannerTableLayout = new TableLayout(1, 1);
        TableLayout.Constraint rowConstraint = bannerTableLayout.createConstraint();
        rowConstraint.setWidthPercentage(100);
        rowConstraint.setHorizontalAlign(Component.CENTER);
        rowConstraint.setVerticalAlign(Component.CENTER);
        bannerContainer.setUIID("bannerContainer");
        bannerContainer.setLayout(bannerTableLayout);
        bannerContainer.getStyle().setBgTransparency(225);
        bannerContainer.getUnselectedStyle().setBgTransparency(255);
        bannerContainer.getSelectedStyle().setBgTransparency(255);

        //Banner
        Label banner = new Label();
        banner.getStyle().setBgTransparency(0);
        banner.getUnselectedStyle().setBgTransparency(0);
        banner.getSelectedStyle().setBgTransparency(0);
        banner.setGap(0);
        banner.setIcon(theme.getImage("telosLogo.png"));
        bannerContainer.addComponent(rowConstraint, banner);
        grapghsHomePageForm.addComponent(BorderLayout.NORTH, bannerContainer);


        grapghsHomePageForm.show();
    }

}
