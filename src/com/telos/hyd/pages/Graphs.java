package com.telos.hyd.pages;

import com.codename1.charts.ChartComponent;
import com.codename1.charts.models.CategorySeries;
import com.codename1.charts.models.XYMultipleSeriesDataset;
import com.codename1.charts.renderers.XYMultipleSeriesRenderer;
import com.codename1.charts.renderers.XYSeriesRenderer;
import com.codename1.charts.util.ColorUtil;
import com.codename1.charts.views.BarChart;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.Styles;

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
    Button selectPoliciesComboBox;
    Dialog dialog;
    List<double[]> values;
    String[] titles;
    BarChart chart;


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


        XYMultipleSeriesRenderer renderer = getXyMultipleSeriesRenderer();

        chart = new BarChart(buildBarDataset(titles, values), renderer,
                BarChart.Type.DEFAULT);

        ChartComponent chartComponent = new ChartComponent(chart);
        chartComponent.setZoomEnabled(true);
        wrap("", chartComponent,contantContainer).show();

        Label selectPolicy = new Label("Select Type of Policies For More Details:");
        selectPolicy.setVisible(true);
        selectPolicy.setUIID("clientLabel");

        selectPoliciesComboBox = new Button("Click here to select Month.");
        selectPoliciesComboBox.setUIID("Label");
        selectPoliciesComboBox.setUIID("clientInfoLabel");
        selectPoliciesComboBox.addActionListener(fromYearAction);

        contantContainer.addComponent(selectPolicy);
        contantContainer.addComponent(selectPoliciesComboBox);

    }

    private XYMultipleSeriesRenderer getXyMultipleSeriesRenderer() {
        titles = new String[] { "2007", "2008" };
        values = new ArrayList<double[]>();
        values.add(new double[]{5230, 7300, 9240, 10540, 7900, 9200, 12030, 11200, 9500, 10500,
                11600, 13500});
        values.add(new double[]{14230, 12300, 14240, 15244, 15900, 19200, 22030, 21200, 19500, 15500,
                12600, 14000});
        int[] colors = new int[] { ColorUtil.LTGRAY, ColorUtil.BLUE };
        XYMultipleSeriesRenderer renderer = buildBarRenderer(colors);
        renderer.setOrientation(XYMultipleSeriesRenderer.Orientation.HORIZONTAL);
        setChartSettings(renderer, "Monthly sales in the last 2 years", "Month", "Commission on Policies", 0.5,
                12.5, 0, 24000, ColorUtil.BLUE, ColorUtil.BLACK);
        renderer.setXLabels(1);
        renderer.setYLabels(10);
        renderer.addXTextLabel(1, "Jan");
        renderer.addXTextLabel(2, "Feb");
        renderer.addXTextLabel(3, "Mar");
        renderer.addXTextLabel(4, "Apr");
        renderer.addXTextLabel(5, "May");
        renderer.addXTextLabel(6, "Jun");
        renderer.addXTextLabel(7, "Jul");
        renderer.addXTextLabel(8, "Aug");
        renderer.addXTextLabel(9, "Sep");
        renderer.addXTextLabel(10, "Oct");
        renderer.addXTextLabel(11, "Nov");
        renderer.addXTextLabel(12, "Dec");
        int length = renderer.getSeriesRendererCount();
        for (int i = 0; i < length; i++) {
            XYSeriesRenderer seriesRenderer = (XYSeriesRenderer) renderer.getSeriesRendererAt(i);
            seriesRenderer.setDisplayChartValues(true);
        }
        return renderer;
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


    ActionListener fromYearAction = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {

            Button sourceComponent = (Button) evt.getSource();
            dialog = new Dialog();

            Container container = new Container();
            container.setLayout(new BoxLayout(BoxLayout.Y_AXIS));

            Container layeredContainer = Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "topButton.png", "ALL");
            Container bottomLayeredContainer = Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "bottomButton.png", "ENGINEERING");

            container.addComponent(layeredContainer);

                container.addComponent(getContainerForButtonInDialog(theme, dialog, sourceComponent, "middleButton.png", "FIRE"));
                container.addComponent(getContainerForButtonInDialog(theme, dialog, sourceComponent, "middleButton.png", "MOTOR"));
                container.addComponent(getContainerForButtonInDialog(theme, dialog, sourceComponent, "middleButton.png", "MARINE"));
                container.addComponent(getContainerForButtonInDialog(theme, dialog, sourceComponent, "middleButton.png", "MISCELLANEOUS"));

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


    public Container getContainerForButtonInDialog(Resources theme, final Dialog dialog, final Button source, final String image, final String text) {
        Container layeredContainer = new Container();
        Label label = new Label();
        label.setIcon(theme.getImage(image));
        layeredContainer.setLayout(new LayeredLayout());
        layeredContainer.addComponent(label);

        Button b = new Button(text);
        layeredContainer.addComponent(b);

        Styles.setButtonStyleForDialogBox(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                source.setText(text);
                chart = new BarChart(buildBarDataset(titles, values), getXyMultipleSeriesRenderer(),
                        BarChart.Type.DEFAULT);
                dialog.dispose();
            }
        });
        return layeredContainer;
    }
}


