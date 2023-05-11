package view;

import com.formdev.flatlaf.FlatDarkLaf;
import controller.Controller;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Main GUI.
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class MainUI extends javax.swing.JFrame {

    Controller game = new Controller();

    /**
     * Creates new form MainUI
     */
    public MainUI() {
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
        jLabelResult = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelEast = new javax.swing.JPanel();
        jButtonHit = new javax.swing.JButton();
        jButtonStand = new javax.swing.JButton();
        jButtonDoubleDown = new javax.swing.JButton();
        jButtonSurrender = new javax.swing.JButton();
        jButtonDeal = new javax.swing.JButton();
        jPanelWest = new javax.swing.JPanel();
        jLabelBalance = new javax.swing.JLabel();
        jLabelCurrentBet = new javax.swing.JLabel();
        jLabelCurrentBetAmount = new javax.swing.JLabel();
        jButtonChangeBet = new javax.swing.JButton();
        jPanelCenter = new javax.swing.JPanel();
        jPanelDealer = new javax.swing.JPanel();
        jPanelDealerText = new javax.swing.JPanel();
        jLabelDealer = new javax.swing.JLabel();
        jLabelDealerCard1 = new javax.swing.JLabel();
        jLabelDealerCard2 = new javax.swing.JLabel();
        jLabelDealerCard3 = new javax.swing.JLabel();
        jLabelDealerCard4 = new javax.swing.JLabel();
        jPanelPlayer = new javax.swing.JPanel();
        jPanelPlayerText = new javax.swing.JPanel();
        jLabelPlayerCard4 = new javax.swing.JLabel();
        jLabelPlayer = new javax.swing.JLabel();
        jLabelPlayerCard2 = new javax.swing.JLabel();
        jLabelPlayerCard1 = new javax.swing.JLabel();
        jLabelPlayerCard3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("librejack");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icons/heart_cards.png")));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelNorth.setBackground(new java.awt.Color(0, 102, 51));

        jLabelResult.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelResult.setText("WELCOME");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/menu_burger.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNorthLayout = new javax.swing.GroupLayout(jPanelNorth);
        jPanelNorth.setLayout(jPanelNorthLayout);
        jPanelNorthLayout.setHorizontalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNorthLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanelNorthLayout.setVerticalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelNorth, java.awt.BorderLayout.NORTH);

        jPanelEast.setBackground(new java.awt.Color(0, 102, 51));
        jPanelEast.setPreferredSize(new java.awt.Dimension(200, 498));

        jButtonHit.setBackground(new java.awt.Color(0, 204, 51));
        jButtonHit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonHit.setForeground(new java.awt.Color(102, 102, 102));
        jButtonHit.setText("HIT");
        jButtonHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitActionPerformed(evt);
            }
        });

        jButtonStand.setBackground(new java.awt.Color(255, 153, 0));
        jButtonStand.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonStand.setForeground(new java.awt.Color(102, 102, 102));
        jButtonStand.setText("STAND");
        jButtonStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStandActionPerformed(evt);
            }
        });

        jButtonDoubleDown.setBackground(new java.awt.Color(102, 0, 255));
        jButtonDoubleDown.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonDoubleDown.setText("<html>\nDOUBLE\n<br>\n<center>DOWN</center>\n</html>");
        jButtonDoubleDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoubleDownActionPerformed(evt);
            }
        });

        jButtonSurrender.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSurrender.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonSurrender.setForeground(new java.awt.Color(102, 102, 102));
        jButtonSurrender.setText("SURRENDER");
        jButtonSurrender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSurrenderActionPerformed(evt);
            }
        });

        jButtonDeal.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonDeal.setText("DEAL");
        jButtonDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDealActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEastLayout = new javax.swing.GroupLayout(jPanelEast);
        jPanelEast.setLayout(jPanelEastLayout);
        jPanelEastLayout.setHorizontalGroup(
            jPanelEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEastLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanelEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonHit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonStand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDoubleDown, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSurrender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jButtonDeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEastLayout.setVerticalGroup(
            jPanelEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEastLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButtonHit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonStand, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDoubleDown, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSurrender)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeal, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelEast, java.awt.BorderLayout.EAST);

        jPanelWest.setBackground(new java.awt.Color(0, 102, 51));
        jPanelWest.setForeground(new java.awt.Color(0, 204, 51));
        jPanelWest.setPreferredSize(new java.awt.Dimension(150, 498));

        jLabelBalance.setBackground(new java.awt.Color(102, 102, 0));
        jLabelBalance.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelBalance.setForeground(new java.awt.Color(255, 255, 0));
        jLabelBalance.setText("R " + game.getBalance());

        jLabelCurrentBet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCurrentBet.setText("Current Bet:");

        jLabelCurrentBetAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCurrentBetAmount.setText("R 100");

        jButtonChangeBet.setBackground(new java.awt.Color(0, 204, 204));
        jButtonChangeBet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonChangeBet.setForeground(new java.awt.Color(102, 102, 102));
        jButtonChangeBet.setText("<html>\nCHANGE\n<br>\n<center>BET</center>\n</html>");
        jButtonChangeBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeBetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelWestLayout = new javax.swing.GroupLayout(jPanelWest);
        jPanelWest.setLayout(jPanelWestLayout);
        jPanelWestLayout.setHorizontalGroup(
            jPanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWestLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChangeBet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCurrentBetAmount)
                    .addComponent(jLabelCurrentBet)
                    .addComponent(jLabelBalance))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelWestLayout.setVerticalGroup(
            jPanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWestLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelCurrentBet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCurrentBetAmount)
                .addGap(32, 32, 32)
                .addComponent(jButtonChangeBet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelWest, java.awt.BorderLayout.WEST);

        jPanelCenter.setBackground(new java.awt.Color(0, 102, 51));
        jPanelCenter.setPreferredSize(new java.awt.Dimension(400, 498));

        jPanelDealer.setBackground(new java.awt.Color(0, 102, 51));

        jPanelDealerText.setBackground(new java.awt.Color(0, 102, 51));

        jLabelDealer.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabelDealer.setText("Dealer");

        jLabelDealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cards/back.png"))); // NOI18N

        jLabelDealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cards/back.png"))); // NOI18N

        jLabelDealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cards/back.png"))); // NOI18N

        jLabelDealerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cards/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanelDealerTextLayout = new javax.swing.GroupLayout(jPanelDealerText);
        jPanelDealerText.setLayout(jPanelDealerTextLayout);
        jPanelDealerTextLayout.setHorizontalGroup(
            jPanelDealerTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDealerTextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDealerTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDealer)
                    .addGroup(jPanelDealerTextLayout.createSequentialGroup()
                        .addComponent(jLabelDealerCard1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDealerCard2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDealerCard3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDealerCard4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDealerTextLayout.setVerticalGroup(
            jPanelDealerTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDealerTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDealer)
                .addGap(18, 18, 18)
                .addGroup(jPanelDealerTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDealerCard1)
                    .addComponent(jLabelDealerCard2)
                    .addComponent(jLabelDealerCard3)
                    .addComponent(jLabelDealerCard4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDealerLayout = new javax.swing.GroupLayout(jPanelDealer);
        jPanelDealer.setLayout(jPanelDealerLayout);
        jPanelDealerLayout.setHorizontalGroup(
            jPanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDealerText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDealerLayout.setVerticalGroup(
            jPanelDealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDealerLayout.createSequentialGroup()
                .addComponent(jPanelDealerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPlayer.setBackground(new java.awt.Color(0, 102, 51));

        jPanelPlayerText.setBackground(new java.awt.Color(0, 102, 51));

        jLabelPlayerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cards/back.png"))); // NOI18N
        jLabelPlayerCard4.setText(" ");

        javax.swing.GroupLayout jPanelPlayerTextLayout = new javax.swing.GroupLayout(jPanelPlayerText);
        jPanelPlayerText.setLayout(jPanelPlayerTextLayout);
        jPanelPlayerTextLayout.setHorizontalGroup(
            jPanelPlayerTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlayerTextLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelPlayerCard4)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanelPlayerTextLayout.setVerticalGroup(
            jPanelPlayerTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlayerTextLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabelPlayerCard4)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        jLabelPlayer.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabelPlayer.setText("You");

        jLabelPlayerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cards/back.png"))); // NOI18N

        jLabelPlayerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cards/back.png"))); // NOI18N
        jLabelPlayerCard1.setToolTipText("");

        jLabelPlayerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cards/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanelPlayerLayout = new javax.swing.GroupLayout(jPanelPlayer);
        jPanelPlayer.setLayout(jPanelPlayerLayout);
        jPanelPlayerLayout.setHorizontalGroup(
            jPanelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPlayer)
                    .addGroup(jPanelPlayerLayout.createSequentialGroup()
                        .addComponent(jLabelPlayerCard2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPlayerCard1)))
                .addGap(18, 18, 18)
                .addComponent(jLabelPlayerCard3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPlayerText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanelPlayerLayout.setVerticalGroup(
            jPanelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlayerLayout.createSequentialGroup()
                .addComponent(jPanelPlayerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelPlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPlayer)
                .addGap(18, 18, 18)
                .addGroup(jPanelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPlayerCard2)
                    .addComponent(jLabelPlayerCard1)
                    .addComponent(jLabelPlayerCard3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addComponent(jPanelDealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDoubleDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoubleDownActionPerformed
        game.setBet(game.getBet() * 2); // double the bet
        game.hitPlayer();
        game.setBet(game.getBet() / 2); // reset bet back to original bet
        buttonPressed();
    }//GEN-LAST:event_jButtonDoubleDownActionPerformed

    private void jButtonSurrenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSurrenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSurrenderActionPerformed

    private void jButtonDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDealActionPerformed
        jLabelResult.setText(""); // clear the last result
        jLabelBalance.setText("R " + game.getBalance()); // update the balance
        game.startRound();
        jLabelDealerCard1.setIcon(new ImageIcon(getClass().getResource(game.getDealerCardFilePath(0))));
        jLabelDealerCard2.setIcon(new ImageIcon(getClass().getResource("/assets/cards/back.png")));
        jLabelDealerCard3.setIcon(new ImageIcon(getClass().getResource("/assets/cards/back.png")));
        jLabelDealerCard4.setIcon(new ImageIcon(getClass().getResource("/assets/cards/back.png")));

        jLabelDealer.setText("Dealer: " + game.displayDealerFirstCardValue());
        printPlayerHand();
    }//GEN-LAST:event_jButtonDealActionPerformed

    private void jButtonStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStandActionPerformed
        printDealerHand();
        jLabelResult.setText(game.checkWhoWins());
        printDealerHand();
        jLabelBalance.setText("R " + game.getBalance()); // update the balance
    }//GEN-LAST:event_jButtonStandActionPerformed

    private void jButtonHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitActionPerformed
        game.hitPlayer();
        buttonPressed();
    }//GEN-LAST:event_jButtonHitActionPerformed

    private void jButtonChangeBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeBetActionPerformed
        game.setBet(Double.parseDouble(JOptionPane.showInputDialog("Enter the bet amount")));
        jLabelCurrentBetAmount.setText("R " + Double.toString(game.getBet()));
    }//GEN-LAST:event_jButtonChangeBetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    }

    private void buttonPressed() {
        printPlayerHand();
        printDealerHand();
        jLabelResult.setText(game.checkWhoWins());
        jLabelBalance.setText("R " + game.getBalance()); // update the balance
    }

    private void printDealerHand() {
        jLabelDealer.setText("Dealer: " + game.displayDealerHandValue());
        jLabelDealerCard1.setIcon(new ImageIcon(getClass().getResource(game.getDealerCardFilePath(0))));
        jLabelDealerCard2.setIcon(new ImageIcon(getClass().getResource(game.getDealerCardFilePath(1))));
        jLabelDealerCard3.setIcon(new ImageIcon(getClass().getResource(game.getDealerCardFilePath(2))));
        jLabelDealerCard4.setIcon(new ImageIcon(getClass().getResource(game.getDealerCardFilePath(3))));

    }

    private void printPlayerHand() {
        jLabelPlayer.setText("You: " + game.displayPlayerHandValue());
        jLabelPlayerCard1.setIcon(new ImageIcon(getClass().getResource(game.getPlayerCardFilePath(0))));
        jLabelPlayerCard2.setIcon(new ImageIcon(getClass().getResource(game.getPlayerCardFilePath(1))));
        jLabelPlayerCard3.setIcon(new ImageIcon(getClass().getResource(game.getPlayerCardFilePath(2))));
        jLabelPlayerCard4.setIcon(new ImageIcon(getClass().getResource(game.getPlayerCardFilePath(3))));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonChangeBet;
    private javax.swing.JButton jButtonDeal;
    private javax.swing.JButton jButtonDoubleDown;
    private javax.swing.JButton jButtonHit;
    private javax.swing.JButton jButtonStand;
    private javax.swing.JButton jButtonSurrender;
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JLabel jLabelCurrentBet;
    private javax.swing.JLabel jLabelCurrentBetAmount;
    private javax.swing.JLabel jLabelDealer;
    private javax.swing.JLabel jLabelDealerCard1;
    private javax.swing.JLabel jLabelDealerCard2;
    private javax.swing.JLabel jLabelDealerCard3;
    private javax.swing.JLabel jLabelDealerCard4;
    private javax.swing.JLabel jLabelPlayer;
    private javax.swing.JLabel jLabelPlayerCard1;
    private javax.swing.JLabel jLabelPlayerCard2;
    private javax.swing.JLabel jLabelPlayerCard3;
    private javax.swing.JLabel jLabelPlayerCard4;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelDealer;
    private javax.swing.JPanel jPanelDealerText;
    private javax.swing.JPanel jPanelEast;
    private javax.swing.JPanel jPanelNorth;
    private javax.swing.JPanel jPanelPlayer;
    private javax.swing.JPanel jPanelPlayerText;
    private javax.swing.JPanel jPanelWest;
    // End of variables declaration//GEN-END:variables
}
