/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requisiciones;

import BD.Conexion;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author beto
 */
public class Requisiciones extends javax.swing.JFrame {

    //Boolean pnlLogInActive = Boolean.TRUE;
    public Conexion cone = new Conexion();
    public String usuarioid;

    public Requisiciones() {
        initComponents();
        setLocationRelativeTo(null);
        /**
         * si.setBounds(0, 0, 460, 540); si.setVisible(Boolean.TRUE);
         * pnlRight.add(si);
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        pnlRight = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        pnlBtnSignIn = new javax.swing.JPanel();
        lblSignUp = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLeft.setBackground(new java.awt.Color(97, 212, 195));
        pnlLeft.setPreferredSize(new java.awt.Dimension(460, 540));

        lblIcon.setBackground(new java.awt.Color(36, 47, 65));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user.png"))); // NOI18N

        lblTitle.setBackground(new java.awt.Color(36, 47, 65));
        lblTitle.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitle.setText("SISTEMA DE REQUISICIONES");

        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(36, 47, 65)));

        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(36, 47, 65)));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlLeftLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2)))
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lblIcon)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIcon)
                .addGap(38, 38, 38)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        getContentPane().add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        pnlRight.setBackground(new java.awt.Color(36, 47, 65));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        pnlBtnSignIn.setBackground(new java.awt.Color(97, 212, 195));
        pnlBtnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnSignInMouseClicked(evt);
            }
        });
        pnlBtnSignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignUp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(36, 47, 65));
        lblSignUp.setText("         ENTRAR");
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignUpMouseClicked(evt);
            }
        });
        pnlBtnSignIn.add(lblSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 40));

        txtPassword.setBackground(new java.awt.Color(36, 47, 65));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 204, 204));
        lblPassword.setText("Contraseña");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        txtEmail.setBackground(new java.awt.Color(36, 47, 65));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Ingresa tu Usuario aqui");
        txtEmail.setBorder(null);
        txtEmail.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(204, 204, 204));
        lblEmail.setText("Usuario");

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(pnlBtnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblEmail)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lblPassword)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(pnlBtnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseClicked
        String usuario = txtEmail.getText();
        String pass = txtPassword.getText();

        boolean inicio = false;
        inicio = cone.login(usuario, pass);

        if (inicio == true) {
            this.setVisible(Boolean.FALSE);
            new Menu().setVisible(true);

        } else {
            txtEmail.setText("");
            txtPassword.setText("");
            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
        }
    }//GEN-LAST:event_lblSignUpMouseClicked

    private void pnlBtnSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnSignInMouseClicked
        String usuario = txtEmail.getText();
        String pass = txtPassword.getText();

        boolean inicio = false;
        inicio = cone.login(usuario, pass);

        if (inicio == true) {
            this.setVisible(Boolean.FALSE);
            new Menu().setVisible(true);
        } else {
            txtEmail.setText("");
            txtPassword.setText("");
            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
        }
    }//GEN-LAST:event_pnlBtnSignInMouseClicked

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setText("");
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        char c = evt.getKeyChar();
        if ((c < 48 || c > 57) && (c < 65 || c > 90) && (c < 97 || c > 122)) {
            getToolkit().beep();
            evt.consume();
        }
        char Tecla = evt.getKeyChar();
        if (Tecla == KeyEvent.VK_ENTER) {
            String usuario = txtEmail.getText();
            String pass = txtPassword.getText();

            boolean inicio = false;
            inicio = cone.login(usuario, pass);

            if (inicio == true) {
                this.setVisible(Boolean.FALSE);
                new Menu().setVisible(true);

            } else {
                txtEmail.setText("");
                txtPassword.setText("");
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        char c = evt.getKeyChar();
        if ((c < 48 || c > 57) && (c < 65 || c > 90) && (c < 97 || c > 122)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

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
            java.util.logging.Logger.getLogger(Requisiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requisiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requisiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requisiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requisiciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBtnSignIn;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
