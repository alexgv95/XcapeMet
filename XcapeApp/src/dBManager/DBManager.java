/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dBManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class DBManager {

    public DBManager() {

    }

    //Conexion BBDD
    public static Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        String usuario = "root";
        String clave = "root";
        String driver = "com.mysql.jdbc.Driver";
        String URL = "jdbc:mysq://localhost:3306/dbxm";
        Connection connection = null;
        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(URL, usuario, clave);
            System.out.println("Conexión establecida con éxito\n");
            return connection;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("Error query:  " + e);
        }
        return null;
    }

    public void cerrarConexion(Connection conector) {
        try {
            conector.close();
        } catch (SQLException e) {
            System.out.println("Error sql: " + e);
        }
    }

    //LOGIN
    public String selectPasswordUsuario(String username) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Connection c = getConnection();

        String sql = "SELECT password from user_login WHERE username=?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String password = rs.getString("password");
            return password;
        }
        rs.close();
        ps.close();

        return null;
    }
}
