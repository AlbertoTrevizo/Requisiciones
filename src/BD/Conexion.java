/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Conexion {

    Connection cnn;
    Statement st;
    public Statement st1;
    public String usuariof;
    public int usuario;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/proyecto",
                    "root",
                    ""
            );
            st = cnn.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean login(String usuario, String pass) {
        Boolean usu = null;
        try (ResultSet rs = st.executeQuery("select Usuario_ID,usuario,password "
                + "from usuarios where usuario='" + usuario + "' and password='" + pass + "'")) {
            if (rs.next()) {
                usu = true;
                this.usuario = Integer.parseInt(rs.getString("Usuario_ID"));
            } else {
                usu = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        usuariof = usuario;
        return usu;
    }

    public String consulta(String id) {
        String idbusc = null;
        try (ResultSet rs = st.executeQuery("SELECT Producto_ID FROM Productos where Producto_ID=" + id)) {
            while (rs.next()) {
                idbusc = rs.getString("Producto_ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idbusc;
    }

    public String consultPro(String id) {
        String idbusc = null;
        try (ResultSet rs = st.executeQuery("SELECT Proveedores_ID FROM proveedores where Proveedores_ID=" + id)) {
            while (rs.next()) {
                idbusc = rs.getString("Proveedores_ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idbusc;
    }

    public int contar() {
        int filas = 0;
        try (ResultSet rs = st.executeQuery("SELECT count(*) as filas from proveedores")) {
            while (rs.next()) {
                filas = rs.getInt("filas");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return filas;
    }

    public Object[] Prove(int filas) {
        Object[] Proveedores = new Object[filas];
        int i = 0;
        try (ResultSet rs = st.executeQuery("SELECT Proveedores_ID FROM proveedores")) {
            while (rs.next()) {
                Proveedores[i] = rs.getString("Proveedores_ID");
                i = i + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Proveedores;
    }

    public String consultarequi(String id) {
        String idbusc = null;
        try (ResultSet rs = st.executeQuery("SELECT Requisicion_ID FROM requisiciones where Requisicion_ID=" + id)) {
            while (rs.next()) {
                idbusc = rs.getString("Requisicion_ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idbusc;
    }

    public DefaultTableModel ProductosRequisicionesTbl(String id) {
        DefaultTableModel model = new DefaultTableModel();

        int i = 0;
        model.addColumn("Item");
        model.addColumn("Codigo");
        model.addColumn("Descripcion");
        model.addColumn("ID del proveedor");
        model.addColumn("Cantidad");
        model.addColumn("Costo Unitario");
        model.addColumn("Costo Total");

        try (ResultSet rs = st.executeQuery("SELECT t1.Requisicion_ID,t1.Producto_ID,t1.Cantidad,t1.TotalArticulo,"
                + "t2.descripcion,t2.precio,t2.Proveedores_ID"
                + " FROM productosrequisiciones as t1 inner join productos as t2 on Requisicion_ID=" + id + " and "
                + "t1.Producto_ID=t2.Producto_ID")) {
            Object[] fila = new Object[7];
            while (rs.next()) {
                i = i + 1;
                fila[0] = i;
                String d = rs.getString("t1.Producto_ID");
                fila[1] = d;
                String e = rs.getString("t2.descripcion");
                fila[2] = e;
                String a = rs.getString("t2.Proveedores_ID");
                fila[3] = a;
                String g = rs.getString("t1.Cantidad");
                fila[4] = g;
                String f = rs.getString("t2.precio");
                fila[5] = f;
                String h = rs.getString("t1.TotalArticulo");
                fila[6] = h;
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    public DefaultTableModel CatalogoProductos() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Producto_ID");
        model.addColumn("Nombre");
        model.addColumn("Descripcion");
        model.addColumn("Precio");
        model.addColumn("Unidad de Medida");
        model.addColumn("Categoria");
        model.addColumn("ID del proveedor");
        try (ResultSet rs = st.executeQuery("select * from productos")) {
            Object[] fila = new Object[7];
            while (rs.next()) {
                String a = rs.getString("Producto_ID");
                fila[0] = a;
                String d = rs.getString("nombre");
                fila[1] = d;
                String e = rs.getString("descripcion");
                fila[2] = e;
                String g = rs.getString("precio");
                fila[3] = g;
                String f = rs.getString("UnidadMedida");
                fila[4] = f;
                String h = rs.getString("Categoria");
                fila[5] = h;
                String b = rs.getString("Proveedores_ID");
                fila[6] = b;
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    public DefaultTableModel CatalogoRequisiciones() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Requisicion_ID");
        model.addColumn("Usuario_ID");
        model.addColumn("Monto");
        model.addColumn("Fecha Requisición");
        model.addColumn("Detalle Requisición");
        model.addColumn("Estado");
        try (ResultSet rs = st.executeQuery("select * from requisiciones")) {
            Object[] fila = new Object[7];
            while (rs.next()) {
                String a = rs.getString("Requisicion_ID");
                fila[0] = a;
                String d = rs.getString("Usuario_ID");
                fila[1] = d;
                String g = rs.getString("Monto");
                fila[2] = g;
                String f = rs.getString("FechaRequisicion");
                fila[3] = f;
                String h = rs.getString("DetalleRequisicion");
                fila[4] = h;
                String i = rs.getString("Estado");
                fila[5] = i;
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    public DefaultTableModel CatalogoProveedores() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Proveedores_ID");
        model.addColumn("Proveedor");
        model.addColumn("Nombre");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Forma de Pago");
        model.addColumn("RFC");
        model.addColumn("Estado");
        try (ResultSet rs = st.executeQuery("select * from proveedores")) {
            Object[] fila = new Object[8];
            while (rs.next()) {
                String a = rs.getString("Proveedores_ID");
                fila[0] = a;
                String d = rs.getString("proveedor");
                fila[1] = d;
                String e = rs.getString("Nombre");
                fila[2] = e;
                String g = rs.getString("Direccion");
                fila[3] = g;
                String f = rs.getString("Telefono");
                fila[4] = f;
                String h = rs.getString("FormaPago");
                fila[5] = h;
                String i = rs.getString("RFC");
                fila[6] = i;
                String k = rs.getString("Estado");
                fila[7] = k;
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    public Object[] resultados(String id) {
        String infor[] = new String[7];
        try (ResultSet rs = st.executeQuery("SELECT Producto_ID,nombre,descripcion"
                + ",precio,UnidadMedida,categoria,Proveedores_ID FROM Productos where Producto_ID=" + id)) {
            while (rs.next()) {
                infor[0] = rs.getString("Producto_ID");
                infor[1] = rs.getString("nombre");
                infor[2] = rs.getString("descripcion");
                infor[3] = rs.getString("precio");
                infor[4] = rs.getString("UnidadMedida");
                infor[5] = rs.getString("categoria");
                infor[6] = rs.getString("Proveedores_ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infor;
    }

    public Object[] resultadPro(String id) {
        String infor[] = new String[8];
        try (ResultSet rs = st.executeQuery("SELECT * FROM proveedores where Proveedores_ID=" + id)) {
            while (rs.next()) {
                infor[0] = rs.getString("Proveedores_ID");
                infor[1] = rs.getString("proveedor");
                infor[2] = rs.getString("Nombre");
                infor[3] = rs.getString("Direccion");
                infor[4] = rs.getString("Telefono");
                infor[5] = rs.getString("FormaPago");
                infor[6] = rs.getString("RFC");
                infor[7] = rs.getString("Estado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infor;
    }

    public Object[] resultadosrequi(String id) {
        String infor[] = new String[6];
        try (ResultSet rs = st.executeQuery("SELECT Requisicion_ID,Usuario_ID"
                + ",Monto,FechaRequisicion,DetalleRequisicion,Estado FROM requisiciones where Requisicion_ID=" + id)) {
            while (rs.next()) {
                infor[0] = rs.getString("Requisicion_ID");
                infor[1] = rs.getString("Usuario_ID");
                infor[2] = rs.getString("Monto");
                infor[3] = rs.getString("FechaRequisicion");
                infor[4] = rs.getString("DetalleRequisicion");
                infor[5] = rs.getString("Estado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infor;
    }

    public int consultaprove() {
        int ID = 0;
        try (ResultSet rs = st.executeQuery("SELECT Proveedores_ID FROM proveedores order by Proveedores_ID desc limit 1")) {
            while (rs.next()) {
                ID = rs.getInt("Proveedores_ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ID;
    }

    public int consultaprod() {
        int ID = 0;
        try (ResultSet rs = st.executeQuery("SELECT Producto_ID FROM productos order by Producto_ID desc limit 1")) {
            while (rs.next()) {
                ID = rs.getInt("Producto_ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ID;
    }

    public int RequiPend(String id) {
        int idbusc = 1;
        try (ResultSet rs = st.executeQuery("SELECT count(Proveedores_ID) FROM productosrequisiciones"
                + " where Proveedores_ID=" + id)) {
            while (rs.next()) {
                idbusc = rs.getInt("count(Proveedores_ID)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idbusc;
    }

    public int ProPend(String id) {
        int idbusc = 1;
        try (ResultSet rs = st.executeQuery("SELECT count(Producto_ID) FROM productosrequisiciones"
                + " where Producto_ID=" + id)) {
            while (rs.next()) {
                idbusc = rs.getInt("count(Producto_ID)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idbusc;
    }

    public DefaultTableModel requisicionesPorAprobar() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Requisitor");
        model.addColumn("Monto");
        model.addColumn("Fecha Creacion");
        model.addColumn("Detalle");
        model.addColumn("Estado");
        model.addColumn("Nivel Actual");

        try (ResultSet rs = st.executeQuery("SELECT Requisicion_ID, usuario, "
                + "Monto,FechaRequisicion, DetalleRequisicion, Estado, NivelActual "
                + "FROM requisiciones JOIN usuarios "
                + "ON requisiciones.Usuario_ID = usuarios.Usuario_ID "
                + "WHERE requisiciones.NivelActual = "
                + "(SELECT nivel FROM usuarios WHERE Usuario_ID = " + usuario + ");")) {
            Object[] fila = new Object[7];
            System.out.println(""+usuario);
            while (rs.next()) {
                fila[0] = rs.getString("Requisicion_ID");
                fila[1] = rs.getString("usuario");
                fila[2] = rs.getString("Monto");
                fila[3] = rs.getString("FechaRequisicion");
                fila[4] = rs.getString("DetalleRequisicion");
                fila[5] = rs.getString("Estado");
                fila[6] = rs.getString("NivelActual");
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    public void aprobarRequisicion(int id) {

        Double monto = null;
        Integer nivel = null;
        try {
            ResultSet rs = st.executeQuery("SELECT Monto, NivelActual FROM requisiciones where Requisicion_ID= " + id);
            if (rs.next()) {
                monto = rs.getDouble("Monto");
                nivel = rs.getInt("NivelActual");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (monto != null && nivel != null) {

            String insert = "update requisiciones set Estado =?, NivelActual=?  where Requisicion_ID=" + id;
            PreparedStatement ps = null;
            Integer nivelActual = null;
            String estado = "Pendiente";

            if (nivel > 3) {
                nivelActual = 0;
                estado = "aprobado";
            } else if (nivel > 2 && monto > 100000) {
                nivelActual = 4;
            } else if (nivel > 2 && monto <= 100000) {
                nivelActual = 0;
                estado = "aprobado";
            } else if (nivel > 1 && monto > 50000) {
                nivelActual = 3;
            } else if (nivel > 1 && monto <= 50000) {
                nivelActual = 0;
                estado = "aprobado";
            } else if (monto > 10000) {
                nivelActual = 2;
            } else if (monto <= 10000) {
                nivelActual = 0;
                estado = "aprobado";
            } else {
                JOptionPane.showConfirmDialog(null, "Error garrafal");
            }
            //Falta actualizar tambien el estado en caso de aprobacion
            try {
                cnn.setAutoCommit(false);
                ps = cnn.prepareStatement(insert);
                ps.setString(1, estado);
                ps.setInt(2, nivelActual);
                ps.executeUpdate();
                cnn.commit();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    ps.close();
                } catch (Exception ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    public boolean AgregarProducto(int Producto_ID, String nombre, String descripcion,
            int precio, int UnidadMedida, String categoria, String Proveedor) {
        String insert;
        insert = "insert into Productos(Producto_ID,nombre,"
                + "descripcion,precio,UnidadMedida,Categoria,Proveedores_ID) values(?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setInt(1, Producto_ID);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setInt(4, precio);
            ps.setInt(5, UnidadMedida);
            ps.setString(6, categoria);
            ps.setString(7, Proveedor);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean requisiciones(int Requisicion_ID, int Usuario_ID, double Monto,
            String FechaRequisicion, String DetalleRequisicion, String Estado) {
        String insert;
        insert = "insert into requisiciones(Requisicion_ID,Usuario_ID,"
                + "Monto,FechaRequisicion,DetalleRequisicion,Estado) values(?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setInt(1, Requisicion_ID);
            ps.setInt(2, Usuario_ID);
            ps.setDouble(3, Monto);
            ps.setString(4, FechaRequisicion);
            ps.setString(5, DetalleRequisicion);
            ps.setString(6, Estado);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean productosrequisiciones(int Requisicion_ID, int Usuario_ID,
            int Producto_ID, int Cantidad, float TotalArticulo, int Proveedor_ID, String estado) {
        String insert;
        insert = "insert into productosrequisiciones(Requisicion_ID,Usuario_ID,"
                + "Producto_ID,Cantidad,TotalArticulo,Proveedores_ID,Estado) values(?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setInt(1, Requisicion_ID);
            ps.setInt(2, Usuario_ID);
            ps.setInt(3, Producto_ID);
            ps.setInt(4, Cantidad);
            ps.setFloat(5, TotalArticulo);
            ps.setInt(6, Proveedor_ID);
            ps.setString(7, estado);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public int requiID() {
        int idbusc = 0;
        try (ResultSet rs = st.executeQuery("SELECT Requisicion_ID FROM requisiciones order by"
                + " Requisicion_ID desc limit 1")) {
            while (rs.next()) {
                idbusc = rs.getInt("Requisicion_ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idbusc;
    }

    public DefaultTableModel requisicionesEchas() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Requisitor");
        model.addColumn("Monto");
        model.addColumn("Fecha Creacion");
        model.addColumn("Detalle");
        model.addColumn("Estado");
        model.addColumn("Nivel Actual");

        try (ResultSet rs = st.executeQuery("SELECT Requisicion_ID, usuario, "
                + "Monto,FechaRequisicion, DetalleRequisicion, Estado, requisiciones.NivelActual "
                + "FROM requisiciones JOIN usuarios "
                + "ON requisiciones.Usuario_ID = usuarios.Usuario_ID "
                + "WHERE requisiciones.Usuario_ID =" + usuario + ";")) {
            Object[] fila = new Object[7];
            while (rs.next()) {
                fila[0] = rs.getString("Requisicion_ID");
                fila[1] = rs.getString("usuario");
                fila[2] = rs.getString("Monto");
                fila[3] = rs.getString("FechaRequisicion");
                fila[4] = rs.getString("DetalleRequisicion");
                fila[5] = rs.getString("Estado");
                fila[6] = rs.getString("NivelActual");
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    public Integer obtenerUsuario() {
        Integer idbusc = 10;
        try {
            ResultSet rs = st.executeQuery("SELECT nivel FROM usuarios where usuario= '" + usuariof + "'");
            if (rs.next()) {
                idbusc = rs.getInt("nivel");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idbusc;

    }

    public boolean agregarUsuario(String nombre, String contra, String puesto, int nivel) {
        String insert;
        insert = "insert into usuarios(usuario,"
                + "password,puesto,nivel) values(?,?,?,?)";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setString(1, nombre);
            ps.setString(2, contra);
            ps.setString(3, puesto);
            ps.setInt(4, nivel);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean AgregarProveedor(int Proveedores_ID, String proveedor,
            String Nombre, String Direccion, String Telefono, String FormaPago,
            String RFC, String Estado) {
        String insert;
        insert = "insert into Proveedores(Proveedores_ID,proveedor,"
                + "Nombre,Direccion,Telefono,FormaPago,RFC,Estado) values(?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setInt(1, Proveedores_ID);
            ps.setString(2, proveedor);
            ps.setString(3, Nombre);
            ps.setString(4, Direccion);
            ps.setString(5, Telefono);
            ps.setString(6, FormaPago);
            ps.setString(7, RFC);
            ps.setString(8, Estado);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean Modificar(int Producto_ID, String nombre, String descripcion, int precio, int UnidadMedida, String categoria) {
        String insert = "update Productos set Producto_ID=? ,nombre=?,descripcion=?,precio=?,"
                + "UnidadMedida=?,Categoria=? where Producto_ID=" + Producto_ID + "";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setInt(1, Producto_ID);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setInt(4, precio);
            ps.setInt(5, UnidadMedida);
            ps.setString(6, categoria);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean ModificarPro(int Proveedores_ID, String proveedor, String Nombre, String Direccion, String Telefono,
            String FormaPago, String RFC, String Estado) {
        String insert = "update proveedores set Proveedores_ID=? ,proveedor=?,Nombre=?,Direccion=?,"
                + "Telefono=?,FormaPago=?,RFC=?,Estado=? where Proveedores_ID=" + Proveedores_ID + "";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setInt(1, Proveedores_ID);
            ps.setString(2, proveedor);
            ps.setString(3, Nombre);
            ps.setString(4, Direccion);
            ps.setString(5, Telefono);
            ps.setString(6, FormaPago);
            ps.setString(7, RFC);
            ps.setString(8, Estado);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public void rechazarRequisicion(int id) {

        String insert = "update requisiciones set Estado =?, NivelActual=?  where Requisicion_ID=" + id;
        PreparedStatement ps = null;
        Integer nivelActual = 0;
        String estado = "Rechazada";

        //Falta actualizar tambien el estado en caso de aprobacion
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setString(1, estado);
            ps.setInt(2, nivelActual);
            ps.executeUpdate();
            cnn.commit();
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public boolean eliminarProductos(int Producto_ID) {
        String delete = "delete from Productos where Producto_ID=" + Producto_ID + "";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(delete);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean eliminarPro(int Proveedores_ID) {
        String delete = "delete from proveedores where Proveedores_ID=" + Proveedores_ID + "";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(delete);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean eliminarprorequi(int Proveedores_ID) {
        String act = "Pendiente";
        String delete = "delete from productosrequisiciones where Proveedores_ID=" + Proveedores_ID + " "
                + "and Estado='" + act + "'";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(delete);
            ps.executeUpdate();
            cnn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public String ObtenerUsuario() {
        return usuariof;
    }
}
