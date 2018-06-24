package Martillito.modelo.adm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Martillito.modelo.db.Conecta;
import Martillito.modelo.vo.Perfil;
import Martillito.modelo.vo.Producto;
import Martillito.modelo.vo.Usuario;

public class JDBCUsuarioRepositorio implements UsuarioRepositorio {

    @Override
    public Usuario login(String dni, String clave) {
        Usuario usuario = null;
        Conecta conecta = new Conecta();
        try (Connection x = conecta.getConnection();
                PreparedStatement pst = x.prepareStatement("Select dni, idPerfil, apePaterno, apeMaterno, nombres,"
                        + "clave, telefono, distrito"
                        + " from Usuario"
                        + " where dni=? and clave=?");) {

            pst.setString(1, dni);
            pst.setString(2, clave);
            try (ResultSet rs = pst.executeQuery();) { //devuelve 1 resultado
                if (rs.next()) {
                    Perfil perfil = new Perfil();
                    perfil.setIdPerfil(rs.getInt("idPerfil"));

                    usuario = new Usuario();
                    usuario.setDni(rs.getString("dni"));
                    usuario.setPerfil(perfil);
                    usuario.setApePaterno(rs.getString("apePaterno"));
                    usuario.setApeMaterno(rs.getString("apeMaterno"));
                    usuario.setNombres(rs.getString("nombres"));
                }
            }
        } catch (SQLException e) {
            System.out.println("No se pudo generar la conexión. ");
            e.printStackTrace(System.out);
        }
        return usuario;
    }
    
    
     public int insertarusuario(Usuario user){
    
         int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try {
            PreparedStatement ps = 
                    conn.prepareStatement("INSERT INTO usuario VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, user.getDni());
            ps.setInt(2, user.getPerfil().getIdPerfil());
            ps.setString(3, user.getApePaterno());
            ps.setString(4,user.getApeMaterno());
            ps.setString(5, user.getNombres());
            ps.setString(6, user.getClave());
            ps.setString(7, user.getTelefono());
            ps.setString(8, user.getDistrito());
            
            result = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro del nuevo producto en la BD. Mensaje:" + e.getMessage());
        }
        
        
        return result;
    
    }
    
    /*
    public static void main(String[]args){
        System.out.println("Hola Mundo!");
        System.out.println(saludar("Luiggi"));
        JDBCUsuarioRepositorio j = new JDBCUsuarioRepositorio();
        System.out.println(j.suma(2,4));
    }
    public static String saludar(String nombre){
        return "hola "+nombre;
    }
    public int suma(int num, int x){
        return num + x;
    }
     */
}
