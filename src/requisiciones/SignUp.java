/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requisiciones;

import BD.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SignUp extends javax.swing.JFrame {

    public Conexion consultas = new Conexion();
    String nombre;
    String contra;
    String confir;
    String puesto;
    Integer nivel;

    public SignUp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void registrar() {
        nombre = txtName.getText();
        contra = txtPassword.getText();
        confir = txtConfirmPassword.getText();
        puesto = cbPuesto.getSelectedItem().toString();
        nivel = Integer.parseInt(cbNivel.getSelectedItem().toString());

        if (contra.equals(confir)) {
            if (chbAgree.isSelected() == true) {
                if (consultas.agregarUsuario(nombre, contra, puesto, nivel)) {
                    JOptionPane.showMessageDialog(null, "Los datos fueron guardados exitosamente", "Aceptar", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    new Menu().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Los datos no pudieron ser guardados", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Acepte los termino y condiciones para continuar");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, vuelve a intentarlo");
            txtConfirmPassword.requestFocus();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblConfirmPassword = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        chbAgree = new javax.swing.JCheckBox();
        txtName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblName = new javax.swing.JLabel();
        pnlBtnSignUp = new javax.swing.JPanel();
        lblSignUp = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        lblNivel = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblHome = new javax.swing.JLabel();
        cbPuesto = new javax.swing.JComboBox<>();
        cbNivel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        lblConfirmPassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(204, 204, 204));
        lblConfirmPassword.setText("CONFIRMAR CONTRASEÑA");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        chbAgree.setBackground(new java.awt.Color(36, 47, 65));
        chbAgree.setForeground(new java.awt.Color(255, 255, 255));
        chbAgree.setSelected(true);
        chbAgree.setText("Acepto los terminos y condiciones");
        chbAgree.setBorder(null);

        txtName.setBackground(new java.awt.Color(36, 47, 65));
        txtName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 204, 204));
        lblPassword.setText("CONTRASEÑA");

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

        lblName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 204, 204));
        lblName.setText("NOMBRE");

        pnlBtnSignUp.setBackground(new java.awt.Color(97, 212, 195));
        pnlBtnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnSignUpMouseClicked(evt);
            }
        });
        pnlBtnSignUp.setLayout(null);

        lblSignUp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(36, 47, 65));
        lblSignUp.setText("      REGISTRAR");
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignUpMouseClicked(evt);
            }
        });
        pnlBtnSignUp.add(lblSignUp);
        lblSignUp.setBounds(0, 0, 150, 40);

        lblPuesto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(204, 204, 204));
        lblPuesto.setText("PUESTO");

        txtConfirmPassword.setBackground(new java.awt.Color(36, 47, 65));
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.setText("jPasswordField1");
        txtConfirmPassword.setBorder(null);
        txtConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmPasswordFocusGained(evt);
            }
        });
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyTyped(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        lblNivel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(204, 204, 204));
        lblNivel.setText("NIVEL");

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        lblHome.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblHome.setForeground(new java.awt.Color(204, 204, 204));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/home.png"))); // NOI18N
        lblHome.setToolTipText("");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        cbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Requisitor", "Aprobador", "Comprador", "Administrador" }));
        cbPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPuestoActionPerformed(evt);
            }
        });

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(chbAgree))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblConfirmPassword)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(lblPassword)
                                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(lblName)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(lblPuesto)
                                    .addComponent(lblNivel)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(cbNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(pnlBtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(chbAgree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        txtName.setText("");
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordFocusGained

    private void lblSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseClicked
        registrar();
    }//GEN-LAST:event_lblSignUpMouseClicked

    private void pnlBtnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnSignUpMouseClicked
        registrar();
    }//GEN-LAST:event_pnlBtnSignUpMouseClicked

    private void txtConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFocusGained
        txtConfirmPassword.setText("");
    }//GEN-LAST:event_txtConfirmPasswordFocusGained

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();
        if ((c < 65 || c > 90) && (c < 97 || c > 122)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        char c = evt.getKeyChar();
        if ((c < 48 || c > 57) && (c < 65 || c > 90) && (c < 97 || c > 122)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtConfirmPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyTyped
        char c = evt.getKeyChar();
        if ((c < 48 || c > 57) && (c < 65 || c > 90) && (c < 97 || c > 122)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtConfirmPasswordKeyTyped

    private void cbPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPuestoActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbNivel;
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JCheckBox chbAgree;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JPanel pnlBtnSignUp;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
