package Martillito.modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {
    private final String url ="jdbc:oracle:thin:@localhost:1521:XE";
    private final String user="HR";
    private final String clave="hr";
    
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url, user, clave);
            conn.setAutoCommit(true);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("No se pudo generar la conexión. ");
                    e.printStackTrace(System.out);//indica donde falla o esta el problema
        }
        return conn;
    }
}
