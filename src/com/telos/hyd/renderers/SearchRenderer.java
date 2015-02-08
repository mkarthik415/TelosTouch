package com.telos.hyd.renderers;

import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.list.ListCellRenderer;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.Styles;
import com.telos.hyd.model.Client;
import com.telos.hyd.pages.ClientPage;

import java.io.IOException;

/**
 * Created by karthikmarupeddi on 12/11/14.
 */
public class SearchRenderer implements ListCellRenderer {


    Resources theme;
    Form searchForm;

    //row container
    Container rowContainer = new Container();
    TableLayout tableLayout = new TableLayout(1,6);

    Client client;

    //Buttons
    Button idButton = new Button();
    Button nameButton = new Button();
    Button departmentButton = new Button();
    Button policyNumberButton = new Button();
    Button startDateButton = new Button();
    Button insuranceCompanyButton = new Button();

    public SearchRenderer(Form origin) throws IOException {
        this.theme = Resources.openLayered("/theme");
        this.searchForm = origin;

        TableLayout.Constraint rowConstraint = tableLayout.createConstraint();
        rowConstraint.setWidthPercentage(20);
        rowConstraint.setHorizontalAlign(Component.CENTER);
        rowConstraint.setVerticalAlign(Component.BOTTOM);
        rowContainer.setLayout(tableLayout);
        rowContainer.addComponent(rowConstraint, idButton);
        rowContainer.addComponent(rowConstraint,nameButton);
        rowContainer.addComponent(rowConstraint,departmentButton);
        rowContainer.addComponent(rowConstraint, policyNumberButton);
        rowContainer.addComponent(rowConstraint, startDateButton);
        rowContainer.addComponent(rowConstraint, insuranceCompanyButton);
        idButton.addActionListener(action);
        nameButton.addActionListener(action);
        departmentButton.addActionListener(action);
        policyNumberButton.addActionListener(action);
        startDateButton.addActionListener(action);
        insuranceCompanyButton.addActionListener(action);
    }
    /**
     * Returns a component instance that is already set to render "value". While it is not a requirement
     * many renderes often derive from a component (such as a label) and return "this".
     * Notice that a null value for the value argument might be sent when refreshing the theme of the
     * list.
     *
     * @param list       the list component
     * @param value      the value to render
     * @param index      the index in the list
     * @param isSelected whether the entry is selected
     * @return a component to paint within the list
     */
    @Override
    public Component getListCellRendererComponent(List list, Object value, int index, boolean isSelected) {

        Client client = (Client) value;
        this.client = client;

        Styles.ButtonStylesForCell(idButton, new Integer(client.getId()).toString(), this.theme);

        Styles.ButtonStylesForCell(nameButton, client.getClientName(), this.theme);

        Styles.ButtonStylesForCell(departmentButton, client.getDepartment(), this.theme);
        if(client.getPolicyNumber() != null )
            Styles.ButtonStylesForCell(policyNumberButton, client.getPolicyNumber(), this.theme);
        else
            Styles.ButtonStylesForCell(policyNumberButton, "N/A", this.theme);

//        Format formatter = new SimpleDateFormat("dd-MM-YYYY");
//        String stringDate = formatter.format(client.getPolicyStartdate());
        Styles.ButtonStylesForCell(startDateButton, "01/02/2015", this.theme);

        Styles.ButtonStylesForCell(insuranceCompanyButton, client.getInsCompanyName(), this.theme);

        rowContainer.getStyle().setBgTransparency(255);

        rowContainer.getStyle().setMargin(0, 0, 0, 0);
        rowContainer.getStyle().setPadding(10, 10, 10, 10);
        return rowContainer;
    }

    /**
     * Returns a component instance that is painted under the currently focused renderer
     * and is animated to provide smooth scrolling.
     * When the selection moves, this component is drawn above/bellow the list items -
     * it is recommended to give this component some level of transparency (see above code example).
     * This method is optional an implementation
     * can choose to return null.
     *
     * @param list the parent list
     * @return a component to use as focus
     * @see com.codename1.ui.List#setSmoothScrolling
     */
    @Override
    public Component getListFocusComponent(List list) {
        return null;
    }


    ActionListener action = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {

            ClientPage clientPage = new ClientPage(client,searchForm);
            try {
                clientPage.createPage();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };
}
