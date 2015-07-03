package com.telos.hyd.pages;

import com.codename1.charts.ChartComponent;
import com.codename1.charts.models.CategorySeries;
import com.codename1.charts.models.XYMultipleSeriesDataset;
import com.codename1.charts.renderers.XYMultipleSeriesRenderer;
import com.codename1.charts.renderers.XYSeriesRenderer;
import com.codename1.charts.util.ColorUtil;
import com.codename1.charts.views.BarChart;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Font;
import com.codename1.ui.Form;
import com.codename1.ui.util.Resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by karthikmarupeddi on 2/9/15.
 */



public class Graphs {


    Form logInForm;
    Resources theme;
    Form f = new Form();


    public Graphs(Form form)
    {
        this.logInForm = form;
        try {
            this.theme = Resources.openLayered("/theme");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void createPieChartForm() {

        Container contantContainer = PageTemplate.getContainer(PageTemplate.setBackButton(logInForm), theme, f);
        f.setScrollableY(true);
        f.setScrollable(true);


        String[] titles = new String[] { "2007", "2008" };
        List<double[]> values = new ArrayList<double[]>();
        values.add(new double[]{5230, 7300, 9240, 10540, 7900, 9200, 12030, 11200, 9500, 10500,
                11600, 13500});
        values.add(new double[]{14230, 12300, 14240, 15244, 15900, 19200, 22030, 21200, 19500, 15500,
                12600, 14000});
        int[] colors = new int[] { ColorUtil.CYAN, ColorUtil.LTGRAY };
        XYMultipleSeriesRenderer renderer = buildBarRenderer(colors);
        renderer.setOrientation(XYMultipleSeriesRenderer.Orientation.HORIZONTAL);
        setChartSettings(renderer, "Monthly sales in the last 2 years", "Month", "Units sold", 0.5,
                12.5, 0, 24000, ColorUtil.BLUE, ColorUtil.BLACK);
        renderer.setXLabels(1);
        renderer.setYLabels(10);
        renderer.addXTextLabel(1, "Jan");
        renderer.addXTextLabel(3, "Mar");
        renderer.addXTextLabel(5, "May");
        renderer.addXTextLabel(7, "Jul");
        renderer.addXTextLabel(9, "Sep");
        renderer.addXTextLabel(12, "Dec");
        int length = renderer.getSeriesRendererCount();
        for (int i = 0; i < length; i++) {
            XYSeriesRenderer seriesRenderer = (XYSeriesRenderer) renderer.getSeriesRendererAt(i);
            seriesRenderer.setDisplayChartValues(true);
        }

        BarChart chart = new BarChart(buildBarDataset(titles, values), renderer,
                BarChart.Type.DEFAULT);

        ChartComponent chartComponent = new ChartComponent(chart);
        chartComponent.setZoomEnabled(true);
        wrap("", chartComponent,contantContainer).show();

    }


    protected XYMultipleSeriesDataset buildBarDataset(String[] titles, List<double[]> values) {
        XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
        int length = titles.length;
        for (int i = 0; i < length; i++) {
            CategorySeries series = new CategorySeries(titles[i]);
            double[] v = values.get(i);
            int seriesLength = v.length;
            for (int k = 0; k < seriesLength; k++) {
                series.add(v[k]);
            }
            dataset.addSeries(series.toXYSeries());
        }
        return dataset;
    }

    protected XYMultipleSeriesRenderer buildBarRenderer(int[] colors) {

        XYMultipleSeriesRenderer renderer = new XYMultipleSeriesRenderer();
        renderer.setAxisTitleTextSize(Font.SIZE_LARGE);
        renderer.setChartTitleTextSize(Font.SIZE_LARGE);
        renderer.setLabelsTextSize(Font.SIZE_LARGE);
        renderer.setLegendTextSize(Font.SIZE_LARGE);
        int length = colors.length;
        for (int i = 0; i < length; i++) {
            XYSeriesRenderer r = new XYSeriesRenderer();
            r.setColor(colors[i]);
            renderer.addSeriesRenderer(r);
        }
        renderer.setApplyBackgroundColor(true);
        renderer.setBackgroundColor(0xffffff);
        renderer.setMarginsColor(0xffffff);
        return renderer;
    }

    protected void setChartSettings(XYMultipleSeriesRenderer renderer, String title, String xTitle,
                                    String yTitle, double xMin, double xMax, double yMin, double yMax, int axesColor,
                                    int labelsColor) {
        renderer.setChartTitle(title);
        renderer.setXTitle(xTitle);
        renderer.setYTitle(yTitle);
        renderer.setXAxisMin(xMin);
        renderer.setXAxisMax(xMax);
        renderer.setYAxisMin(yMin);
        renderer.setYAxisMax(yMax);
        renderer.setAxesColor(axesColor);
        renderer.setLabelsColor(labelsColor);
        renderer.setXAxisColor(ColorUtil.BLACK);
        renderer.setYAxisColor(ColorUtil.BLACK);
        renderer.setXLabelsColor(ColorUtil.BLACK);
        renderer.setYLabelsColor(0, ColorUtil.BLACK);
    }

    protected Form wrap(String title, Component c, Container contantContainer) {
        //contantContainer.setLayout(new BorderLayout());
        contantContainer.addComponent(c);

        return f;
    }
}


