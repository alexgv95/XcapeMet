/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dBManager.DBManager;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Alex
 */
public class Login {

    public void login() {

    }

    public boolean comprobar(String username, String password) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchAlgorithmException, UnsupportedEncodingException {
        DBManager db = new DBManager();

        String dbPass = db.selectPasswordUsuario(username);
        String passHash = hash(password);

        if (dbPass.equalsIgnoreCase(passHash)) {
            return true;
        } else {
            System.out.println("El usuario o contraseña se ha introducido incorrectamente");
            return false;
        }
    }

    public static String hash(String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
        msdDigest.update(pass.getBytes("UTF-8"), 0, pass.length());
        pass = DatatypeConverter.printHexBinary(msdDigest.digest());

        return pass;
    }

}
