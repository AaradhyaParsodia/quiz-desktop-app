/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizApp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aaradhya
 */
public class DBConnection {
    private static Connection conn;
    
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LENOVO-PC:1521/XE","c##quizapp","quizapp");
            JOptionPane.showMessageDialog(null,"Connected Successfully to the DB");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Cannot Connect to the DB");
            ex.printStackTrace();
            System.exit(1);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try
        {
            conn.close();
            JOptionPane.showMessageDialog(null,"disconnected Successfully to the DB");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Cannot disconnect with DB");
            ex.printStackTrace();
        }
    }
}
