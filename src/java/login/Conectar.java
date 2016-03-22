/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ricardo
 */
public class Conectar {
    
    public static Connection abrir() {
        try {

            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/pratica1_ingenieria", "ricardo",
                    "5531084278");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;

		}
        return null;
    }
 
    public static void cerrar(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
    
}
