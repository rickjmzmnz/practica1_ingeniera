/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ricardo
 */
public class Login {
    
     public static boolean validar(String correoElectronico, String password) {
        Connection con = null;
        PreparedStatement ps = null;
 
        try {
            con = Conectar.abrir();
            ps = con.prepareStatement("Select correo_electronico, contraseña from usuario where uname = ? and password = ?");
            ps.setString(1, correoElectronico);
            ps.setString(2, password);
 
            ResultSet rs = ps.executeQuery();
 
            if (rs.next()) {
                //result found, means valid inputs
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Login error -->" + ex.getMessage());
            return false;
        } finally {
            Conectar.cerrar(con);
        }
        return false;
    }
    
}
