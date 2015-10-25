package com.telos.hyd.pages;

import com.codename1.charts.ChartComponent;
import com.codename1.charts.models.CategorySeries;
import com.codename1.charts.renderers.DefaultRenderer;
import com.codename1.charts.util.ColorUtil;
import com.codename1.charts.views.PieChart;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.AbstractDemoChart;
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
    Button selectFromYearComboBox;
    Dialog dialog;
    PieChart chart;
    PieChart chart1;
    DefaultRenderer renderer = null;
    Container contantContainer = null;
    ChartComponent chartComponent = null;
    ChartComponent chartComponent1 = null;
    Container chartComponentContainer = null;
    ArrayList<Charts> dataForNextYear = null;
    ArrayList<Charts> dataForFirstYear = null;


    public TypeOfPoliciesGraph(Form form, ArrayList<Charts> values, ArrayList<Charts> values1)
    {
        currentForm = new Form("Number of Type of Policies in year 2005 and 2006");
        this.logInForm = form;
        this.dataForNextYear =  values;
        this.dataForFirstYear =  values1;
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


        chartComponentContainer = new Container(new BorderLayout());

        chartComponent = new ChartComponent(chart);
        chartComponent1 = new ChartComponent(chart1);

        chartComponent.setZoomEnabled(true);
        chartComponent1.setZoomEnabled(true);

        chartComponentContainer.addComponent(BorderLayout.CENTER, chartComponent);
        chartComponentContainer.addComponent(BorderLayout.NORTH, chartComponent1);

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
        currentForm.setTitle("wefewfefewfewfewfweqf");
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
}


