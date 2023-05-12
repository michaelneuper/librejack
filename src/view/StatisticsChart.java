package view;

import java.awt.Color;
import java.io.IOException;
import javax.swing.BorderFactory;
import model.Statistics;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 * The StatisticsChart class represents a panel that displays a pie chart based
 * on the statistics of a game. It uses the JFreeChart library to create and
 * display the chart.
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class StatisticsChart extends javax.swing.JPanel {

    Statistics stats;
    PieDataset dataset;
    JFreeChart chart;
    ChartPanel chartPanel;

    /**
     * Creates new form StatisticsChart
     */
    public StatisticsChart() {
        initComponents();
        createChart();
    }

    /**
     * Creates the chart panel and adds it to the panel.
     */
    private void createChart() {
        dataset = createDataset();
        chart = createChart(dataset, "");
        chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        chartPanel.setBackground(Color.DARK_GRAY);
        this.add(chartPanel);
    }

    /**
     * Creates a dataset based on the game statistics.
     *
     * @return the dataset for the chart
     */
    private PieDataset createDataset() {
        try {
            stats = Statistics.load();
        } catch (IOException e) {
            System.err.println(e);;
        }
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Wins", stats.getWins());
        result.setValue("Losses", stats.getLosses());
        result.setValue("Pushes", stats.getPushes());

        return result;
    }

    /**
     * Creates a pie chart based on the specified dataset and title.
     *
     * @param dataset dataset to use for the chart
     * @param title title to display on the chart
     * @return the chart object
     */
    private JFreeChart createChart(PieDataset dataset, String title) {

        JFreeChart chart = ChartFactory.createPieChart(
                title, // chart title
                dataset, // data
                true, // include legend
                true,
                false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);

        return chart;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
