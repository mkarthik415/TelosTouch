package com.telos.hyd.pages;

import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.Styles;

import java.io.IOException;

/**
 * Created by karthikmarupeddi on 6/11/15.
 */
public class ViewFile {



    public final Form viewFileForm = new Form();
    Form logInForm;
    Resources theme;



    public ViewFile(Form form)
    {
        this.logInForm = form;
        try {
            this.theme = Resources.openLayered("/theme");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createPage() throws IOException {
        viewFileForm.setScrollable(false);
        Toolbar toolbar = new Toolbar();
        toolbar.getStyle().setPadding(30, 0, 0, 0);
        viewFileForm.setToolBar(toolbar);


        Command cmdTelos = new Command("Telos Broking and Services Private Limited");
        cmdTelos.setIcon(theme.getImage("telosLogoBlue.png"));
        toolbar.addCommandToSideMenu(cmdTelos);


        Command cmdSearch = new Command("Search");
        cmdSearch.setIcon(theme.getImage("searchSmall.png"));
        toolbar.addCommandToSideMenu(cmdSearch);

        Command cmdGraph = new Command("Graph");
        cmdGraph.setIcon(theme.getImage("graphSmall.png"));
        toolbar.addCommandToSideMenu(cmdGraph);

        Command cmdContact = new Command("Contact");
        cmdContact.setIcon(theme.getImage("contactSmall.png"));
        toolbar.addCommandToSideMenu(cmdContact);

        Command cmdLocate = new Command("Locate");
        cmdLocate.setIcon(theme.getImage("locateSmall.png"));
        toolbar.addCommandToSideMenu(cmdLocate);

        Command cmdHelp = new Command("Help");
        cmdHelp.setIcon(theme.getImage("helpSmall.png"));
        toolbar.addCommandToSideMenu(cmdHelp);




        Container toolbarContainer = new Container();
        toolbarContainer.setUIID("logInContainer");
        toolbarContainer.setScrollable(false);
        //TableLayout toolbarContainerLayout = new TableLayout(1, 3);
        TableLayout toolbarContainerLayout = new TableLayout(1, 2);
        toolbarContainer.setLayout(toolbarContainerLayout);

        //constraint for text field
        TableLayout.Constraint toolbarConstraint = toolbarContainerLayout.createConstraint();
        toolbarConstraint.setWidthPercentage(-2);



        Container container = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        container.getStyle().setBgImage(theme.getImage("searchBgImg.png"));
        container.getStyle().setPadding(Component.TOP, 12);
        container.getStyle().setPadding(Component.BOTTOM, 10);
        container.getStyle().setPadding(Component.RIGHT, 5);
        container.getStyle().setPadding(Component.LEFT, 5);


        Label touchTelosLabel  = new Label("TouchTelos");
        container.addComponent(touchTelosLabel);
        toolbarContainer.addComponent(toolbarConstraint, container);


        Container contantContainer  = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        contantContainer.setUIID("tabContainer");
        viewFileForm.addComponent(contantContainer);
        contantContainer.setScrollableY(false);


        Container fieldContainer = new Container();
        TableLayout layout = new TableLayout(1, 2);
        fieldContainer.setLayout(layout);
        contantContainer.addComponent(fieldContainer);
        toolbar.setTitleComponent(toolbarContainer);

        //back button
        com.codename1.ui.Button backButton = new Button();
        backButton.setGap(0);
        Styles.ButtonStyles(backButton, "backWhite.png", theme);
        backButton.addActionListener(backButtonAction);
        fieldContainer.addComponent(backButton);


        Label clientFoundLabel = new Label();
        clientFoundLabel.setText("Charts");
        Container foundContainer = new Container(new BorderLayout());
        TableLayout tableLayout = new TableLayout(1,1);
        foundContainer.setLayout(tableLayout);
        TableLayout.Constraint rowConstraint = tableLayout.createConstraint();
        rowConstraint.setWidthPercentage(100);
        rowConstraint.setHorizontalAlign(Component.CENTER);
        rowConstraint.setVerticalAlign(Component.CENTER);
        rowConstraint.setVerticalSpan(3);
        foundContainer.getStyle().setBgTransparency(225);
        foundContainer.getStyle().setBgColor(0xffffffff);
        foundContainer.getUnselectedStyle().setBgColor(0xffffffff);
        foundContainer.getSelectedStyle().setBgColor(0xffffffff);
        foundContainer.addComponent(rowConstraint, clientFoundLabel);
        fieldContainer.addComponent(toolbarConstraint, foundContainer);

        toolbarConstraint.setWidthPercentage(-2);

        //tabs Container
        Container webBrowserContainer = new Container();
        TableLayout webBrowserTableLayout = new TableLayout(5, 2);
        webBrowserContainer.setLayout(webBrowserTableLayout);

        Label selectTypeLabel = new Label("Select Type");
        ComboBox<String> selectTypeComboBox = new ComboBox<>();
        selectTypeComboBox.addItem("Types Of Policies");
        selectTypeComboBox.addItem("Commission Amount");
        selectTypeComboBox.addItem("Renewals");
        selectTypeComboBox.addItem("Kinds of Policies");


        contantContainer.addComponent(selectTypeLabel);
        contantContainer.addComponent(selectTypeComboBox);



        viewFileForm.show();

    }





    ActionListener backButtonAction = new ActionListener() {

        /**
         * Invoked when an action occurred on a component
         *
         * @param evt event object describing the source of the action as well as
         *            its trigger
         */
        @Override
        public void actionPerformed(ActionEvent evt) {

            logInForm.showBack();
        }
    };
}
