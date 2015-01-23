package com.telos.hyd.pages;

import com.codename1.components.WebBrowser;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import com.codename1.ui.*;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.List;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.model.Client;
import com.telos.hyd.model.ClientMapper;

import com.telos.hyd.renderers.SearchRenderer;
import com.telos.hyd.standard.Styles;
import java.io.ByteArrayInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by karthikmarupeddi on 10/11/14.
 */
public class SearchPage{

    Form logInForm;
    Resources theme;
    Button searchBy = new Button();
    Dialog dialog;
    TextField searchInput;
    ArrayList<Client> totalclients;
    List dataList;
    Container contantContainer;
    Container tabelContainer = new Container();
    public final static Form  searchPageForm = new Form();
    public SearchPage(Form form)
    {
        this.logInForm = form;
        try {
            this.theme = Resources.openLayered("/theme");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createPage() throws IOException {
        searchPageForm.setScrollable(false);
        BoxLayout boxLayout = new BoxLayout(BoxLayout.X_AXIS);
        searchPageForm.setLayout(boxLayout);


        Toolbar toolbar = new Toolbar();
        searchPageForm.setToolBar(toolbar);


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

        //toolbar.addCommandToSideMenu(cmdTelos);
        Container toolbarContainer = new Container();
        toolbarContainer.setUIID("logInContainer");
        toolbarContainer.setScrollable(false);
        TableLayout toolbarContainerLayout = new TableLayout(1, 2);
        toolbarContainer.setLayout(toolbarContainerLayout);

        //constraint for text field
        TableLayout.Constraint toolbarConstraint = toolbarContainerLayout.createConstraint();
        toolbarConstraint.setWidthPercentage(-2);



        toolbarContainer.addComponent(searchBy);



        //Add Label to search Field container
        searchBy.getStyle().setBgImage(theme.getImage("searchBgImg.png"));
        searchBy.getStyle().setPadding(Component.LEFT, 13);
        searchBy.getStyle().setPadding(Component.RIGHT,10);
        searchBy.getUnselectedStyle().setBgImage(theme.getImage("searchBgImg.png"));
        searchBy.getUnselectedStyle().setPadding(Component.LEFT,13);
        searchBy.getUnselectedStyle().setPadding(Component.RIGHT,10);
        searchBy.getSelectedStyle().setBgImage(theme.getImage("searchBgImg.png"));
        searchBy.getSelectedStyle().setPadding(Component.LEFT,13);
        searchBy.getSelectedStyle().setPadding(Component.RIGHT,10);
        searchBy.getPressedStyle().setBgImage(theme.getImage("searchBgImg.png"));
        searchBy.getPressedStyle().setPadding(Component.LEFT,13);
        searchBy.getPressedStyle().setPadding(Component.RIGHT,10);
        searchBy.addActionListener(action);


        Container container = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        container.getStyle().setBgImage(theme.getImage("searchBgImg.png"));
        container.getStyle().setPadding(Component.TOP,12);
        container.getStyle().setPadding(Component.BOTTOM,10);
        container.getStyle().setPadding(Component.RIGHT,5);
        container.getStyle().setPadding(Component.LEFT,5);

        searchInput = new TextField();
        searchInput.setHeight(1000);
        searchInput.putClientProperty("searchField", Boolean.TRUE);
        searchInput.setDoneListener(searchAction);
        container.addComponent(searchInput);
        toolbarContainer.addComponent(toolbarConstraint, container);




        final TextField txt = new TextField();
        txt.setHint("Enter tag");
        toolbarContainer.addComponent(txt);

        toolbar.setTitleComponent(toolbarContainer);



        // button container
        Container buttonsContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        buttonsContainer.setName("buttonsContainer");
        buttonsContainer.getStyle().setBorder(null);
        buttonsContainer.getSelectedStyle().setBorder(Border.createEmpty());
        buttonsContainer.getUnselectedStyle().setBorder(Border.createEmpty());
        buttonsContainer.getPressedStyle().setBorder(Border.createEmpty());
        searchPageForm.addComponent(buttonsContainer);

        contantContainer  = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        contantContainer.getStyle().setBgTransparency(225);
        contantContainer.getStyle().setBgColor(0xffcccccc);
        contantContainer.getUnselectedStyle().setBgColor(0xffcccccc);
        contantContainer.getSelectedStyle().setBgColor(0xffcccccc);
        searchPageForm.addComponent(contantContainer);


        //Container for search filed and others
        Container fieldContainer = new Container();
        fieldContainer.setScrollable(false);
        TableLayout layout = new TableLayout(1, 2);

       //constraint for text field
        TableLayout.Constraint constraint = layout.createConstraint();
        constraint.setWidthPercentage(-2);

        fieldContainer.setLayout(layout);
        contantContainer.addComponent(fieldContainer);

        //Headings Container
        Container HeadingContainer = new Container();
        HeadingContainer.getStyle().setPadding(10,10,10,10);
        TableLayout tableHeadingLayout = new TableLayout(1,6);
        TableLayout.Constraint rowHeadingConstraint = tableHeadingLayout.createConstraint();
        rowHeadingConstraint.setWidthPercentage(17);
        rowHeadingConstraint.setHorizontalAlign(Component.CENTER);
        rowHeadingConstraint.setVerticalAlign(Component.BOTTOM);
        HeadingContainer.setLayout(tableHeadingLayout);
        Label searchLabel = new Label("Serial #");
        searchLabel.getStyle().setBgTransparency(0);
        searchLabel.getUnselectedStyle().setBgTransparency(0);
        searchLabel.getSelectedStyle().setBgTransparency(0);
        HeadingContainer.addComponent(rowHeadingConstraint, searchLabel);
        HeadingContainer.addComponent(rowHeadingConstraint,new Label("Name"));
        HeadingContainer.addComponent(rowHeadingConstraint,new Label("Department"));
        HeadingContainer.addComponent(rowHeadingConstraint,new Label("Policy #"));
        HeadingContainer.addComponent(rowHeadingConstraint,new Label("Start Date"));
        HeadingContainer.addComponent(rowHeadingConstraint,new Label("Company"));
        contantContainer.addComponent(HeadingContainer);

//        WebBrowser b = new WebBrowser();
//
//        b.setURL("http://research.microsoft.com/pubs/79655/gazelle.pdf");
//        contantContainer.addComponent(b);


        //
        Styles.ButtonStylesForCell(searchBy, "Search By", this.theme);
        searchBy.getStyle().setPadding(0,0,10,0);
        searchBy.getUnselectedStyle().setPadding(0,0,10,0);
        searchBy.getSelectedStyle().setPadding(0,0,10,0);

        contantContainer.addComponent(tabelContainer);



        //back button
        com.codename1.ui.Button backButton = new Button();
        backButton.setGap(0);
        Styles.ButtonStyles(backButton, "backWhite.png", theme);
        backButton.addActionListener(backButtonAction);
        fieldContainer.addComponent(backButton);


        Label clientFoundLabel = new Label();
        clientFoundLabel.setText("Search Results");
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
        foundContainer.addComponent(rowConstraint,clientFoundLabel);
        fieldContainer.addComponent(constraint,foundContainer);

        searchPageForm.show();
    }



    ActionListener action = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {

            dialog = new Dialog();
            Container container= new Container();
            container.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
            Button b = new Button();
            Styles.ButtonStyles(b, "name.png", theme);
            b.setName("Name");
            b.addActionListener(searchByButtonAction);
            Button b1 = new Button();
            Styles.ButtonStyles(b1, "carNumber.png", theme);
            b1.setName("Vehical #");
            b1.addActionListener(searchByButtonAction);
            Button b2 = new Button();
            Styles.ButtonStyles(b2, "serialNumber.png.png", theme);
            b2.setName("Serial #");
            b2.addActionListener(searchByButtonAction);
            Button b3 = new Button();
            Styles.ButtonStyles(b3, "policyIssue.png", theme);
            b3.setName("Policy Date");
            b3.addActionListener(searchByButtonAction);
            Button b4 = new Button();
            Styles.ButtonStyles(b4, "policyCertificate.png", theme);
            b4.setName("Policy #");
            b4.addActionListener(searchByButtonAction);
            Button b5 = new Button();
            Styles.ButtonStyles(b5, "telephoneNumber.png", theme);
            b5.setName("Telephone #");
            b5.addActionListener(searchByButtonAction);
            container.addComponent(b);
            container.addComponent(b1);
            container.addComponent(b2);
            container.addComponent(b3);
            container.addComponent(b4);
            container.addComponent(b5);
            container.getStyle().setBgTransparency(225);
            container.getUnselectedStyle().setBgTransparency(225);
            container.getSelectedStyle().setBgTransparency(225);
            dialog.addComponent(container);
            //dialog.show();
            dialog.showPopupDialog(searchBy);

        }
    };

    ActionListener searchByButtonAction = new ActionListener() {

        /**
         * Invoked when an action occurred on a component
         *
         * @param evt event object describing the source of the action as well as
         *            its trigger
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
                dialog.dispose();
            dataList = new List();
            dataList.setItemGap(0);
            tabelContainer.removeAll();
            tabelContainer.setScrollable(true);
            tabelContainer.setLayout(new BorderLayout());
            tabelContainer.addComponent(BorderLayout.NORTH,dataList);

                String value = evt.getComponent().getName();
                searchBy.setText(value);
                final ClientMapper clientMapper = new ClientMapper();

                ConnectionRequest cr = new ConnectionRequest() {
                protected void readResponse(InputStream is)
                        throws IOException {

                    JSONParser p = new JSONParser();
                    Map<String,Object> totalList = p.parseJSON(new InputStreamReader(is));
                    ArrayList list = (ArrayList) totalList.get("root");
                    for(Object object : list)
                    {
                        Client clientValues = new Client();
                        clientMapper.readMap((Map) object,clientValues);
                        System.out.println("client values are"+clientValues.getName());
                        dataList.addItem(clientValues);
                    }


                    dataList.setRenderer(new SearchRenderer());
                    searchPageForm.show();
                }
            };
            cr.setPost(false);
            try {
                cr.setUrl("http://localhost:8080/Connect2Teloshyd/ws/telos/findClientByName/rajesh");
            } catch (Exception e) {
                e.printStackTrace();
            }
            NetworkManager.getInstance().addToQueue(cr);


        }
    };


    ActionListener searchAction = new ActionListener() {

        /**
         * Invoked when an action occurred on a component
         *
         * @param evt event object describing the source of the action as well as
         *            its trigger
         */
        @Override
        public void actionPerformed(ActionEvent evt) {
            Dialog d = new Dialog("text value is"+searchInput.getText());
            d.show();
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
