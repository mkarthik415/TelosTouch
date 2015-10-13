package com.telos.hyd.pages;

import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.Styles;

import java.io.IOException;

/**
 * Created by karthikmarupeddi on 6/11/15.
 */
public class ViewFile {


    public static final String TYPE_OF_POLICIES = "Type Of Policies";
    public static final String COMMISSION_AMOUNT_EARNED = "Commission Amount Earned";
    public static final String RENEWALS_RECEIVED = "Renewals Received";
    public static final String KINDS_OF_POLICIES = "Kinds Of Policies";
    public static final String MISSED_RENEWALS = "Missed Renewals";
    public final Form viewFileForm = new Form();
    Form logInForm;
    Resources theme;
    Dialog dialog;
    Button selectTypeComboBox;
    Button selectFromYearComboBox;
    Button selectToYearComboBox;
    Button monthButton;
    Button yearButton;
    Button yesButton;
    Button noButton;
    Button submitButton;



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
        Container contantContainer = PageTemplate.getContainer(PageTemplate.setBackButton(logInForm), theme, viewFileForm);

        //tabs Container
        Container webBrowserContainer = new Container();
        webBrowserContainer.setUIID("tabContainer");
        BoxLayout pContainerBoxLayout = new BoxLayout(BoxLayout.Y_AXIS);
        webBrowserContainer.setLayout(pContainerBoxLayout);


        //Row #1
        Label selectTypeLabel = new Label("Select Type");
        selectTypeComboBox = new Button("Click Here to Select Type");
        selectTypeComboBox.setUIID("Label");
        selectTypeComboBox.addActionListener(action);

        //Row #2
        Label periodLabel = new Label("Select Period");
        periodLabel.setVisible(true);
        Container buttonContainer = new Container();
        BoxLayout bContainerBoxLayout = new BoxLayout(BoxLayout.X_AXIS);
        buttonContainer.setLayout(bContainerBoxLayout);
        buttonContainer.getUnselectedStyle().setPadding(5,40,10,10);
        buttonContainer.getSelectedStyle().setPadding(5, 40, 10, 10);
        buttonContainer.getPressedStyle().setPadding(5, 40, 10, 10);
        buttonContainer.getDisabledStyle().setPadding(5,40,10,10);

        monthButton = new Button();
        yearButton = new Button();

        Styles.ButtonStyles(monthButton, "byMonthWhite.png", theme);
        monthButton.addActionListener(MonthlyAction);

        Styles.ButtonStyles(yearButton, "yearlyBlue.png", theme);
        yearButton.addActionListener(yearlyAction);

        buttonContainer.addComponent(yearButton);
        buttonContainer.addComponent(monthButton);

        //Row #3
        Label compareLabel = new Label("Compare");
        compareLabel.setUIID("Label");
        compareLabel.setVisible(true);
        Container compareButtonContainer = new Container();
        BoxLayout compareButtonBoxLayout = new BoxLayout(BoxLayout.X_AXIS);
        compareButtonContainer.setLayout(compareButtonBoxLayout);
        compareButtonContainer.getUnselectedStyle().setPadding(5,40,10,10);
        compareButtonContainer.getSelectedStyle().setPadding(5, 40, 10, 10);
        compareButtonContainer.getPressedStyle().setPadding(5, 40, 10, 10);
        compareButtonContainer.getDisabledStyle().setPadding(5,40,10,10);


        yesButton = new Button();
        noButton = new Button();

        Styles.ButtonStyles(yesButton, "yesBlue.png", theme);
        yesButton.addActionListener(yesAction);

        Styles.ButtonStyles(noButton, "noWhite.png", theme);
        noButton.addActionListener(noAction);

        compareButtonContainer.addComponent(yesButton);
        compareButtonContainer.addComponent(noButton);


        //Row #4
        Label yearFromLabel = new Label("Compare Year From");
        yearFromLabel.setVisible(true);

        selectFromYearComboBox = new Button("Click here to select Year");
        selectFromYearComboBox.setUIID("Label");
        selectFromYearComboBox.addActionListener(fromYearAction);


