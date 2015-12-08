package com.telos.hyd.pages;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.Log;
import com.codename1.io.NetworkManager;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.codename1.util.StringUtil;
import com.telos.hyd.Styles.Styles;
import com.telos.hyd.model.Charts;
import com.telos.hyd.model.ChartsMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

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
    Label yearFromLabel;
    Label yearToLabel;



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

//        yesButton.addActionListener((e) -> {
//            yearFromLabel.setText("Compare Year From");
//            yearToLabel.setVisible(true);
//            yearToLabel.repaint();
//            selectToYearComboBox.setVisible(true);
//            selectToYearComboBox.repaint();
//        });
//
//
//
//        noButton.addActionListener((e) -> {
//            yearFromLabel.setText("Year From");
//            yearToLabel.setVisible(false);
//            yearToLabel.repaint();
//            selectToYearComboBox.setVisible(false);
//            selectToYearComboBox.repaint();
//        });


        //Row #4
        yearFromLabel = new Label("Compare Year From");
        yearFromLabel.setVisible(true);

        selectFromYearComboBox = new Button("Click here to select Year");
        selectFromYearComboBox.setUIID("Label");
        selectFromYearComboBox.addActionListener(fromYearAction);


        //Row #5
        yearToLabel = new Label("Compare Year To");
        //yearToLabel.setVisible(true);

        selectToYearComboBox = new Button("Click here to select Year");
        selectToYearComboBox.setUIID("Label");
        selectToYearComboBox.addActionListener(fromYearAction);


        //Submit Button
        submitButton = new Button("SUBMIT");
        submitButton.setUIID("submitButton");
        submitButton.addActionListener(searchAction);

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
//            if(value.equals(TYPE_OF_POLICIES))
//            {
//                TypeOfPoliciesGraph typeOfPoliciesGraph = new TypeOfPoliciesGraph(viewFileForm,new double[] { 12, 14, 11, 10, 19 });
//                typeOfPoliciesGraph.createPieChartForm();
//            }
//            else if (value.equals(COMMISSION_AMOUNT_EARNED))
//            {
//                Graphs graphs = new Graphs(viewFileForm);
//                 graphs.createPieChartForm();
//            }
//            else if (value.equals(MISSED_RENEWALS))
//            {
//                Graphs graphs = new Graphs(viewFileForm);
//                graphs.createPieChartForm();
//            }
//            else if (value.equals(KINDS_OF_POLICIES))
//            {
//                Graphs graphs = new Graphs(viewFileForm);
//                graphs.createPieChartForm();
//            }


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


    ActionListener   searchAction = new ActionListener() {


        /**
         * Invoked when an action occurred on a component
         *
         * @param evt event object describing the source of the action as well as
         *            its trigger
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
            final ChartsMapper chartsMapper = new ChartsMapper();

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

                    java.util.List<Double> priYearValuesList = null;
                    java.util.List<Double> compYearValuesList = null;

                    ArrayList<Charts> dataForNextYear = null;
                    ArrayList<Charts> dataForFirstYear = null;

                    String fromYearComboBox = StringUtil.replaceAll(selectFromYearComboBox.getText().toString(),"Year ", "");
                    String toYearComboBox = StringUtil.replaceAll(selectToYearComboBox.getText().toString(),"Year ", "");

                    if (totalList != null) {
                        ArrayList<Charts> dataList = new ArrayList<Charts>();
                        dataForFirstYear = new ArrayList<Charts>();
                        dataForNextYear = new ArrayList<Charts>();
                        ArrayList list = (ArrayList) totalList.get("root");
                        if (list != null) {

                            for (Object object : list) {
                                Charts chartsValue = new Charts();
                                chartsMapper.readMap((Map) object, chartsValue);
                                dataList.add(chartsValue);
                            }
                        }

                        //priYearValuesList = new ArrayList<>();
                        //compYearValuesList = new ArrayList<>();

                        for (Charts charts : dataList) {
                            if (charts.getToYear().toString().equals(fromYearComboBox)) {
                                dataForFirstYear.add(charts);
                            }
                        }

                        for (Charts charts : dataList) {
                            if (charts.getToYear().toString().equals(toYearComboBox)) {
                                dataForNextYear.add(charts);
                            }
                        }
                    }
//                    Double[] doubleArray = Arrays.copyOf(priYearValuesList.toArray(), priYearValuesList.toArray().length, Double[].class);
//
//                    Double[] doubleArray1 = Arrays.copyOf(compYearValuesList.toArray(), compYearValuesList.toArray().length, Double[].class);

                    TypeOfPoliciesGraph graphForPolicies = new TypeOfPoliciesGraph(viewFileForm, dataForFirstYear, dataForNextYear);
                    graphForPolicies.createPieChartForm();
                }

            };

            try {
                if(selectTypeComboBox.getText().equals(TYPE_OF_POLICIES))
                {

                    cr.setUrl("http://telosws-poplar5.rhcloud.com/getChartTypeOfPolicies");
                }
            } catch (Exception e) {
                Log.p(e.toString());
            }
            cr.setPost(false);
            cr.addArgument("fromYear",StringUtil.replaceAll(selectFromYearComboBox.getText().toString(),"Year ", ""));
            cr.addArgument("toYear", StringUtil.replaceAll(selectToYearComboBox.getText().toString(),"Year ", ""));
            NetworkManager.getInstance().addToQueue(cr);
        }

    };


}
