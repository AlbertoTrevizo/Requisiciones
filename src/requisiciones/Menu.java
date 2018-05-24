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
public class Menu extends javax.swing.JFrame {

    public Conexion cone = new Conexion();
    public String nombreUsuario;

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequisiciones = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnRealizarReque = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblAgregarRequisicion = new javax.swing.JLabel();
        lblRequisiciones = new javax.swing.JLabel();
        lblCatalogo = new javax.swing.JLabel();
        lblBuscarRequisicion = new javax.swing.JLabel();
        lblMisRequisiciones = new javax.swing.JLabel();
        lblAprobaciones = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        lblAgregarUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRequisiciones.setText("Requisiciones");
        btnRequisiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequisicionesActionPerformed(evt);
            }
        });

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnRealizarReque.setText("Realizar Requisicion");
        btnRealizarReque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarRequeActionPerformed(evt);
            }
        });

        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar Sesion");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnCatalogo.setText("Catalogo de productos");
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        lblMenu.setBackground(new java.awt.Color(255, 255, 255));
        lblMenu.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/home.png"))); // NOI18N
        lblMenu.setText("Menu");
        lblMenu.setIconTextGap(7);

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Salir.png"))); // NOI18N
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        lblAgregarRequisicion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblAgregarRequisicion.setForeground(new java.awt.Color(204, 204, 204));
        lblAgregarRequisicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Añadir.png"))); // NOI18N
        lblAgregarRequisicion.setText(" Agregar Requisicion");
        lblAgregarRequisicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarRequisicionMouseClicked(evt);
            }
        });

        lblRequisiciones.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblRequisiciones.setForeground(new java.awt.Color(204, 204, 204));
        lblRequisiciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Requisicion.png"))); // NOI18N
        lblRequisiciones.setText(" Requisiciones");
        lblRequisiciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRequisicionesMouseClicked(evt);
            }
        });

        lblCatalogo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCatalogo.setForeground(new java.awt.Color(204, 204, 204));
        lblCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Lista.png"))); // NOI18N
        lblCatalogo.setText(" Catalogo");
        lblCatalogo.setPreferredSize(new java.awt.Dimension(215, 50));
        lblCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCatalogoMouseClicked(evt);
            }
        });

        lblBuscarRequisicion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblBuscarRequisicion.setForeground(new java.awt.Color(204, 204, 204));
        lblBuscarRequisicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Lupa.png"))); // NOI18N
        lblBuscarRequisicion.setText(" Buscar Requisicion");
        lblBuscarRequisicion.setPreferredSize(new java.awt.Dimension(215, 50));
        lblBuscarRequisicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarRequisicionMouseClicked(evt);
            }
        });

        lblMisRequisiciones.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblMisRequisiciones.setForeground(new java.awt.Color(204, 204, 204));
        lblMisRequisiciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Casa.png"))); // NOI18N
        lblMisRequisiciones.setText(" Mis Requisiciones");
        lblMisRequisiciones.setPreferredSize(new java.awt.Dimension(215, 50));
        lblMisRequisiciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisRequisicionesMouseClicked(evt);
            }
        });

        lblAprobaciones.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblAprobaciones.setForeground(new java.awt.Color(204, 204, 204));
        lblAprobaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Aprobar.png"))); // NOI18N
        lblAprobaciones.setText(" Aprobaciones");
        lblAprobaciones.setPreferredSize(new java.awt.Dimension(215, 50));
        lblAprobaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAprobacionesMouseClicked(evt);
            }
        });

        lblProductos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(204, 204, 204));
        lblProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Producto.png"))); // NOI18N
        lblProductos.setText(" Menu Productos");
        lblProductos.setPreferredSize(new java.awt.Dimension(215, 50));
        lblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductosMouseClicked(evt);
            }
        });

        lblProveedores.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblProveedores.setForeground(new java.awt.Color(204, 204, 204));
        lblProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Proveedor.png"))); // NOI18N
        lblProveedores.setText(" Menu Proveedores");
        lblProveedores.setPreferredSize(new java.awt.Dimension(215, 50));
        lblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseClicked(evt);
            }
        });

        lblAgregarUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblAgregarUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lblAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Usuario.png"))); // NOI18N
        lblAgregarUsuario.setText(" Agregar Usuario");
        lblAgregarUsuario.setPreferredSize(new java.awt.Dimension(215, 50));
        lblAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMenu)
                                .addGap(186, 186, 186)
                                .addComponent(lblSalir))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblBuscarRequisicion, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblAgregarRequisicion)
                                        .addGap(12, 12, 12))
                                    .addComponent(lblMisRequisiciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAprobaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRequisiciones)
                            .addComponent(lblProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu)
                    .addComponent(lblSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRequisiciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBuscarRequisicion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgregarRequisicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMisRequisiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAprobaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRealizarReque)
                    .addComponent(btnProductos)
                    .addComponent(btnRequisiciones)
                    .addComponent(btnCatalogo)
                    .addComponent(btnCerrar)
                    .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRealizarReque, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRequisiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequisicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequisicionesActionPerformed
        new MenuRequisiciones().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRequisicionesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        new Productos().setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnRealizarRequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarRequeActionPerformed
        new RealizarRequisicion().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRealizarRequeActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        new Proveedores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
        new Requisiciones().setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        new CatalogoProductos().setVisible(true);
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        setVisible(false);
        new Requisiciones().setVisible(true);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblAgregarRequisicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarRequisicionMouseClicked
        new RealizarRequisicion().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblAgregarRequisicionMouseClicked

    private void lblRequisicionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRequisicionesMouseClicked
        new MenuRequisiciones().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRequisicionesMouseClicked

    private void lblCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCatalogoMouseClicked
        new CatalogoProductos().setVisible(true);
    }//GEN-LAST:event_lblCatalogoMouseClicked

    private void lblBuscarRequisicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarRequisicionMouseClicked
        new MenuRequisiciones().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblBuscarRequisicionMouseClicked

    private void lblMisRequisicionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisRequisicionesMouseClicked
        new RequisicionesPendientes().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMisRequisicionesMouseClicked

    private void lblAprobacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAprobacionesMouseClicked
        this.setVisible(false);
        new Aprobaciones().setVisible(true);
    }//GEN-LAST:event_lblAprobacionesMouseClicked

    private void lblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseClicked
        new Productos().setVisible(true);
    }//GEN-LAST:event_lblProductosMouseClicked

    private void lblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseClicked
        new Proveedores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblProveedoresMouseClicked

    private void lblAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarUsuarioMouseClicked
        if(cone.obtenerUsuario() == 4){
            setVisible(false);
         //   new SignUp().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Sin permisos");
        }
    }//GEN-LAST:event_lblAgregarUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRealizarReque;
    private javax.swing.JButton btnRequisiciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgregarRequisicion;
    private javax.swing.JLabel lblAgregarUsuario;
    private javax.swing.JLabel lblAprobaciones;
    private javax.swing.JLabel lblBuscarRequisicion;
    private javax.swing.JLabel lblCatalogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMisRequisiciones;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblRequisiciones;
    private javax.swing.JLabel lblSalir;
    // End of variables declaration//GEN-END:variables
}
