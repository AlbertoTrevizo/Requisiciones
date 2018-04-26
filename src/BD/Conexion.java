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
        try (ResultSet rs = st.executeQuery("select usuario,password "
                + "from usuarios where usuario='" + usuario + "' and password='" + pass + "'")) {
            if (rs.next()) {
                usu = true;
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
        // model.addColumn("Observaciones");
        model.addColumn("Cantidad");
        model.addColumn("Costo Unitario");
        model.addColumn("Costo Total");

        try (ResultSet rs = st.executeQuery("SELECT t1.Requisicion_ID,t1.Producto_ID,t1.Cantidad,t1.TotalArticulo,"
                + "t2.descripcion,t2.precio"
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
                String g = rs.getString("t1.Cantidad");
                fila[3] = g;
                String f = rs.getString("t2.precio");
                fila[4] = f;
                String h = rs.getString("t1.TotalArticulo");
                fila[5] = h;
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }
     public DefaultTableModel CatalogoProductos() {
        DefaultTableModel model = new DefaultTableModel();
        int i = 0;
        model.addColumn("Producto_ID");
        model.addColumn("Nombre");
        model.addColumn("Descripcion");
        model.addColumn("Precio");
        model.addColumn("Unidad de Medida");
        model.addColumn("Categoria");
        model.addColumn("Proveedor");    
        try (ResultSet rs = st.executeQuery("select * from productos")) {
            Object[] fila = new Object[6];
            while (rs.next()) {
                String a=rs.getString("Producto_ID");
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
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }
    public Object[] resultados(String id) {
        String infor[] = new String[6];
        try (ResultSet rs = st.executeQuery("SELECT Producto_ID,nombre,descripcion"
                + ",precio,UnidadMedida,categoria FROM Productos where Producto_ID=" + id)) {
            while (rs.next()) {
                infor[0] = rs.getString("Producto_ID");
                infor[1] = rs.getString("nombre");
                infor[2] = rs.getString("descripcion");
                infor[3] = rs.getString("precio");
                infor[4] = rs.getString("UnidadMedida");
                infor[5] = rs.getString("categoria");
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
        String infor[] = new String[7];
        try (ResultSet rs = st.executeQuery("SELECT Requisicion_ID,Usuario_ID,Proveedores_ID"
                + ",Monto,FechaRequisicion,DetalleRequisicion,Estado FROM requisiciones where Requisicion_ID=" + id)) {
            while (rs.next()) {
                infor[0] = rs.getString("Requisicion_ID");
                infor[1] = rs.getString("Usuario_ID");
                infor[2] = rs.getString("Proveedores_ID");
                infor[3] = rs.getString("Monto");
                infor[4] = rs.getString("FechaRequisicion");
                infor[5] = rs.getString("DetalleRequisicion");
                infor[6] = rs.getString("Estado");
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
    public boolean AgregarProducto(int Producto_ID, String nombre, String descripcion, int precio, int UnidadMedida, String categoria) {
        String insert;
        insert = "insert into Productos(Producto_ID,nombre,"
                + "descripcion,precio,UnidadMedida,Categoria) values(?,?,?,?,?,?)";
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

    public boolean requisiciones(int Requisicion_ID, int Usuario_ID, int Proveedores_ID, double Monto,
            String FechaRequisicion, String DetalleRequisicion, String Estado) {
        String insert;
        insert = "insert into requisiciones(Requisicion_ID,Usuario_ID,"
                + "Proveedores_ID,Monto,FechaRequisicion,DetalleRequisicion,Estado) values(?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setInt(1, Requisicion_ID);
            ps.setInt(2, Usuario_ID);
            ps.setInt(3, Proveedores_ID);
            ps.setDouble(4, Monto);
            ps.setString(5, FechaRequisicion);
            ps.setString(6, DetalleRequisicion);
            ps.setString(7, Estado);
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

    public boolean productosrequisiciones(int Requisicion_ID, int Usuario_ID, int Producto_ID, int Cantidad,
            float TotalArticulo) {
        String insert;
        insert = "insert into productosrequisiciones(Requisicion_ID,Usuario_ID,"
                + "Producto_ID,Cantidad,TotalArticulo) values(?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            cnn.setAutoCommit(false);
            ps = cnn.prepareStatement(insert);
            ps.setInt(1, Requisicion_ID);
            ps.setInt(2, Usuario_ID);
            ps.setInt(3, Producto_ID);
            ps.setInt(4, Cantidad);
            ps.setFloat(5, TotalArticulo);
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
     public boolean eliminarPro(String Proveedores_ID) {
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

    public String ObtenerUsuario() {
        return usuariof;
    }
}
