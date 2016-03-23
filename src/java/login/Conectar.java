/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ricardo
 */
public class Conectar {
    
    public static Connection abrir() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/practica1_ingenieria", "ricardo",
                    "5531084278");
            return connection;
		} catch (Exception e) {

			System.out.println("Database.getConnection()");
			e.getMessage();
			return null;

		}
    }
 
    public static void cerrar(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
    
}
