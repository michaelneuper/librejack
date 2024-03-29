package view;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * GUI to display the following options:
 * <ul>
 * <li>Statistics</li>
 * <li>Rules</li>
 * <li>Source</li>
 * </ul>
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class MenuUI extends javax.swing.JFrame {

    /**
     * Creates new form OptionsUI
     */
    public MenuUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNorth = new javax.swing.JPanel();
        jLabelMenu = new javax.swing.JLabel();
        jPanelCenter = new javax.swing.JPanel();
        jButtonStatistics = new javax.swing.JButton();
        jButtonRules = new javax.swing.JButton();
        jButtonSource = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setAlwaysOnTop(true);

        jLabelMenu.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelMenu.setText("Menu");

        javax.swing.GroupLayout jPanelNorthLayout = new javax.swing.GroupLayout(jPanelNorth);
        jPanelNorth.setLayout(jPanelNorthLayout);
        jPanelNorthLayout.setHorizontalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabelMenu)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanelNorthLayout.setVerticalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelNorth, java.awt.BorderLayout.NORTH);

        jButtonStatistics.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/stats.png"))); // NOI18N
        jButtonStatistics.setText("STATISTICS");
        jButtonStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatisticsActionPerformed(evt);
            }
        });

        jButtonRules.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRules.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/question.png"))); // NOI18N
        jButtonRules.setText("RULES");
        jButtonRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRulesActionPerformed(evt);
            }
        });

        jButtonSource.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/code.png"))); // NOI18N
        jButtonSource.setText("SOURCE");
        jButtonSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSourceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSource, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRules, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonStatistics))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButtonStatistics)
                .addGap(59, 59, 59)
                .addComponent(jButtonRules)
                .addGap(59, 59, 59)
                .addComponent(jButtonSource)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSourceActionPerformed
        try {
            // get the user's default browser
            Desktop desktop = Desktop.getDesktop();
            // open the URL in the default browser
            desktop.browse(new URI("https://github.com/michaelneuper/librejack"));
        } catch (IOException | URISyntaxException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButtonSourceActionPerformed

    private void jButtonStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatisticsActionPerformed
        new StatisticsUI().setVisible(true);
    }//GEN-LAST:event_jButtonStatisticsActionPerformed

    private void jButtonRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRulesActionPerformed
        new RulesUI().setVisible(true);
    }//GEN-LAST:event_jButtonRulesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the FlatDarkLaf look and feel */
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println(e);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainUI().setVisible(true);
        });

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRules;
    private javax.swing.JButton jButtonSource;
    private javax.swing.JButton jButtonStatistics;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelNorth;
    // End of variables declaration//GEN-END:variables
}
