package view;

import controller.LoginController;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * GUI for login screen.
 *
 * @author Michael Neuper
 * <a href="mailto:michael@michaelneuper.com">michael@michaelneuper.com</a>
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    LoginController controller = new LoginController();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWest = new javax.swing.JPanel();
        jPanelWelcomeText = new javax.swing.JPanel();
        jLabelWelcome = new javax.swing.JLabel();
        jPanelLoginText = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jPanelFields = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelMobileNumber = new javax.swing.JLabel();
        jLabelDateOfBirth = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldMobileNumber = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jSeparatorUsername = new javax.swing.JSeparator();
        jSeparatorEmail = new javax.swing.JSeparator();
        jSeparatorMobileNumber = new javax.swing.JSeparator();
        jSeparatorPassword = new javax.swing.JSeparator();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanelCenter = new javax.swing.JPanel();
        jLabelCardsIcon = new javax.swing.JLabel();
        jButtonPlay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("librejack login");
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(835, 430));

        jPanelWest.setBackground(new java.awt.Color(0, 102, 0));
        jPanelWest.setPreferredSize(new java.awt.Dimension(415, 430));

        jPanelWelcomeText.setBackground(new java.awt.Color(0, 102, 0));
        jPanelWelcomeText.setPreferredSize(new java.awt.Dimension(415, 70));

        jLabelWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(204, 204, 204));
        jLabelWelcome.setText("WELCOME TO LIBREJACK");

        javax.swing.GroupLayout jPanelWelcomeTextLayout = new javax.swing.GroupLayout(jPanelWelcomeText);
        jPanelWelcomeText.setLayout(jPanelWelcomeTextLayout);
        jPanelWelcomeTextLayout.setHorizontalGroup(
            jPanelWelcomeTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWelcomeTextLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabelWelcome)
                .addGap(63, 63, 63))
        );
        jPanelWelcomeTextLayout.setVerticalGroup(
            jPanelWelcomeTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeTextLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelWelcome)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelWest.add(jPanelWelcomeText);

        jPanelLoginText.setBackground(new java.awt.Color(0, 102, 0));
        jPanelLoginText.setPreferredSize(new java.awt.Dimension(415, 40));

        jLabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(204, 204, 204));
        jLabelLogin.setText("Login");

        javax.swing.GroupLayout jPanelLoginTextLayout = new javax.swing.GroupLayout(jPanelLoginText);
        jPanelLoginText.setLayout(jPanelLoginTextLayout);
        jPanelLoginTextLayout.setHorizontalGroup(
            jPanelLoginTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginTextLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabelLogin)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanelLoginTextLayout.setVerticalGroup(
            jPanelLoginTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginTextLayout.createSequentialGroup()
                .addComponent(jLabelLogin)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanelWest.add(jPanelLoginText);

        jPanelFields.setBackground(new java.awt.Color(0, 102, 0));
        jPanelFields.setPreferredSize(new java.awt.Dimension(415, 315));

        jLabelUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(204, 204, 204));
        jLabelUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/user.png"))); // NOI18N
        jLabelUsername.setText("Username:");

        jLabelMobileNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelMobileNumber.setForeground(new java.awt.Color(204, 204, 204));
        jLabelMobileNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/phone.png"))); // NOI18N
        jLabelMobileNumber.setText("Mobile Number:");

        jLabelDateOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDateOfBirth.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDateOfBirth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/calendar.png"))); // NOI18N
        jLabelDateOfBirth.setText("Date of Birth:");

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(204, 204, 204));
        jLabelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/lock.png"))); // NOI18N
        jLabelPassword.setText("Password:");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/email.png"))); // NOI18N
        jLabelEmail.setText("Email:");

        jTextFieldUsername.setBackground(new java.awt.Color(0, 102, 0));
        jTextFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUsername.setText("PenguinPancakes69");
        jTextFieldUsername.setBorder(null);
        jTextFieldUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUsernameMouseClicked(evt);
            }
        });

        jTextFieldEmail.setBackground(new java.awt.Color(0, 102, 0));
        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldEmail.setText("john.doe@example.com");
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldEmailMouseClicked(evt);
            }
        });
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jTextFieldMobileNumber.setBackground(new java.awt.Color(0, 102, 0));
        jTextFieldMobileNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldMobileNumber.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldMobileNumber.setText("082 738 9016");
        jTextFieldMobileNumber.setBorder(null);
        jTextFieldMobileNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldMobileNumberMouseClicked(evt);
            }
        });

        jPasswordField.setBackground(new java.awt.Color(0, 102, 0));
        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setText("Password@12345");
        jPasswordField.setBorder(null);
        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldMouseClicked(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jSeparatorUsername.setBackground(new java.awt.Color(204, 204, 204));

        jSeparatorEmail.setBackground(new java.awt.Color(204, 204, 204));

        jSeparatorMobileNumber.setBackground(new java.awt.Color(204, 204, 204));

        jSeparatorPassword.setBackground(new java.awt.Color(204, 204, 204));

        jDateChooser1.setBackground(new java.awt.Color(0, 102, 0));
        jDateChooser1.setForeground(new java.awt.Color(153, 153, 153));
        jDateChooser1.setToolTipText("");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelFieldsLayout = new javax.swing.GroupLayout(jPanelFields);
        jPanelFields.setLayout(jPanelFieldsLayout);
        jPanelFieldsLayout.setHorizontalGroup(
            jPanelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFieldsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsername)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelMobileNumber)
                    .addComponent(jLabelPassword)
                    .addComponent(jLabelDateOfBirth))
                .addGap(33, 33, 33)
                .addGroup(jPanelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparatorUsername)
                    .addComponent(jTextFieldUsername)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jTextFieldMobileNumber)
                    .addComponent(jPasswordField)
                    .addComponent(jSeparatorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jSeparatorMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparatorPassword))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanelFieldsLayout.setVerticalGroup(
            jPanelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFieldsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparatorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMobileNumber)
                    .addComponent(jTextFieldMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDateOfBirth)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFieldsLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelPassword))
                    .addGroup(jPanelFieldsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanelWest.add(jPanelFields);

        getContentPane().add(jPanelWest, java.awt.BorderLayout.WEST);

        jPanelCenter.setBackground(new java.awt.Color(0, 153, 51));
        jPanelCenter.setPreferredSize(new java.awt.Dimension(550, 430));

        jLabelCardsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cards_resized.png"))); // NOI18N

        jButtonPlay.setBackground(new java.awt.Color(0, 102, 0));
        jButtonPlay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonPlay.setForeground(new java.awt.Color(204, 204, 204));
        jButtonPlay.setText("PLAY");
        jButtonPlay.setBorder(null);
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCardsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabelCardsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed

    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        char[] passwordCh = jPasswordField.getPassword();
        String password = new String(passwordCh); // convert password to string
        Date selectedDate = jDateChooser1.getDate();
        if (controller.areAllFieldsValid(
                jTextFieldEmail.getText(),
                jTextFieldMobileNumber.getText(),
                selectedDate,
                password)) {
            new MainGUI().setVisible(true); // open the game window
            this.dispose(); // close the login screen
        }
    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jTextFieldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsernameMouseClicked
        jTextFieldUsername.setText("");
    }//GEN-LAST:event_jTextFieldUsernameMouseClicked

    private void jTextFieldEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEmailMouseClicked
        jTextFieldEmail.setText("");
    }//GEN-LAST:event_jTextFieldEmailMouseClicked

    private void jTextFieldMobileNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMobileNumberMouseClicked
        jTextFieldMobileNumber.setText("");
    }//GEN-LAST:event_jTextFieldMobileNumberMouseClicked

    private void jPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMouseClicked
        jPasswordField.setText("");
    }//GEN-LAST:event_jPasswordFieldMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPlay;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabelCardsIcon;
    private javax.swing.JLabel jLabelDateOfBirth;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMobileNumber;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelFields;
    private javax.swing.JPanel jPanelLoginText;
    private javax.swing.JPanel jPanelWelcomeText;
    private javax.swing.JPanel jPanelWest;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparatorEmail;
    private javax.swing.JSeparator jSeparatorMobileNumber;
    private javax.swing.JSeparator jSeparatorPassword;
    private javax.swing.JSeparator jSeparatorUsername;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMobileNumber;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
