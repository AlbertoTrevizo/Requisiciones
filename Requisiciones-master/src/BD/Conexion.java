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

/**
 *
 * @author User
 */
public class Conexion {

    Connection cnn;
    Statement st;
    public Statement st1;

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
}
