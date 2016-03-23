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
    
     public static boolean validar(String correoElectronico, String contraseña) {
        Connection con = null;
        PreparedStatement ps = null;
 
        try {
            con = Conectar.abrir();
            ps = con.prepareStatement("SELECT correo_electronico,contraseña FROM usuario WHERE correo_electronico = ? AND contraseña = ?");
            ps.setString(1, correoElectronico);
            ps.setString(2, contraseña);
 
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