        //Row #5
        Label yearToLabel = new Label("Compare Year To");
        yearToLabel.setVisible(true);

        selectToYearComboBox = new Button("Click here to select Year");
        selectToYearComboBox.setUIID("Label");
        selectToYearComboBox.addActionListener(fromYearAction);


        //Submit Button
        submitButton = new Button("SUBMIT");
        submitButton.setUIID("submitButton");

        //Adding padding
        selectTypeLabel.setUIID("clientLabel");
        selectTypeComboBox.setUIID("clientInfoLabel");

        periodLabel.setUIID("clientLabel");
        compareLabel.setUIID("clientLabel");
        yearFromLabel.setUIID("clientLabel");
        yearToLabel.setUIID("clientLabel");

        selectFromYearComboBox.setUIID("clientInfoLabel");
        selectToYearComboBox.setUIID("clientInfoLabel");

        webBrowserContainer.addComponent(selectTypeLabel);
        webBrowserContainer.addComponent(selectTypeComboBox);

        //Add Row#2
        webBrowserContainer.addComponent(periodLabel);
        webBrowserContainer.addComponent(buttonContainer);

        //Add Row#3
        webBrowserContainer.addComponent(compareLabel);
        webBrowserContainer.addComponent(compareButtonContainer);

        //Add Row#4
        webBrowserContainer.addComponent(yearFromLabel);
        webBrowserContainer.addComponent(selectFromYearComboBox);

        //Add Row#5
        webBrowserContainer.addComponent(yearToLabel);
        webBrowserContainer.addComponent(selectToYearComboBox);

        //Add Submit Button
        webBrowserContainer.addComponent(submitButton);


        contantContainer.addComponent(webBrowserContainer);



