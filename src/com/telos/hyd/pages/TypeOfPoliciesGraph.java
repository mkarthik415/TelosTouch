package com.telos.hyd.pages;

import com.codename1.charts.ChartComponent;
import com.codename1.charts.models.MultipleCategorySeries;
import com.codename1.charts.renderers.DefaultRenderer;
import com.codename1.charts.renderers.SimpleSeriesRenderer;
import com.codename1.charts.util.ColorUtil;
import com.codename1.charts.views.DoughnutChart;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.util.Resources;
import com.telos.hyd.Styles.Styles;
import com.telos.hyd.Styles.TimeUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by karthikmarupeddi on 2/9/15.
 */



public class TypeOfPoliciesGraph {


    Form logInForm;
    Resources theme;
    Form f = new Form();

    Font smallFont = Font.createSystemFont(Font.FACE_SYSTEM, Font.SIZE_SMALL, Font.STYLE_PLAIN);
    Font medFont = Font.createSystemFont(Font.FACE_SYSTEM, Font.SIZE_MEDIUM, Font.STYLE_PLAIN);
    Font largeFont = Font.createSystemFont(Font.FACE_SYSTEM, Font.SIZE_LARGE, Font.STYLE_PLAIN);
    Button selectFromYearComboBox;
    Dialog dialog;
    DoughnutChart chart;
    List<double[]> values = null;
    DefaultRenderer renderer = null;


    public TypeOfPoliciesGraph(Form form)
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


        List<String[]> titles = getStrings();

        chart = new DoughnutChart(buildMultipleCategoryDataset("Project budget", titles, values), renderer);



        ChartComponent chartComponent = new ChartComponent(chart);
        chartComponent.setZoomEnabled(true);
        wrap("Number of Type of Policies in year 2005 and 2006", chartComponent,contantContainer).show();

        Label yearFromLabel = new Label("Month:");
        yearFromLabel.setVisible(true);
        yearFromLabel.setUIID("clientLabel");

        selectFromYearComboBox = new Button("Click here to select Month.");
        selectFromYearComboBox.setUIID("Label");
        selectFromYearComboBox.setUIID("clientInfoLabel");
        selectFromYearComboBox.addActionListener(fromYearAction);
        contantContainer.addComponent(yearFromLabel);
        contantContainer.addComponent(selectFromYearComboBox);

    }

    private List<String[]> getStrings() {
        values = new ArrayList<double[]>();
        values.add(new double[] { 12, 14, 11, 10, 19 });
        values.add(new double[]{10, 9, 14, 20, 11});
        List<String[]> titles = new ArrayList<String[]>();
        titles.add(new String[]{"P1", "P2", "P3", "P4", "P5"});
        titles.add(new String[]{"Project1", "Project2", "Project3", "Project4", "Project5"});
        int[] colors = new int[] { ColorUtil.LTGRAY, ColorUtil.GREEN, ColorUtil.MAGENTA, ColorUtil.YELLOW, ColorUtil.CYAN };
        renderer = buildCategoryRenderer(colors);
        renderer.setApplyBackgroundColor(true);
        renderer.setBackgroundColor(ColorUtil.WHITE);
        renderer.setLabelsColor(ColorUtil.BLACK);
        return titles;
    }


    protected Form wrap(String title, Component c, Container contantContainer) {
        //contantContainer.setLayout(new BorderLayout());
        contantContainer.addComponent(c);

        return f;
    }

    protected DefaultRenderer buildCategoryRenderer(int[] colors) {
        DefaultRenderer renderer = new DefaultRenderer();
        renderer.setLabelsTextSize(largeFont.getHeight());
        renderer.setLegendTextSize(largeFont.getHeight());
        renderer.setMargins(new int[]{largeFont.getHeight(), largeFont.getHeight(), largeFont.getHeight(), largeFont.getHeight()});
        for (int color : colors) {
            SimpleSeriesRenderer r = new SimpleSeriesRenderer();
            r.setColor(color);
            renderer.addSeriesRenderer(r);
        }
        return renderer;
    }

    protected MultipleCategorySeries buildMultipleCategoryDataset(String title,
                                                                  List<String[]> titles, List<double[]> values) {
        MultipleCategorySeries series = new MultipleCategorySeries(title);
        int k = 0;
        for (double[] value : values) {
            series.add(2007 + k + "", titles.get(k), value);
            k++;
        }
        return series;
    }


    ActionListener fromYearAction = new ActionListener() {

        public void actionPerformed(ActionEvent evt) {

            Button sourceComponent = (Button) evt.getSource();
            dialog = new Dialog();

            Container container = new Container();
            container.setLayout(new BoxLayout(BoxLayout.Y_AXIS));

            Container layeredContainer = Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "topButton.png", TimeUtil.getMonths().get(0));
            Container bottomLayeredContainer = Styles.getContainerForButtonInDialog(theme, dialog, sourceComponent, "bottomButton.png", TimeUtil.getMonths().get(11));

            container.addComponent(layeredContainer);
            for(int i=1;i<=10;i++)
            {
                container.addComponent(getContainerForButtonInDialog(theme, dialog, sourceComponent, "middleButton.png", TimeUtil.getMonths().get(i)));
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
                renderer.setBackgroundColor(ColorUtil.LTGRAY);
                chart = new DoughnutChart(buildMultipleCategoryDataset("Project budget", getStrings(), values), renderer);
                dialog.dispose();
            }
        });
        return layeredContainer;
    }
}


