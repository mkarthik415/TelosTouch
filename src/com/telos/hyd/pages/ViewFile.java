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



    public final Form viewFileForm = new Form();
    Form logInForm;
    Resources theme;
    Dialog dialog;
    Button selectTypeComboBox;



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
        Label periodLabel = new Label("Select Type");
        ComboBox<String> periodComboBox = new ComboBox();
        periodComboBox.addItem("By Month");
        periodComboBox.addItem("Yearly");


        //Row #3
        Label compareLabel = new Label("Compare");
        ComboBox<String> compareComboBox = new ComboBox();
        compareComboBox.addItem("Yes");
        compareComboBox.addItem("No");

        //Row #4
        Label yearLabel = new Label("Select Year");
        ComboBox<String> YearComboBox = new ComboBox();
        YearComboBox.addItem("By Month");
        YearComboBox.addItem("Yearly");



        //Adding padding
        selectTypeLabel.setUIID("clientLabel");
        selectTypeComboBox.setUIID("clientInfoLabel");



        webBrowserContainer.addComponent(selectTypeLabel);
        webBrowserContainer.addComponent(selectTypeComboBox);

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
            if (selectTypeComboBox.getText().equals("name")) {

                Styles.ButtonStylesForDialog(b, "typesClick.png", theme);

            } else
                Styles.ButtonStylesForDialog(b, "typesBlue.png", theme);
            b.setName("Name");
            b.addActionListener(searchByButtonAction);
            Button b1 = new Button();
            if (selectTypeComboBox.getText().equals("Vehical #")) {

                Styles.ButtonStylesForDialog(b1, "commissionBlue.png", theme);

            } else
                Styles.ButtonStylesForDialog(b1, "commission.png", theme);
            b1.setName("Vehical #");
            b1.addActionListener(searchByButtonAction);
            Button b2 = new Button();
            if (selectTypeComboBox.getText().equals("Serial #")) {

                Styles.ButtonStylesForDialog(b2, "renewalsBlue.png", theme);

            } else
                Styles.ButtonStylesForDialog(b2, "renewals.png", theme);
            b2.setName("Serial #");
            b2.addActionListener(searchByButtonAction);
            Button b3 = new Button();
            if (selectTypeComboBox.getText().equals("Policy Date")) {

                Styles.ButtonStylesForDialog(b3, "kindsClick.png", theme);

            } else
                Styles.ButtonStylesForDialog(b3, "kindsBlue.png", theme);
            b3.setName("Policy Date");
            b3.addActionListener(searchByButtonAction);
            container.addComponent(b);
            container.addComponent(b1);
            container.addComponent(b2);
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

            Graphs graphs = new Graphs(viewFileForm);
            graphs.createPieChartForm();


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
}
