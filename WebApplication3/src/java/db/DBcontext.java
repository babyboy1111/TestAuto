/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class DBcontext {
    protected Connection connection;

    public DBcontext() {
        try {
            String user = "root"; // Replace with your MySQL username
            String pass = "1111";  // Replace with your MySQL password
            String url = "jdbc:mysql://127.0.0.1:3306/demowebapp";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
