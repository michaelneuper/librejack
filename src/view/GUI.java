package view;

import controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class GUI extends javax.swing.JFrame {
    
    Controller game = new Controller();

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("librejack");
        setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        jLabelBalance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelBalance.setText("Balance: " + game.getBalance());
        getContentPane().add(jLabelBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 220, 40));

        jButtonDouble.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDouble.setText("DOUBLE DOWN");
        jButtonDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoubleActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDouble, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, 190, 120));

        jButtonStand.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonStand.setText("STAND");
        jButtonStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStandActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStand, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 190, 110));

        jButtonHit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonHit.setText("HIT");
        jButtonHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 190, 110));

        jButtonDeal.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButtonDeal.setText("DEAL");
        jButtonDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDealActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 460, 120));

        jButtonBetAmount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBetAmount.setText("Change Bet Amount");
        jButtonBetAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBetAmountActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBetAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 220, 60));

        jLabelCurrentBet.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelCurrentBet.setText("Current Bet: " + game.getBet());
        getContentPane().add(jLabelCurrentBet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 200, 50));

        jLabelResult.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelResult.setText(game.checkWhoWins());
        getContentPane().add(jLabelResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 1120, 130));
        getContentPane().add(jLabelDisplayDealerHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 440, 160));

        jLabelDisplayPlayerHand.setText(game.displayPlayerHand());
        getContentPane().add(jLabelDisplayPlayerHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 400, 150));

        jLabelDealerHand.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelDealerHand.setText("Dealer's Hand:");
        getContentPane().add(jLabelDealerHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 270, 30));

        jLabelPlayerHand.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelPlayerHand.setText("Your Hand:");
        getContentPane().add(jLabelPlayerHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 210, 30));

        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1132, 713, 120, 50));

        jLabelDealerHandValue.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        getContentPane().add(jLabelDealerHandValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 247, 80, 40));

        jLabelPlayerHandValue.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        getContentPane().add(jLabelPlayerHandValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 60, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDealActionPerformed
        jLabelResult.setText(""); // clear the last result
        jLabelBalance.setText(Double.toString(game.getBalance())); // update the balance
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
        jLabelBalance.setText(Double.toString(game.getBalance())); // update the balance
    }//GEN-LAST:event_jButtonStandActionPerformed

    private void jButtonDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoubleActionPerformed
        game.setBet(game.getBet() * 2); // double the bet
        game.hitPlayer();
        game.setBet(game.getBet() / 2); // reset bet back to original bet
        printPlayerHand();
        printDealerHand();
        jLabelResult.setText(game.checkWhoWins());
        jLabelBalance.setText(Double.toString(game.getBalance())); // update the balance
    }//GEN-LAST:event_jButtonDoubleActionPerformed

    private void jButtonHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitActionPerformed
        game.hitPlayer();
        printPlayerHand();
        printDealerHand();
        jLabelResult.setText(game.checkWhoWins());
        jLabelBalance.setText(Double.toString(game.getBalance())); // update the balance
    }//GEN-LAST:event_jButtonHitActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO: add exit operation
    }//GEN-LAST:event_jButtonExitActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
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
