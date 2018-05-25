/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requisiciones;

import BD.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Productos extends javax.swing.JFrame {

    public Conexion consultas = new Conexion();
    public int ID;
    public int filas;

    public Productos() {
        initComponents();
        setLocationRelativeTo(null);
        ID = consultas.consultaprod() + 1;
        txtID1.setText("" + ID);
        filas = consultas.contar();
        System.out.println("" + filas);
        Object Proveedores[] = consultas.Prove(filas);

        for (int i = 1; i <= filas; i++) {
            cbProveedor1.addItem("" + Proveedores[i - 1]);
        }
        btnBuscar.setVisible(false);
        btnBuscarE.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cbCategoria1 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        cbProveedor1 = new javax.swing.JComboBox<>();
        btnAgregar1 = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        txtID1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtPrecio1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtUnidad1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDescripcion1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cbCategoriaM1 = new javax.swing.JComboBox<>();
        txtUnidadM1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        txtPrecioM1 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        txtDescripcionM1 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        txtNombreM1 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        txtBuscar1 = new javax.swing.JTextField();
        btnBuscarM = new javax.swing.JPanel();
        lblBuscarM = new javax.swing.JLabel();
        btnModificar1 = new javax.swing.JPanel();
        lblModificar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        lblEstatado1 = new javax.swing.JLabel();
        txtEliminar1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtNombreE1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtDescripcionE1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        txtPrecioE1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        txtUnidadE1 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        cbCategoriaE1 = new javax.swing.JComboBox<>();
        btnBuscarE1 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        btnEliminar1 = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        btnBuscarE = new javax.swing.JButton();
        lblMenu4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(36, 47, 65));

        jTabbedPane2.setBackground(new java.awt.Color(36, 47, 65));
        jTabbedPane2.setForeground(new java.awt.Color(97, 212, 195));

        jPanel4.setBackground(new java.awt.Color(36, 47, 65));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descripcion");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Precio");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Unidad");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Categoria");

        cbCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Papeleria", "Insumos", "Mobiliario", "Equipo tecnico", "Herramientas" }));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Proveedor");

        btnAgregar1.setBackground(new java.awt.Color(97, 212, 195));
        btnAgregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregar1MouseClicked(evt);
            }
        });
        btnAgregar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(36, 47, 65));
        lblAgregar.setText("         Agregar");
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });
        btnAgregar1.add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        txtID1.setEditable(false);
        txtID1.setBackground(new java.awt.Color(36, 47, 65));
        txtID1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtID1.setForeground(new java.awt.Color(255, 255, 255));
        txtID1.setBorder(null);
        txtID1.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        txtNombre1.setBackground(new java.awt.Color(36, 47, 65));
        txtNombre1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre1.setBorder(null);
        txtNombre1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre1KeyTyped(evt);
            }
        });

        txtPrecio1.setBackground(new java.awt.Color(36, 47, 65));
        txtPrecio1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrecio1.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio1.setBorder(null);
        txtPrecio1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPrecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecio1KeyTyped(evt);
            }
        });

        txtUnidad1.setBackground(new java.awt.Color(36, 47, 65));
        txtUnidad1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUnidad1.setForeground(new java.awt.Color(255, 255, 255));
        txtUnidad1.setBorder(null);
        txtUnidad1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUnidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidad1KeyTyped(evt);
            }
        });

        txtDescripcion1.setBackground(new java.awt.Color(36, 47, 65));
        txtDescripcion1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDescripcion1.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion1.setBorder(null);
        txtDescripcion1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtDescripcion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcion1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel24)
                    .addComponent(jLabel34)
                    .addComponent(jLabel12))
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(txtPrecio1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUnidad1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(txtDescripcion1)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel12)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel16)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel22)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(51, 51, 51))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtUnidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Agregar Producto", jPanel4);

        jPanel5.setBackground(new java.awt.Color(36, 47, 65));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Buscar");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Nombre");

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Descripcion");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Precio");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Unidad");

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Categoria");

        cbCategoriaM1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Papeleria", "Insumos", "Mobiliario", "Equipo tecnico", "Herramientas" }));

        txtUnidadM1.setBackground(new java.awt.Color(36, 47, 65));
        txtUnidadM1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUnidadM1.setForeground(new java.awt.Color(255, 255, 255));
        txtUnidadM1.setBorder(null);
        txtUnidadM1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUnidadM1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadM1KeyTyped(evt);
            }
        });

        txtPrecioM1.setBackground(new java.awt.Color(36, 47, 65));
        txtPrecioM1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrecioM1.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioM1.setBorder(null);
        txtPrecioM1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPrecioM1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioM1KeyTyped(evt);
            }
        });

        txtDescripcionM1.setBackground(new java.awt.Color(36, 47, 65));
        txtDescripcionM1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDescripcionM1.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcionM1.setBorder(null);
        txtDescripcionM1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtDescripcionM1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionM1KeyTyped(evt);
            }
        });

        txtNombreM1.setBackground(new java.awt.Color(36, 47, 65));
        txtNombreM1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombreM1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreM1.setBorder(null);
        txtNombreM1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtNombreM1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreM1KeyTyped(evt);
            }
        });

        txtBuscar1.setBackground(new java.awt.Color(36, 47, 65));
        txtBuscar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar1.setBorder(null);
        txtBuscar1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtBuscar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscar1KeyTyped(evt);
            }
        });

        btnBuscarM.setBackground(new java.awt.Color(97, 212, 195));
        btnBuscarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMMouseClicked(evt);
            }
        });
        btnBuscarM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscarM.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblBuscarM.setForeground(new java.awt.Color(36, 47, 65));
        lblBuscarM.setText("      Buscar");
        lblBuscarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMMouseClicked(evt);
            }
        });
        btnBuscarM.add(lblBuscarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        btnModificar1.setBackground(new java.awt.Color(97, 212, 195));
        btnModificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificar1MouseClicked(evt);
            }
        });
        btnModificar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblModificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblModificar.setForeground(new java.awt.Color(36, 47, 65));
        lblModificar.setText("        Modificar");
        lblModificar.setPreferredSize(new java.awt.Dimension(150, 40));
        lblModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarMouseClicked(evt);
            }
        });
        btnModificar1.add(lblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27))
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscar1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator15)
                            .addComponent(txtNombreM1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnBuscar))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDescripcionM1)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecioM1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUnidadM1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbCategoriaM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel25)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel26)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel27)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel28)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel29)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBuscar1)
                            .addComponent(btnBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtNombreM1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(txtDescripcionM1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecioM1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUnidadM1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbCategoriaM1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Modificar Producto", jPanel5);

        jPanel6.setBackground(new java.awt.Color(36, 47, 65));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Buscar");

        lblEstatado1.setForeground(java.awt.Color.white);

        txtEliminar1.setBackground(new java.awt.Color(36, 47, 65));
        txtEliminar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar1.setBorder(null);
        txtEliminar1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtEliminar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEliminar1KeyTyped(evt);
            }
        });

        txtNombreE1.setEditable(false);
        txtNombreE1.setBackground(new java.awt.Color(36, 47, 65));
        txtNombreE1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombreE1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreE1.setBorder(null);
        txtNombreE1.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Nombre");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Descripcion");

        txtDescripcionE1.setEditable(false);
        txtDescripcionE1.setBackground(new java.awt.Color(36, 47, 65));
        txtDescripcionE1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDescripcionE1.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcionE1.setBorder(null);
        txtDescripcionE1.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Precio");

        txtPrecioE1.setEditable(false);
        txtPrecioE1.setBackground(new java.awt.Color(36, 47, 65));
        txtPrecioE1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrecioE1.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioE1.setBorder(null);
        txtPrecioE1.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Unidad");

        txtUnidadE1.setEditable(false);
        txtUnidadE1.setBackground(new java.awt.Color(36, 47, 65));
        txtUnidadE1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUnidadE1.setForeground(new java.awt.Color(255, 255, 255));
        txtUnidadE1.setBorder(null);
        txtUnidadE1.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Categoria");

        cbCategoriaE1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Papeleria", "Insumos", "Mobiliario", "Equipo tecnico", "Herramientas" }));

        btnBuscarE1.setBackground(new java.awt.Color(97, 212, 195));
        btnBuscarE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarE1MouseClicked(evt);
            }
        });
        btnBuscarE1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(36, 47, 65));
        lblBuscar.setText("      Buscar");
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        btnBuscarE1.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        btnEliminar1.setBackground(new java.awt.Color(97, 212, 195));
        btnEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminar1MouseClicked(evt);
            }
        });
        btnEliminar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(36, 47, 65));
        lblEliminar.setText("         Eliminar");
        lblEliminar.setPreferredSize(new java.awt.Dimension(150, 40));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });
        btnEliminar1.add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        btnBuscarE.setText("Buscar");
        btnBuscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel35)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEliminar1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txtNombreE1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDescripcionE1)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrecioE1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator9))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUnidadE1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbCategoriaE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(lblEstatado1)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel31)
                            .addComponent(txtEliminar1)
                            .addComponent(btnBuscarE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel35)
                                    .addComponent(txtNombreE1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDescripcionE1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecioE1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUnidadE1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbCategoriaE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel39)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblEstatado1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Eliminar Producto", jPanel6);

        lblMenu4.setBackground(new java.awt.Color(255, 255, 255));
        lblMenu4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblMenu4.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/home.png"))); // NOI18N
        lblMenu4.setText("Menu principal");
        lblMenu4.setIconTextGap(7);
        lblMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenu4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTabbedPane2)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblMenu4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel7, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String ID = txtBuscar1.getText();
        String buscar = txtBuscar1.getText();
        String buscID, comp;

        if (buscar.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID para iniciar la busqueda");
        } else {
            buscID = consultas.consulta(ID);
            if (buscID == null) {
                JOptionPane.showMessageDialog(null, "Lo sentimos el producto no pudo ser encontrado.");
            } else {
                Object datos[] = consultas.resultados(ID);

                txtNombreM1.setText((String) datos[1]);
                txtDescripcionM1.setText((String) datos[2]);
                txtPrecioM1.setText((String) datos[3]);
                txtUnidadM1.setText((String) datos[4]);
                comp = ((String) datos[5]);

                if (comp.equals("Papeleria")) {
                    cbCategoriaM1.setSelectedIndex(0);
                } else if (comp.equals("Insumos")) {
                    cbCategoriaM1.setSelectedIndex(1);
                } else if (comp.equals("Mobiliario")) {
                    cbCategoriaM1.setSelectedIndex(2);
                } else if (comp.equals("Equipo tecnico")) {
                    cbCategoriaM1.setSelectedIndex(3);
                } else if (comp.equals("Herramientas")) {
                    cbCategoriaM1.setSelectedIndex(4);
                }
            }
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEActionPerformed
        String ID = txtEliminar1.getText();
        String buscID, comp;

        if (ID.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID para iniciar la busqueda");
        } else {
            buscID = consultas.consulta(ID);
            if (buscID == null) {
                JOptionPane.showMessageDialog(null, "Lo sentimos el producto no pudo ser encontrado.");
            } else {
                Object datos[] = consultas.resultados(ID);

                txtNombreE1.setText((String) datos[1]);
                txtDescripcionE1.setText((String) datos[2]);
                txtPrecioE1.setText((String) datos[3]);
                txtUnidadE1.setText((String) datos[4]);
                comp = ((String) datos[5]);

                if (comp.equals("Papeleria")) {
                    cbCategoriaE1.setSelectedIndex(0);
                } else if (comp.equals("Insumos")) {
                    cbCategoriaE1.setSelectedIndex(1);
                } else if (comp.equals("Mobiliario")) {
                    cbCategoriaE1.setSelectedIndex(2);
                } else if (comp.equals("Equipo tecnico")) {
                    cbCategoriaE1.setSelectedIndex(3);
                } else if (comp.equals("Herramientas")) {
                    cbCategoriaE1.setSelectedIndex(4);
                }
            }
        }
    }//GEN-LAST:event_btnBuscarEActionPerformed

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        String Nombre, Descripcion, Categoria = null, Proveedor = null;
        int precio, unidad, ID;

        ID = Integer.parseInt(txtID1.getText());
        Nombre = txtNombre1.getText();
        Descripcion = txtDescripcion1.getText();
        Categoria = cbCategoria1.getSelectedItem().toString();
        precio = Integer.parseInt(txtPrecio1.getText());
        unidad = Integer.parseInt(txtUnidad1.getText());
        Proveedor = cbProveedor1.getSelectedItem().toString();

        if (consultas.AgregarProducto(ID, Nombre, Descripcion, precio, unidad, Categoria, Proveedor)) {
            JOptionPane.showMessageDialog(null, "Los datos fueron guardados exitosamente", "Aceptar", JOptionPane.INFORMATION_MESSAGE);
            txtID1.setText("");
            txtNombre1.setText("");
            txtDescripcion1.setText("");
            txtPrecio1.setText("");
            txtUnidad1.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Los datos no pudieron ser guardados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void btnAgregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregar1MouseClicked

    }//GEN-LAST:event_btnAgregar1MouseClicked

    private void lblBuscarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMMouseClicked
        String ID = txtBuscar1.getText();
        String buscID, comp;

        buscID = consultas.consulta(ID);
        if (buscID == null) {
            JOptionPane.showMessageDialog(null, "Lo sentimos el producto no pudo ser encontrado.");
        } else {
            Object datos[] = consultas.resultados(ID);

            txtNombreM1.setText((String) datos[1]);
            txtDescripcionM1.setText((String) datos[2]);
            txtPrecioM1.setText((String) datos[3]);
            txtUnidadM1.setText((String) datos[4]);
            comp = ((String) datos[5]);

            if (comp.equals("Papeleria")) {
                cbCategoriaM1.setSelectedIndex(0);
            } else if (comp.equals("Insumos")) {
                cbCategoriaM1.setSelectedIndex(1);
            } else if (comp.equals("Mobiliario")) {
                cbCategoriaM1.setSelectedIndex(2);
            } else if (comp.equals("Equipo tecnico")) {
                cbCategoriaM1.setSelectedIndex(3);
            } else if (comp.equals("Herramientas")) {
                cbCategoriaM1.setSelectedIndex(4);
            }
        }
    }//GEN-LAST:event_lblBuscarMMouseClicked

    private void btnBuscarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMMouseClicked

    private void lblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseClicked
        String nombre, descripcion, categoria = null;
        int ID, precio, unidadMedida;

        ID = Integer.parseInt(txtBuscar1.getText());
        nombre = txtNombreM1.getText();
        descripcion = txtDescripcionM1.getText();
        precio = Integer.parseInt(txtPrecioM1.getText());
        unidadMedida = Integer.parseInt(txtUnidadM1.getText());
        categoria = cbCategoriaM1.getSelectedItem().toString();

        if (consultas.Modificar(ID, nombre, descripcion, precio, unidadMedida, categoria)) {
            JOptionPane.showMessageDialog(null, "Los datos fueron guardados exitosamente", "Aceptar", JOptionPane.INFORMATION_MESSAGE);
            txtBuscar1.setText("");
            txtNombreM1.setText("");
            txtDescripcionM1.setText("");
            txtPrecioM1.setText("");
            txtUnidadM1.setText("");
            cbCategoriaM1.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Los datos no pudieron ser guardados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblModificarMouseClicked

    private void btnModificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar1MouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        String ID = txtEliminar1.getText();
        String buscID, comp;

        buscID = consultas.consulta(ID);
        if (buscID == null) {
            JOptionPane.showMessageDialog(null, "Lo sentimos el producto no pudo ser encontrado.");
        } else {
            Object datos[] = consultas.resultados(ID);

            txtNombreE1.setText((String) datos[1]);
            txtDescripcionE1.setText((String) datos[2]);
            txtPrecioE1.setText((String) datos[3]);
            txtUnidadE1.setText((String) datos[4]);
            comp = ((String) datos[5]);

            if (comp.equals("Papeleria")) {
                cbCategoriaE1.setSelectedIndex(0);
            } else if (comp.equals("Insumos")) {
                cbCategoriaE1.setSelectedIndex(1);
            } else if (comp.equals("Mobiliario")) {
                cbCategoriaE1.setSelectedIndex(2);
            } else if (comp.equals("Equipo tecnico")) {
                cbCategoriaE1.setSelectedIndex(3);
            } else if (comp.equals("Herramientas")) {
                cbCategoriaE1.setSelectedIndex(4);
            }
        }
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void btnBuscarE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarE1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarE1MouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        int ID = Integer.parseInt(txtEliminar1.getText());

        if ((consultas.ProPend("" + ID) > 0)) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, el producto no puede ser eliminado\n"
                    + "El producto se encuentra en una requisicion en proceso");
        } else if (consultas.eliminarProductos(ID)) {
            JOptionPane.showMessageDialog(null, "Se ha eliminado el producto de manera correcta");
            txtEliminar1.setText("");
            txtNombreE1.setText("");
            txtDescripcionE1.setText("");
            txtPrecioE1.setText("");
            txtUnidadE1.setText("");
            cbCategoriaE1.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Hubo un problema eliminando el producto");
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void btnEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1MouseClicked

    private void lblMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu4MouseClicked
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMenu4MouseClicked

    private void txtUnidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidad1KeyTyped
        if (txtUnidadM1.getText().length() == 10) {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < 48 || c > 57)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtUnidad1KeyTyped

    private void txtPrecio1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecio1KeyTyped
        if (txtPrecio1.getText().length() == 10) {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < 47 || c > 58)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecio1KeyTyped

    private void txtDescripcion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcion1KeyTyped
        if (txtDescripcion1.getText().length() == 60) {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < 65 || c > 90) && (c < 97 || c > 122)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcion1KeyTyped

    private void txtNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyTyped
        if (txtNombre1.getText().length() == 25) {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < 65 || c > 90) && (c < 97 || c > 122)) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtNombre1KeyTyped

    private void txtBuscar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar1KeyTyped
        char Tecla = evt.getKeyChar();
        if (Tecla == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }
        if ((Tecla < 48 || Tecla > 57)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscar1KeyTyped

    private void txtNombreM1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreM1KeyTyped
        if (txtNombreM1.getText().length() == 25) {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < 65 || c > 90) && (c < 97 || c > 122)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreM1KeyTyped

    private void txtDescripcionM1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionM1KeyTyped
        if (txtDescripcionM1.getText().length() == 60) {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < 48 || c > 57) && (c < 65 || c > 90) && (c < 97 || c > 122)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionM1KeyTyped

    private void txtPrecioM1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioM1KeyTyped
        if (txtPrecioM1.getText().length() == 10) {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < 48 || c > 57)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioM1KeyTyped

    private void txtUnidadM1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadM1KeyTyped
        if (txtUnidadM1.getText().length() == 10) {
            getToolkit().beep();
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < 48 || c > 57)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtUnidadM1KeyTyped

    private void txtEliminar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminar1KeyTyped
        char Tecla = evt.getKeyChar();
        if (Tecla == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }
        if ((Tecla < 48 || Tecla > 57)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEliminar1KeyTyped

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarE;
    private javax.swing.JPanel btnBuscarE1;
    private javax.swing.JPanel btnBuscarM;
    private javax.swing.JPanel btnEliminar1;
    private javax.swing.JPanel btnModificar1;
    private javax.swing.JComboBox<String> cbCategoria1;
    private javax.swing.JComboBox<String> cbCategoriaE1;
    private javax.swing.JComboBox<String> cbCategoriaM1;
    private javax.swing.JComboBox<String> cbProveedor1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscarM;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEstatado1;
    private javax.swing.JLabel lblMenu4;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtDescripcion1;
    private javax.swing.JTextField txtDescripcionE1;
    private javax.swing.JTextField txtDescripcionM1;
    private javax.swing.JTextField txtEliminar1;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombreE1;
    private javax.swing.JTextField txtNombreM1;
    private javax.swing.JTextField txtPrecio1;
    private javax.swing.JTextField txtPrecioE1;
    private javax.swing.JTextField txtPrecioM1;
    private javax.swing.JTextField txtUnidad1;
    private javax.swing.JTextField txtUnidadE1;
    private javax.swing.JTextField txtUnidadM1;
    // End of variables declaration//GEN-END:variables
}
