package Martillito.controlador.catalogo;
import Martillito.modelo.db.Conecta;
import Martillito.modelo.vo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCProductoRepositorio implements ProductoRepositorio {

    @Override
    public List<Producto> getTodosProductos() {
        List<Producto> productoLista = new ArrayList<>();
        Conecta conn = new Conecta();
        try(Connection x = conn.getConnection();) {
            PreparedStatement pst = x.prepareStatement("Select cod_prod, tipo, nom_prod, precio,"
                    + " stock, img"
                    + " from producto");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setCodProd(rs.getString("cod_prod"));
                producto.setTipo(rs.getInt("tipo"));
                producto.setNomProd(rs.getString("nom_prod"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setImg(rs.getString("img"));
                
                productoLista.add(producto);
            }
            pst.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("No se pudo generar la conexión. ");
            e.printStackTrace(System.out);
        }
        return productoLista;
    }

    @Override
    public Producto getProductoPorCodigo(String codigo) {
        Producto producto = null;
        Conecta conn = new Conecta();
        try(Connection x = conn.getConnection();) {
            PreparedStatement pst = x.prepareStatement("Select cod_prod, tipo, nom_prod, precio,"
                    + " stock, img"
                    + " from producto"
                    + " where cod_prod =?" );
            pst.setString(1, codigo);
            try (ResultSet rs = pst.executeQuery();) {
            if (rs.next()) {
                producto = new Producto();
                producto.setCodProd(rs.getString("cod_prod"));
                producto.setTipo(rs.getInt("tipo"));
                producto.setNomProd(rs.getString("nom_prod"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setImg(rs.getString("img"));
                
            }
            }
            pst.close();
        } catch (SQLException e) {
            System.out.println("No se pudo generar la conexión. ");
            e.printStackTrace(System.out);
        }
        return producto;
    }
    
    public int insertarproducto(Producto pro){
    
         int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try {
            PreparedStatement ps = 
                    conn.prepareStatement("INSERT INTO producto VALUES " +
                    "(?,?,?,?,?,?,?)");
            ps.setString(1, pro.getCodProd());
            ps.setInt(2, pro.getTipo());
            ps.setString(3,pro.getNomProd() );
            ps.setDouble(4,pro.getPrecio() );
            ps.setInt(5,pro.getStock());
            ps.setString(6,pro.getImg());
            ps.setString(7, pro.getDni_adm());
            
            result = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro del nuevo producto en la BD. Mensaje:" + e.getMessage());
        }
        
        
        return result;
    
    }
    
}
