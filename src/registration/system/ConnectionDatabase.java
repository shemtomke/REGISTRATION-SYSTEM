/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration.system;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SHEM TOM
 */
public class ConnectionDatabase 
{
    public static Connection DbConnection()
     {
         try {
            String user = "root";
            String password = "17382002";
            String url = "jdbc:mysql://localhost:3306/schoolsystem";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, user, password);
            
            //check if the connection is working well
            if(c!=null)
            {
                System.out.println("Connection Established!");
            }
            else
            {
                System.out.println("Connection Failed!");
            }
            
            return c;
        } catch (ClassNotFoundException | SQLException e) 
        {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, e);
        }
         
         return null;
     }
}
