package com.telos.hyd.pages;

import com.codename1.charts.ChartComponent;
import com.codename1.charts.models.CategorySeries;
import com.codename1.charts.renderers.DefaultRenderer;
import com.codename1.charts.util.ColorUtil;
import com.codename1.charts.views.PieChart;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.AbstractDemoChart;
import com.telos.hyd.Styles.Styles;
import com.telos.hyd.Styles.TimeUtil;
import com.telos.hyd.model.Charts;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by karthikmarupeddi on 2/9/15.
 */



public class TypeOfPoliciesGraph extends AbstractDemoChart{


    Form logInForm;
    Resources theme;
    Form currentForm = null;
    Font largeFont = Font.createSystemFont(Font.FACE_SYSTEM, Font.SIZE_LARGE, Font.STYLE_PLAIN);
    Button selectMonth;
    Dialog dialog;
    PieChart chart;
    PieChart chart1;
    DefaultRenderer renderer = null;
    Container contantContainer = null;
    ChartComponent chartComponent = null;
    ChartComponent chartComponent1 = null;
    Container chartComponentContainer = null;
    Container firstChartContainer = null;
    Container secondChartContainer = null;
    ArrayList<Charts> dataForNextYear = null;
    ArrayList<Charts> dataForFirstYear = null;
    Label chartLabel = null;


    public TypeOfPoliciesGraph(Form form, ArrayList<Charts> values, ArrayList<Charts> values1)
    {
        currentForm = new Form("Number of Type of Policies in year 2005 and 2006");
        this.logInForm = form;
        this.dataForFirstYear =  values;
        this.dataForNextYear =  values1;
        try {
            this.theme = Resources.openLayered("/theme");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void createPieChartForm() {

        contantContainer = PageTemplate.getContainer(PageTemplate.setBackButton(logInForm), theme, currentForm);


        getRenderer();

        CategorySeries seriesSet = buildCategoryDataset("Project budget", dataForFirstYear);
        CategorySeries seriesSet1 = buildCategoryDataset("Project budget", dataForNextYear);

        chart = new PieChart(seriesSet, renderer);
        chart1 = new PieChart(seriesSet1, renderer);

        FlowLayout boxChartsLayout = new FlowLayout(Component.LEFT);
        BoxLayout boxLayout = new BoxLayout(BoxLayout.Y_AXIS);

        firstChartContainer = new Container(boxChartsLayout);
        secondChartContainer = new Container(boxChartsLayout);

        chartComponentContainer = new Container(boxLayout);

        chartComponent = new ChartComponent(chart);
        chartComponent1 = new ChartComponent(chart1);

        firstChartContainer.addComponent(new Label(dataForFirstYear.get(0).getToYear().toString()));
        firstChartContainer.addComponent(chartComponent);

        selectMonth = new Button("Select Month");
        selectMonth.setUIID("clientInfoLabel");
        selectMonth.addActionListener(fromYearAction);

        firstChartContainer.addComponent(selectMonth);

        chartLabel = new Label(dataForNextYear.get(0).getToYear().toString());
        secondChartContainer.addComponent(chartLabel);
        secondChartContainer.addComponent(chartComponent1);

        chartComponent.setZoomEnabled(true);
        chartComponent1.setZoomEnabled(true);

        chartComponentContainer.addComponent(firstChartContainer);
        chartComponentContainer.addComponent(secondChartContainer);

        wrap("Number of Type of Policies in year 2005 and 2006", chartComponentContainer, contantContainer).show();


    }

    private void getRenderer() {
        int[] colors = new int[] { ColorUtil.LTGRAY, ColorUtil.GREEN, ColorUtil.MAGENTA, ColorUtil.YELLOW, ColorUtil.CYAN };
        renderer = buildCategoryRenderer(colors);
        renderer.setApplyBackgroundColor(true);
        renderer.setBackgroundColor(ColorUtil.WHITE);
        renderer.setLabelsColor(ColorUtil.BLACK);

        renderer.setLabelsTextSize(16);
        renderer.setChartTitleTextSize(16);
        renderer.setDisplayValues(true);
        renderer.setShowLabels(true);
    }


    protected Form wrap(String title, Component c, Container contantContainer) {
        //contantContainer.setLayout(new BorderLayout());
        contantContainer.addComponent(c);
        currentForm.setTitle("TouchTelos");
        return currentForm;
    }


    /**
     * Returns the chart name.
     *
     * @return the chart name
     */
    @Override
    public String getName() {
        return "Type of Policies";
    }

    /**
     * Returns the chart description.
     *
     * @return the chart description
     */
    @Override
    public String getDesc() {
        return "Budget chart";
    }

    /**
     * Executes the chart demo.
     *
     * @return the built intent
     */
    @Override
    public Form execute() {
        return null;
    }


    protected CategorySeries buildCategoryDataset(String title, ArrayList<Charts> values) {
        CategorySeries series = new CategorySeries(title);
        for (Charts value : values) {

            series.add(value.getDepartment(), value.getNumberOfPolicies());
        }

        return series;
    }


    ActionListener fromYearAction = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {

            Button sourceComponent = (Button) evt.getSource();
            dialog = new Dialog();

            Container container = new Container();
            container.setLayout(new BoxLayout(BoxLayout.Y_AXIS));

            for(String month : TimeUtil.getMonths())
            {
                if("January" == month)
                {
                    Container layeredContainer = Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "topButton.png", month);
                    container.addComponent(layeredContainer);
                }
                else if("December" == month)
                {
                    Container
                            bottomLayeredContainer = Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "bottomButton.png", month);
                    container.addComponent(bottomLayeredContainer);
                }
                else
                {
                    container.addComponent(Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "middleButton.png", month));
                }

            }



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


