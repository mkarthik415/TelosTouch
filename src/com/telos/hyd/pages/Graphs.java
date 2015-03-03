package com.telos.hyd.pages;

/**
 * Created by karthikmarupeddi on 2/9/15.
 */



public class Graphs {
//
//    private DefaultRenderer buildCategoryRenderer(int[] colors) {
//        DefaultRenderer renderer = new DefaultRenderer();
//        renderer.setLabelsTextSize(15);
//        renderer.setLegendTextSize(15);
//        renderer.setMargins(new int[]{20, 30, 15, 0});
//        for (int color : colors) {
//            SimpleSeriesRenderer r = new SimpleSeriesRenderer();
//            r.setColor(color);
//            renderer.addSeriesRenderer(r);
//        }
//        return renderer;
//    }
//
//    /**
//     * Builds a category series using the provided values.
//     *
//     * @param title the series titles
//     * @param values the values
//     * @return the category series
//     */
//    protected CategorySeries buildCategoryDataset(String title, double[] values) {
//        CategorySeries series = new CategorySeries(title);
//        int k = 0;
//        for (double value : values) {
//            series.add("Project " + ++k, value);
//        }
//
//        return series;
//    }
//
//
//    public void createPieChartForm() {
//
//        // Generate the values
//        double[] values = new double[]{12, 14, 11, 10, 19};
//
//        // Set up the renderer
//        int[] colors = new int[]{ColorUtil.BLUE, ColorUtil.GREEN, ColorUtil.MAGENTA, ColorUtil.YELLOW, ColorUtil.CYAN};
//        DefaultRenderer renderer = buildCategoryRenderer(colors);
//        renderer.setZoomButtonsVisible(true);
//        renderer.setZoomEnabled(true);
//        renderer.setChartTitleTextSize(20);
//        renderer.setDisplayValues(true);
//        renderer.setShowLabels(true);
//        SimpleSeriesRenderer r = renderer.getSeriesRendererAt(0);
//        r.setGradientEnabled(true);
//        r.setGradientStart(0, ColorUtil.BLUE);
//        r.setGradientStop(0, ColorUtil.GREEN);
//        r.setHighlighted(true);
//
//        // Create the chart ... pass the values and renderer to the chart object.
//        PieChart chart = new PieChart(buildCategoryDataset("Project budget", values), renderer);
//
//        // Wrap the chart in a Component so we can add it to a form
//        ChartComponent c = new ChartComponent(chart);
//
//        // Create a form and show it.
//        Form f = new Form("Budget");
//        f.setLayout(new BorderLayout());
//        f.addComponent(BorderLayout.CENTER, c);
//        f.show();
//    }
}
