package com.telos.hyd.pages;

import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.Styles;
import com.telos.hyd.model.Client;

import java.io.IOException;

/**
 * Created by karthikmarupeddi on 12/31/14.
 */
public class ClientPage {

    Form logInForm;
    Resources theme;
    Dialog dialog;
    Client client;
    List dataList;
    Container tabelContainer;

    final Form  clientForm = new Form();
    Button searchBy = new Button();
    TextField searchInput;

    public ClientPage(Client client)
    {
        this.client = client;
        try {
            this.theme = Resources.openLayered("/theme");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createPage() throws IOException {

        clientForm.setTitle("");
        clientForm.setScrollable(false);
        BoxLayout boxLayout = new BoxLayout(BoxLayout.X_AXIS);
        clientForm.setLayout(boxLayout);
        clientForm.setScrollableY(true);


        Toolbar toolbar = new Toolbar();
        toolbar.getStyle().setPadding(30,0,0,0);
        clientForm.setToolBar(toolbar);


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
        Styles.ButtonStylesForCell(searchBy, "Search By", this.theme);
        searchBy.getStyle().setPadding(0,0,10,0);
        searchBy.getUnselectedStyle().setPadding(0,0,10,0);
        searchBy.getSelectedStyle().setPadding(0,0,10,0);
        //searchBy.addActionListener(action);

        Container container = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        container.getStyle().setBgImage(theme.getImage("searchBgImg.png"));
        container.getStyle().setPadding(Component.TOP,12);
        container.getStyle().setPadding(Component.BOTTOM,10);
        container.getStyle().setPadding(Component.RIGHT,5);
        container.getStyle().setPadding(Component.LEFT,5);

        searchInput = new TextField();
        searchInput.setHeight(1000);
        searchInput.putClientProperty("searchField", Boolean.TRUE);
        //searchInput.setDoneListener(searchAction);
        container.addComponent(searchInput);
        toolbarContainer.addComponent(toolbarConstraint, container);




        final TextField txt = new TextField();
        txt.setHint("Enter tag");
        toolbarContainer.addComponent(txt);

        toolbar.setTitleComponent(toolbarContainer);



        // Banner container
//        Container buttonsContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
//        buttonsContainer.setName("buttonsContainer");
//        buttonsContainer.getStyle().setBorder(null);
//        buttonsContainer.getSelectedStyle().setBorder(Border.createEmpty());
//        buttonsContainer.getUnselectedStyle().setBorder(Border.createEmpty());
//        buttonsContainer.getPressedStyle().setBorder(Border.createEmpty());
//        clientForm.addComponent(buttonsContainer);

        Container contantContainer  = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        contantContainer.setUIID("tabContainer");
        contantContainer.setScrollableY(true);
        contantContainer.setScrollableY(true);
        clientForm.addComponent(contantContainer);


        //Container for search filed and others
        Container fieldContainer = new Container();
        fieldContainer.setScrollableY(true);
        TableLayout layout = new TableLayout(1, 2);
        fieldContainer.setLayout(layout);
        contantContainer.addComponent(fieldContainer);



        //tabs Container
        Container tabsContainer = new Container();
        tabsContainer.setScrollableY(true);
        tabsContainer.setLayout(new BorderLayout());
        Tabs tabs = new Tabs(Component.RIGHT);


        //personal tab contents
        Container personalContainer = new Container();
        personalContainer.setUIID("tabContainer");
        BoxLayout pContainerBoxLayout = new BoxLayout(BoxLayout.Y_AXIS);
        personalContainer.setLayout(pContainerBoxLayout);

        //labels
        //name labels
        Label nameLabel = new Label("Name");
        Label clientName = new Label();
        if(client.getName() != null )
        {

            clientName.setText(client.getName());
        }
        else
            clientName.setText("N/A");



        //company labels
        Label cmpanyLabel = new Label("Company");
        Label clientCompany = new Label();
        if(client.getCompany() != null )
        {

            clientCompany.setText(client.getCompany());
        }
        else
            clientCompany.setText("N/A");



        //phone labels
        Label phoneNumberLabel = new Label("Phone Number");
        Label clientPhoneNumber = new Label();
        if(client.getPhoneNumber() != null)
        {

            clientPhoneNumber.setText(client.getPhoneNumber());
        }
        else
            clientPhoneNumber.setText("N/A");


        //DOB labels
        Label dobLabel = new Label("Date of Birth");
        Label clientDOB = new Label();
        if(client.getDob()!= null )
        {

            clientDOB.setText(client.getPhoneNumber());
        }
        else
            clientDOB.setText("N/A");


        //email labels
        Label emailLabel = new Label("Email Address");
        Label clientEmail = new Label();
        if(client.getEmail() != null )
        {

            clientEmail.setText(client.getEmail());
        }
        else
            clientEmail.setText("N/A");



        //Gender labels
        Label genderLabel = new Label("Gender");
        Label clientGender = new Label();
        if(client.getGender() != null )
        {

            clientGender.setText(client.getGender());
        }
        else
            clientGender.setText("N/A");


        //Industry labels
        Label industryLabel = new Label("Industry");
        Label clientIndustry = new Label();
        if(client.getIndustry() != null )
        {

            clientIndustry.setText(client.getIndustry());
        }
        else
            clientIndustry.setText("N/A");


        //Address labels
        Label addressLabel = new Label("Address");
        TextArea clientAddress = new TextArea();
        if(client.getAddress() != null )
        {

            clientAddress.setText(client.getAddress());
        }
        else
            clientAddress.setText("N/A");



        //Label Padding
        //name label padding
        nameLabel.setUIID("clientLabel");
        clientName.setUIID("clientInfoLabel");

        //company label padding
        cmpanyLabel.setUIID("clientLabel");
        clientCompany.setUIID("clientInfoLabel");

        //name label padding
        phoneNumberLabel.setUIID("clientLabel");
        clientPhoneNumber.setUIID("clientInfoLabel");

        //company label padding
        dobLabel.setUIID("clientLabel");
        clientDOB.setUIID("clientInfoLabel");

        //name label padding
        emailLabel.setUIID("clientLabel");
        clientEmail.setUIID("clientInfoLabel");

        //company label padding
        genderLabel.setUIID("clientLabel");
        clientGender.setUIID("clientInfoLabel");

        //name label padding
        industryLabel.setUIID("clientLabel");
        clientIndustry.setUIID("clientInfoLabel");

        //company label padding
        addressLabel.setUIID("clientLabel");
        clientAddress.setUIID("clientInfoLabel");


        personalContainer.addComponent(nameLabel);
        personalContainer.addComponent(clientName);


        personalContainer.addComponent(cmpanyLabel);
        personalContainer.addComponent(clientCompany);


        personalContainer.addComponent(phoneNumberLabel);
        personalContainer.addComponent(clientPhoneNumber);


        personalContainer.addComponent(dobLabel);
        personalContainer.addComponent(clientDOB);

        personalContainer.addComponent(emailLabel);
        personalContainer.addComponent(clientEmail);


        personalContainer.addComponent(genderLabel);
        personalContainer.addComponent(clientGender);


        personalContainer.addComponent(industryLabel);
        personalContainer.addComponent(clientIndustry);


        personalContainer.addComponent(addressLabel);
        personalContainer.addComponent(clientAddress);

        //Company Details Container
        Container companyDeatilsContainer = new Container();
        companyDeatilsContainer.setUIID("tabContainer");
        companyDeatilsContainer.setLayout(pContainerBoxLayout);

        //labels
        //policy/certificate labels
        Label policyNumber = new Label("Policy/Certificate Number");
        Label companyPolicy = new Label();
        if(client.getPolicyNumber() != null )
        {

            companyPolicy.setText(client.getPolicyNumber());
        }
        else
            companyPolicy.setText("N/A");

        //policy Start labels
        Label policyStart = new Label("Policy Starts On");
        Label companyPolicyStart = new Label();
        if(client.getPolicyStartdate() != null )
        {

            companyPolicyStart.setText(client.getPolicyStartdate().toString());
        }
        else
            companyPolicyStart.setText("N/A");

        //office Code labels
        Label officeLabel = new Label("Office Code");
        Label companyOffice = new Label();
        if(client.getOfficeCode() != null )
        {

            companyOffice.setText(client.getOfficeCode());
        }
        else
            companyOffice.setText("N/A");


        //Insurance Company labels
        Label insuranceName = new Label("Insurance Company Name");
        Label companyInsurance = new Label();
        if(client.getInsCompanyName() != null )
        {

            companyInsurance.setText(client.getInsCompanyName());
        }
        else
            companyInsurance.setText("N/A");

        //Agent labels
        Label agentLabel = new Label("Agent");
        Label companyAgent = new Label();
        if(client.getAgent() != null )
        {

            companyAgent.setText(client.getAgent());
        }
        else
            companyAgent.setText("N/A");

        //Reference labels
        Label referenceLabel = new Label("Reference");
        Label companyReference = new Label();
        if(client.getSource() != null )
        {

            companyReference.setText(client.getAgent());
        }
        else
            companyReference.setText("N/A");

        //Endrs Number labels
        Label endrsNumber = new Label("Endrs Number");
        Label companyEndrs = new Label();
        if(client.getEndrsNumber() != null )
        {

            companyEndrs.setText(client.getEndrsNumber());
        }
        else
            companyEndrs.setText("N/A");

        //Policy Ends On labels
        Label policyEnds = new Label("Policy Ends On");
        Label companyPolicyEnd = new Label();
        if(client.getPolicyEndDate() != null )
        {

            companyPolicyEnd.setText(client.getPolicyEndDate().toString());
        }
        else
            companyPolicyEnd.setText("N/A");

        //Insurance Branch Name labels
        Label branchName = new Label("Insurance Branch Name");
        TextArea companyBranch = new TextArea();
        if(client.getInsBranchName() != null )
        {

            companyBranch.setText(client.getInsBranchName());
        }
        else
            companyBranch.setText("N/A");

        //Policy Details labels
        Label policyDetails = new Label("Policy Details");
        Label companyPolicyDetails = new Label();
        if(client.getPolicyDetails() != null )
        {

            companyPolicyDetails.setText(client.getPolicyDetails());
        }
        else
            companyPolicyDetails.setText("N/A");


        //Label Padding
        //policy certificate label padding
        policyNumber.setUIID("clientLabel");
        companyPolicy.setUIID("clientInfoLabel");

        //Policy Starts label padding
        policyStart.setUIID("clientLabel");
        companyPolicyStart.setUIID("clientInfoLabel");

        //Office Code label padding
        officeLabel.setUIID("clientLabel");
        companyOffice.setUIID("clientInfoLabel");

        //Insurance Company Name label padding
        insuranceName.setUIID("clientLabel");
        companyInsurance.setUIID("clientInfoLabel");

        //Agent label padding
        agentLabel.setUIID("clientLabel");
        companyAgent.setUIID("clientInfoLabel");

        //Reference label padding
        referenceLabel.setUIID("clientLabel");
        companyReference.setUIID("clientInfoLabel");

        //Endrs Number label padding
        endrsNumber.setUIID("clientLabel");
        companyEndrs.setUIID("clientInfoLabel");

        //Policy Ends label padding
        policyEnds.setUIID("clientLabel");
        companyPolicyEnd.setUIID("clientInfoLabel");

        //Insurance Branch Name label padding
        branchName.setUIID("clientLabel");
        companyBranch.setUIID("clientInfoLabel");

        //Policy Details label padding
        policyDetails.setUIID("clientLabel");
        companyPolicyDetails.setUIID("clientInfoLabel");


        companyDeatilsContainer.addComponent(policyNumber);
        companyDeatilsContainer.addComponent(companyPolicy);


        companyDeatilsContainer.addComponent(policyStart);
        companyDeatilsContainer.addComponent(companyPolicyStart);


        companyDeatilsContainer.addComponent(officeLabel);
        companyDeatilsContainer.addComponent(companyOffice);


        companyDeatilsContainer.addComponent(insuranceName);
        companyDeatilsContainer.addComponent(companyInsurance);

        companyDeatilsContainer.addComponent(agentLabel);
        companyDeatilsContainer.addComponent(companyAgent);


        companyDeatilsContainer.addComponent(referenceLabel);
        companyDeatilsContainer.addComponent(companyReference);


        companyDeatilsContainer.addComponent(endrsNumber);
        companyDeatilsContainer.addComponent(companyEndrs);


        companyDeatilsContainer.addComponent(policyEnds);
        companyDeatilsContainer.addComponent(companyPolicyEnd);

        companyDeatilsContainer.addComponent(branchName);
        companyDeatilsContainer.addComponent(companyBranch);


        companyDeatilsContainer.addComponent(policyDetails);
        companyDeatilsContainer.addComponent(companyPolicyDetails);







        //Policy Details Container
        Container policyDeatilsContainer = new Container();
        policyDeatilsContainer.setUIID("tabContainer");
        policyDeatilsContainer.setLayout(pContainerBoxLayout);

        //labels
        //policy Type labels
        Label policyType = new Label("Policy Type");
        Label policyName = new Label();
        if(client.getPolicyType() != null )
        {

            policyName.setText(client.getPolicyType());
        }
        else
            policyName.setText("N/A");

        //Vehicle Number labels
        Label vehicleNumber = new Label("Vehicle Number");
        Label policyVehicle = new Label();
        if(client.getVehicleNumber() != null )
        {

            policyVehicle.setText(client.getVehicleNumber());
        }
        else
            policyVehicle.setText("N/A");

        //I.D.V labels
        Label idvLabel = new Label("I.D.V.");
        Label policyIdv = new Label();
        if(client.getiDV() != null )
        {

            policyIdv.setText(client.getiDV());
        }
        else
            policyIdv.setText("N/A");


        //Vehicle Make labels
        Label vehicleLabel = new Label("Vehicle Make");
        Label policyVehicleMake = new Label();
        if(client.getVehicleMake() != null )
        {

            policyVehicleMake.setText(client.getVehicleMake());
        }
        else
            policyVehicleMake.setText("N/A");

        //Year of Manufacturing labels
        Label vehicleYear = new Label("Year of Manufacturing");
        Label policyVehicleYear = new Label();
        if(client.getVehicleManufactureYear() != null )
        {

            policyVehicleYear.setText(client.getVehicleManufactureYear().toString());
        }
        else
            policyVehicleYear.setText("N/A");

        //NCB labels
        Label ncbLabel = new Label("NCB");
        Label policyNcb = new Label();
        if(client.getnBC() != null )
        {

            policyNcb.setText(client.getnBC());
        }
        else
            policyNcb.setText("N/A");


        //Label Padding
        //policy Type label padding
        policyType.setUIID("clientLabel");
        policyName.setUIID("clientInfoLabel");

        //Vehicle Number label padding
        vehicleNumber.setUIID("clientLabel");
        policyVehicle.setUIID("clientInfoLabel");

        //I.D.V label padding
        idvLabel.setUIID("clientLabel");
        policyIdv.setUIID("clientInfoLabel");

        //Vehicle Make label padding
        vehicleLabel.setUIID("clientLabel");
        policyVehicleMake.setUIID("clientInfoLabel");

        //Year of Manufacturing padding
        vehicleYear.setUIID("clientLabel");
        policyVehicleYear.setUIID("clientInfoLabel");

        //NCB label padding
        ncbLabel.setUIID("clientLabel");
        policyNcb.setUIID("clientInfoLabel");

        policyDeatilsContainer.addComponent(policyType);
        policyDeatilsContainer.addComponent(policyName);


        policyDeatilsContainer.addComponent(vehicleNumber);
        policyDeatilsContainer.addComponent(policyVehicle);


        policyDeatilsContainer.addComponent(idvLabel);
        policyDeatilsContainer.addComponent(policyIdv);


        policyDeatilsContainer.addComponent(vehicleLabel);
        policyDeatilsContainer.addComponent(policyVehicleMake);

        policyDeatilsContainer.addComponent(vehicleYear);
        policyDeatilsContainer.addComponent(policyVehicleYear);


        policyDeatilsContainer.addComponent(ncbLabel);
        policyDeatilsContainer.addComponent(policyNcb);






        //Amount Details tab contents
        Container amountDetailsContainer = new Container();
        amountDetailsContainer.setUIID("tabContainer");
        amountDetailsContainer.setLayout(pContainerBoxLayout);

        //labels
        //Premium Amount labels
        Label premiumAmount = new Label("Premium Amount");
        Label amountNumber = new Label();
        if(client.getPremiumAmount() != null )
        {

            amountNumber.setText(client.getPremiumAmount().toString());
        }
        else
            amountNumber.setText("N/A");

        //Terrorism Premium Amount labels
        Label terrorismAmount = new Label("Terrorism Premium Amount");
        Label amountTerrorism = new Label();
        if(client.getTerrorismPremiumAmount() != null )
        {

            amountTerrorism.setText(client.getTerrorismPremiumAmount().toString());
        }
        else
            amountTerrorism.setText("N/A");

        //Service Tax Percentage labels
        Label serviceTax = new Label("Service Tax Percentage");
        Label amountPercentage = new Label();
        if(client.getServiceTax() != null )
        {

            amountPercentage.setText(client.getServiceTax().toString());
        }
        else
            amountPercentage.setText("N/A");

        //Service Tax Amount labels
        Label serviceAmount = new Label("Service Tax Amount");
        Label amountTax = new Label();
        if(client.getServiceTaxAmount() != null )
        {

            amountTax.setText(client.getServiceTaxAmount().toString());
        }
        else
            amountTax.setText("N/A");


        //Total Premium Amount labels
        Label totalPremium = new Label("Total Premium Amount");
        Label amountTotal = new Label();
        if(client.getTotalPremiumAmount() != null )
        {

            amountTotal.setText(client.getTotalPremiumAmount().toString());
        }
        else
            amountTotal.setText("N/A");

        //Commission Rate Percentage labels
        Label commissionRate = new Label("Commission Rate Percentage");
        Label amountRatePercentage = new Label();
        if(client.getCommionRate() != null )
        {

            amountRatePercentage.setText(client.getCommionRate().toString());
        }
        else
            amountRatePercentage.setText("N/A");

        //Commission Rate Amount labels
        Label commissionAmount = new Label("Commission Rate Amount");
        Label amountCommission = new Label();
        if(client.getCommionRateAmount() != null )
        {

            amountCommission.setText(client.getCommionRateAmount().toString());
        }
        else
            amountCommission.setText("N/A");

        //Collection Date labels
        Label collectionDate = new Label("Collection Date");
        Label amountCollection = new Label();
        if(client.getCollectionDate() != null )
        {

            amountCollection.setText(client.getCollectionDate().toString());
        }
        else
            amountCollection.setText("N/A");


        //Label Padding
        //Premium Amount label padding
        premiumAmount.setUIID("clientLabel");
        amountNumber.setUIID("clientInfoLabel");

        //Terrorism Premium Amount label padding
        terrorismAmount.setUIID("clientLabel");
        amountTerrorism.setUIID("clientInfoLabel");

        //Service Tax Percentage label padding
        serviceTax.setUIID("clientLabel");
        amountPercentage.setUIID("clientInfoLabel");

        //Service Tax Amount label padding
        serviceAmount.setUIID("clientLabel");
        amountTax.setUIID("clientInfoLabel");

        //Total Premium Amount padding
        totalPremium.setUIID("clientLabel");
        amountTotal.setUIID("clientInfoLabel");

        //Commission Rate Percentage label padding
        commissionRate.setUIID("clientLabel");
        amountRatePercentage.setUIID("clientInfoLabel");

        //Commission Rate Amount padding
        commissionAmount.setUIID("clientLabel");
        amountCommission.setUIID("clientInfoLabel");

        //Collection Date label padding
        collectionDate.setUIID("clientLabel");
        amountCollection.setUIID("clientInfoLabel");

        amountDetailsContainer.addComponent(premiumAmount);
        amountDetailsContainer.addComponent(amountNumber);


        amountDetailsContainer.addComponent(terrorismAmount);
        amountDetailsContainer.addComponent(amountTerrorism);


        amountDetailsContainer.addComponent(serviceTax);
        amountDetailsContainer.addComponent(amountPercentage);


        amountDetailsContainer.addComponent(serviceAmount);
        amountDetailsContainer.addComponent(amountTax);

        amountDetailsContainer.addComponent(totalPremium);
        amountDetailsContainer.addComponent(amountTotal);


        amountDetailsContainer.addComponent(commissionRate);
        amountDetailsContainer.addComponent(amountRatePercentage);

        amountDetailsContainer.addComponent(commissionAmount);
        amountDetailsContainer.addComponent(amountCommission);


        amountDetailsContainer.addComponent(collectionDate);
        amountDetailsContainer.addComponent(amountCollection);





        //Documents Details Container
        Container documentsContainer = new Container();
        documentsContainer.setUIID("tabContainer");
        Button b4= new Button("Company Details");
        documentsContainer.addComponent(b4);




        //Renewal Details Container
        Container renewalDeatilsContainer = new Container();
        renewalDeatilsContainer.setUIID("tabContainer");
        renewalDeatilsContainer.setLayout(pContainerBoxLayout);

        //labels
        //Renewal Amount labels
        Label renewalAmount = new Label("Renewal Amount");
        Label renewalNumber = new Label();
        if(client.getRenewalAmount() != null )
        {

            renewalNumber.setText(client.getRenewalAmount().toString());
        }
        else
            renewalNumber.setText("N/A");

        //Renewal Company labels
        Label renewalCompany = new Label("Renewal Company");
        Label renewalCompanyName = new Label();
        if(client.getRenewalCompany() != null )
        {

            renewalCompanyName.setText(client.getRenewalCompany());
        }
        else
            renewalCompanyName.setText("N/A");

        //Recent SMS Date labels
        Label smsDate = new Label("Recent SMS Date");
        Label renewalSmsDate = new Label();
        if(client.getServiceTax() != null )
        {

            renewalSmsDate.setText(client.getServiceTax().toString());
        }
        else
            renewalSmsDate.setText("N/A");

        //Label Padding
        //Renewal Amount label padding
        renewalAmount.setUIID("clientLabel");
        renewalNumber.getStyle().setBgTransparency(0);
        renewalNumber.setUIID("clientInfoLabel");

        //Renewal Company label padding
        renewalCompany.setUIID("clientLabel");
        renewalCompanyName.setUIID("clientInfoLabel");

        //Recent SMS Date label padding
        smsDate.setUIID("clientLabel");
        renewalSmsDate.setUIID("clientInfoLabel");

        renewalDeatilsContainer.addComponent(renewalAmount);
        renewalDeatilsContainer.addComponent(renewalNumber);


        renewalDeatilsContainer.addComponent(renewalCompany);
        renewalDeatilsContainer.addComponent(renewalCompanyName);


        renewalDeatilsContainer.addComponent(smsDate);
        renewalDeatilsContainer.addComponent(renewalSmsDate);






        tabs.addTab("",theme.getImage("personalDetails.png"),personalContainer);
        tabs.setTabSelectedIcon(0,theme.getImage("personalDetailsWhite.png"));

        tabs.addTab("", theme.getImage("companyDetails.png"), companyDeatilsContainer);
        tabs.setTabSelectedIcon(1,theme.getImage("companyDetailsWhite.png"));

        tabs.addTab("",theme.getImage("policyDetails.png"),policyDeatilsContainer);
        tabs.setTabSelectedIcon(2,theme.getImage("policyDetailsWhite.png"));

        tabs.addTab("", theme.getImage("amountDetails.png"), amountDetailsContainer);
        tabs.setTabSelectedIcon(3,theme.getImage("amountDetailsWhite.png"));

        tabs.addTab("",theme.getImage("documents.png"),documentsContainer);
        tabs.setTabSelectedIcon(4,theme.getImage("documentswhite.png"));

        tabs.addTab("", theme.getImage("renewalDetails.png"), renewalDeatilsContainer);
        tabs.setTabSelectedIcon(5,theme.getImage("renewalDetailsWhite.png"));


        tabsContainer.addComponent(BorderLayout.NORTH,tabs);
        contantContainer.addComponent(tabsContainer);






        //lable Container
        tabelContainer = new Container(new BorderLayout());
        tabelContainer.setUIID("tabContainer");
        contantContainer.addComponent(tabelContainer);


//        //logo Button
//        Button logoButton = new Button();
//        Styles.ButtonStyles(logoButton, "telosLogoBlue.png", theme);
//        buttonsContainer.addComponent(logoButton);
//
//        //search Button
//        Button searchButton = new Button();
//        Styles.ButtonStyles(searchButton, "searchWhite.png", theme);
//        buttonsContainer.addComponent(searchButton);
//
//        //reports Button
//        Button reportsButton = new Button();
//        Styles.ButtonStyles(reportsButton, "reportBlue.png", theme);
//        buttonsContainer.addComponent(reportsButton);
//
//        //graphs Button
//        Button graphsButton = new Button();
//        Styles.ButtonStyles(graphsButton, "graphsBlue.png", theme);
//        buttonsContainer.addComponent(graphsButton);
//
//        //graphs Button
//        Button contactsButton = new Button();
//        Styles.ButtonStyles(contactsButton, "contactBlue.png", theme);
//        buttonsContainer.addComponent(contactsButton);
//
//        //graphs Button
//        Button locateButton = new Button();
//        Styles.ButtonStyles(locateButton, "locateBlue.png", theme);
//        buttonsContainer.addComponent(locateButton);
//
//        //graphs Button
//        Button helpButton = new Button();
//        Styles.ButtonStyles(helpButton, "helpBlue.png", theme);
//        buttonsContainer.addComponent(helpButton);
//
//        //graphs Button
//        Button emptyButton = new Button();
//        Styles.ButtonStyles(emptyButton, "spaceBlue.png", theme);
//        buttonsContainer.addComponent(emptyButton);

        //back button
        com.codename1.ui.Button backButton = new Button();
        backButton.setGap(0);
        Styles.ButtonStyles(backButton, "backWhite.png", theme);
        backButton.addActionListener(backButtonAction);
        fieldContainer.addComponent(backButton);


        Label clientFoundLabel = new Label();
        clientFoundLabel.setText("Client "+client.getId());
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
        fieldContainer.addComponent(toolbarConstraint,foundContainer);

        clientForm.show();
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

           // SearchPage.searchPageForm.showBack();
        }
    };
}
