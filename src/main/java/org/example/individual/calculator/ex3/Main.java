package org.example.individual.calculator.ex3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Main {
    public static double calculateExpression(double x, double a, double b, double c) {

        double exp = Math.pow(b - c, 2);

        double r1 = exp * a;

        double r2 = Math.pow(x, 2) + c;

        double r3 = Math.pow(c - x, 2);

        double r4 = Math.log(r2);

        double r5 = Math.exp(r3);

        return (r1 / r4) + r5;
    }

    public static void createChart() {
        XYSeries series = new XYSeries("f(x)");

        double a = 3.12;
        double b = 2.14;
        double c = 1.21;

        for (double x = -10; x <= 10; x += 0.1) {
            double y = calculateExpression(x, a, b, c);
            series.add(x, y);
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart
                ("Графік виразу", "x", "f(x)", dataset);

        JFrame frame = new JFrame("Графік функції");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createChart);
    }
}