        viewFileForm.show();

    }



    //action for search by button.
    ActionListener action = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {

            dialog = new Dialog();
            Container container = new Container();
            container.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
            Button b = new Button();
            if (selectTypeComboBox.getText().equals(TYPE_OF_POLICIES)) {

                Styles.ButtonStylesForDialog(b, "typesOfCheck.png", theme);

            } else
                Styles.ButtonStylesForDialog(b, "typesOfPolicies.png", theme);
            b.setName(TYPE_OF_POLICIES);
            b.addActionListener(searchByButtonAction);
            Button b1 = new Button();
            if (selectTypeComboBox.getText().equals(COMMISSION_AMOUNT_EARNED)) {

                Styles.ButtonStylesForDialog(b1, "commisionCheck.png", theme);

            } else
                Styles.ButtonStylesForDialog(b1, "commissionAmount.png", theme);
            b1.setName(COMMISSION_AMOUNT_EARNED);
            b1.addActionListener(searchByButtonAction);
            Button b2 = new Button();
            if (selectTypeComboBox.getText().equals(RENEWALS_RECEIVED)) {

                Styles.ButtonStylesForDialog(b2, "renewalsCheck.png", theme);

            } else
                Styles.ButtonStylesForDialog(b2, "renewals.png", theme);
            b2.setName(RENEWALS_RECEIVED);
            b2.addActionListener(searchByButtonAction);
            Button b3 = new Button();
            if (selectTypeComboBox.getText().equals(KINDS_OF_POLICIES)) {

                Styles.ButtonStylesForDialog(b3, "kindsOfCheck.png", theme);

            } else
                Styles.ButtonStylesForDialog(b3, "kindsOfPolicies.png", theme);
            b3.setName(KINDS_OF_POLICIES);
            b3.addActionListener(searchByButtonAction);
            Button b4 = new Button();
            if (selectTypeComboBox.getText().equals(MISSED_RENEWALS)) {

                Styles.ButtonStylesForDialog(b4, "missedCheck.png", theme);

            } else
                Styles.ButtonStylesForDialog(b2, "missedRenewals.png", theme);
            b4.setName(MISSED_RENEWALS);
            b4.addActionListener(searchByButtonAction);
            container.addComponent(b);
            container.addComponent(b1);
            container.addComponent(b2);
            container.addComponent(b4);
            container.addComponent(b3);
            container.getStyle().setBgTransparency(0);
            container.getUnselectedStyle().setBgTransparency(0);
            container.getSelectedStyle().setBgTransparency(0);
            dialog.addComponent(container);
            dialog.getStyle().setBgTransparency(0);
            dialog.getUnselectedStyle().setBgTransparency(0);
            dialog.getSelectedStyle().setBgTransparency(0);
            dialog.getDialogStyle().setBgTransparency(0);
            //dialog.show();
            dialog.showPopupDialog(selectTypeComboBox);

        }
    };


    ActionListener  searchByButtonAction= new ActionListener() {

        /**
         * Invoked when an action occurred on a component
         *
         * @param evt event object describing the source of the action as well as
         *            its trigger
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
            dialog.dispose();
            String value = evt.getComponent().getName();
            selectTypeComboBox.setText(value);
            if(value.equals(TYPE_OF_POLICIES))
            {
                TypeOfPoliciesGraph typeOfPoliciesGraph = new TypeOfPoliciesGraph(viewFileForm);
                typeOfPoliciesGraph.createPieChartForm();
            }
            else if (value.equals(COMMISSION_AMOUNT_EARNED))
            {
                Graphs graphs = new Graphs(viewFileForm);
                 graphs.createPieChartForm();
            }
            else if (value.equals(MISSED_RENEWALS))
            {
                Graphs graphs = new Graphs(viewFileForm);
                graphs.createPieChartForm();
            }
            else if (value.equals(KINDS_OF_POLICIES))
            {
                Graphs graphs = new Graphs(viewFileForm);
                graphs.createPieChartForm();
            }


        }
    };


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


    ActionListener  MonthlyAction= new ActionListener() {

        /**
         * Invoked when an action occurred on a component
         *
         * @param evt event object describing the source of the action as well as
         *            its trigger
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
            Styles.ButtonStyles(monthButton, "byMonthBlue.png", theme);
            Styles.ButtonStyles(yearButton, "yearlyWhite.png", theme);
        }
    };

    ActionListener yearlyAction = new ActionListener() {

        /**
         * Invoked when an action occurred on a component
         *
         * @param evt event object describing the source of the action as well as
         *            its trigger
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
            Styles.ButtonStyles(monthButton, "byMonthWhite.png", theme);
            Styles.ButtonStyles(yearButton, "yearlyBlue.png", theme);
        }
    };





    ActionListener  yesAction= new ActionListener() {

        /**
         * Invoked when an action occurred on a component
         *
         * @param evt event object describing the source of the action as well as
         *            its trigger
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
            Styles.ButtonStyles(yesButton, "yesBlue.png", theme);
            Styles.ButtonStyles(noButton, "noWhite.png", theme);
        }
    };

    ActionListener noAction = new ActionListener() {

        /**
         * Invoked when an action occurred on a component
         *
         * @param evt event object describing the source of the action as well as
         *            its trigger
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
            Styles.ButtonStyles(yesButton, "yesWhite.png", theme);
            Styles.ButtonStyles(noButton, "noBlue.png", theme);
        }
    };



    ActionListener fromYearAction = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {

            Button sourceComponent = (Button) evt.getSource();
            dialog = new Dialog();

            Container container = new Container();
            container.setLayout(new BoxLayout(BoxLayout.Y_AXIS));

            Container layeredContainer = Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "topButton.png", "Year 2010");
            Container bottomLayeredContainer = Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "bottomButton.png", "Year 2015");

            container.addComponent(layeredContainer);
            for(int i=2011;i<=2014;i++)
            {
                container.addComponent(Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "middleButton.png", "Year "+i));
            }
            container.addComponent(bottomLayeredContainer);


            container.getStyle().setBgTransparency(0);
            container.getUnselectedStyle().setBgTransparency(0);
            container.getSelectedStyle().setBgTransparency(0);
            dialog.addComponent(container);
            dialog.getStyle().setBgTransparency(0);
            dialog.getUnselectedStyle().setBgTransparency(0);
            dialog.getSelectedStyle().setBgTransparency(0);
            dialog.getDialogStyle().setBgTransparency(0);
            dialog.showPopupDialog(sourceComponent);

        }
    };



}
