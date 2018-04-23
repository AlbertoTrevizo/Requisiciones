/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requisiciones;

import BD.Conexion;

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {

    public Conexion cone=new Conexion();
    public String nombreUsuario;
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        nombreUsuario=cone.ObtenerUsuario();
        lblUsuario.setText(nombreUsuario);
        System.out.println("Holaaa");
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
        lblUsuario = new javax.swing.JLabel();

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

        lblUsuario.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRequisiciones)
                    .addComponent(btnProductos)
                    .addComponent(btnRealizarReque)
                    .addComponent(btnProveedores))
                .addContainerGap(508, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnRequisiciones)
                .addGap(18, 18, 18)
                .addComponent(btnProductos)
                .addGap(18, 18, 18)
                .addComponent(btnRealizarReque)
                .addGap(18, 18, 18)
                .addComponent(btnProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(lblUsuario)
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
        
     //   this.setVisible(false);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnRealizarRequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarRequeActionPerformed
        new RealizarRequisicion().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRealizarRequeActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        new Proveedores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProveedoresActionPerformed

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
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRealizarReque;
    private javax.swing.JButton btnRequisiciones;
    public javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
