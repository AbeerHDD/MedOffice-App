/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_du_cabinet_medical;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class cabinetmedical {
  Connection connection = null;
    Statement statement; 
    ResultSet  resultset;
    public cabinetmedical() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/cabinetmedical","root",""); 
           statement = connection.createStatement();
        }
        catch (ClassNotFoundException ex) { 
        }
        catch (SQLException ex) { 
        }
     } 
public void medical_update(String sql){
try {
statement.executeUpdate(sql); 
}
catch (SQLException ex) {
    System.out.println(ex);
 
}
 
}
public ResultSet medical_select(String sql){
try {
 resultset=statement.executeQuery(sql);
}
catch (SQLException ex) {
}
return  resultset;
}
}
