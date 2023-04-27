package view;

import controller.Controller;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class MainGUI extends javax.swing.JFrame {

    Controller game = new Controller();

    /**
     * Creates new form GUI
     */
    public MainGUI() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabelBalance = new javax.swing.JLabel();
        jButtonDouble = new javax.swing.JButton();
        jButtonStand = new javax.swing.JButton();
        jButtonHit = new javax.swing.JButton();
        jButtonDeal = new javax.swing.JButton();
        jButtonBetAmount = new javax.swing.JButton();
        jLabelCurrentBet = new javax.swing.JLabel();
        jLabelResult = new javax.swing.JLabel();
        jLabelDisplayDealerHand = new javax.swing.JLabel();
        jLabelDisplayPlayerHand = new javax.swing.JLabel();
        jLabelDealerHand = new javax.swing.JLabel();
        jLabelPlayerHand = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jLabelDealerHandValue = new javax.swing.JLabel();
        jLabelPlayerHandValue = new javax.swing.JLabel();
        jButtonStats = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("librejack");
        setForeground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabelBalance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelBalance.setText("Balance: " + game.getBalance());

        jButtonDouble.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDouble.setText("DOUBLE DOWN");
        jButtonDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoubleActionPerformed(evt);
            }
        });

        jButtonStand.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonStand.setText("STAND");
        jButtonStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStandActionPerformed(evt);
            }
        });

        jButtonHit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonHit.setText("HIT");
        jButtonHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitActionPerformed(evt);
            }
        });

        jButtonDeal.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButtonDeal.setText("DEAL");
        jButtonDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDealActionPerformed(evt);
            }
        });

        jButtonBetAmount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBetAmount.setText("Change Bet Amount");
        jButtonBetAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBetAmountActionPerformed(evt);
            }
        });

        jLabelCurrentBet.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCurrentBet.setText("Current Bet: " + game.getBet());

        jLabelResult.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelResult.setText(game.checkWhoWins());

        jLabelDisplayPlayerHand.setText(game.displayPlayerHand());

        jLabelDealerHand.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelDealerHand.setText("Dealer's Hand:");

        jLabelPlayerHand.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelPlayerHand.setText("Your Hand:");

        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelDealerHandValue.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        jLabelPlayerHandValue.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        jButtonStats.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonStats.setText("Show Statistics");
        jButtonStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelDealerHandValue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(196, 196, 196))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1132, 1132, 1132)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(144, 144, 144))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDisplayDealerHand, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelDealerHand, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelCurrentBet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonBetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelDisplayPlayerHand, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonStand, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonStats, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelPlayerHand, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelPlayerHandValue, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(288, 288, 288)
                                            .addComponent(jButtonHit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jButtonDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(jButtonDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(100, 100, 100)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButtonStats, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPlayerHand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonHit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDealerHand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPlayerHandValue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelDealerHandValue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDisplayDealerHand, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelDisplayPlayerHand, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addComponent(jLabelCurrentBet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButtonStand, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDealActionPerformed
        jLabelResult.setText(""); // clear the last result
        jLabelBalance.setText("Balance: " + game.getBalance()); // update the balance
        game.startRound();
        jLabelDisplayDealerHand.setText(game.displayDealerFirstCard());
        jLabelDealerHandValue.setText(game.displayDealerFirstCardValue());
        printPlayerHand();
    }//GEN-LAST:event_jButtonDealActionPerformed

    private void jButtonBetAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBetAmountActionPerformed
        game.setBet(Double.parseDouble(JOptionPane.showInputDialog("Enter the bet amount")));
        jLabelCurrentBet.setText("Current Bet: " + Double.toString(game.getBet()));
    }//GEN-LAST:event_jButtonBetAmountActionPerformed

    private void jButtonStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStandActionPerformed

        printDealerHand();
        jLabelResult.setText(game.checkWhoWins());
        printDealerHand();
        jLabelBalance.setText("Balance: " + game.getBalance()); // update the balance
    }//GEN-LAST:event_jButtonStandActionPerformed

    private void jButtonDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoubleActionPerformed
        game.setBet(game.getBet() * 2); // double the bet
        game.hitPlayer();
        game.setBet(game.getBet() / 2); // reset bet back to original bet
        printPlayerHand();
        printDealerHand();
        jLabelResult.setText(game.checkWhoWins());
        jLabelBalance.setText("Balance: " + game.getBalance()); // update the balance
    }//GEN-LAST:event_jButtonDoubleActionPerformed

    private void jButtonHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitActionPerformed
        game.hitPlayer();
        printPlayerHand();
        printDealerHand();
        jLabelResult.setText(game.checkWhoWins());
        jLabelBalance.setText("Balance: " + game.getBalance()); // update the balance
    }//GEN-LAST:event_jButtonHitActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatsActionPerformed
        try {
            new StatisticsGUI().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonStatsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainGUI().setVisible(true);
        });
    }

    public void printDealerHand() {
        jLabelDisplayDealerHand.setText(game.displayDealerHand());
        jLabelDealerHandValue.setText(game.displayDealerHandValue());
    }

    public void printPlayerHand() {
        jLabelDisplayPlayerHand.setText(game.displayPlayerHand());
        jLabelPlayerHandValue.setText(game.displayPlayerHandValue());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBetAmount;
    private javax.swing.JButton jButtonDeal;
    private javax.swing.JButton jButtonDouble;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonHit;
    private javax.swing.JButton jButtonStand;
    private javax.swing.JButton jButtonStats;
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JLabel jLabelCurrentBet;
    private javax.swing.JLabel jLabelDealerHand;
    private javax.swing.JLabel jLabelDealerHandValue;
    private javax.swing.JLabel jLabelDisplayDealerHand;
    private javax.swing.JLabel jLabelDisplayPlayerHand;
    private javax.swing.JLabel jLabelPlayerHand;
    private javax.swing.JLabel jLabelPlayerHandValue;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
