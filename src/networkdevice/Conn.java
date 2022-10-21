/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkdevice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author wings
 */
public class Conn {
    
        public static Connection getConnection(){
     
        Connection con = null;
        try {
           
          //  Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/networkdevice?", "root", "");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
   public static void main(String args[]) {
      Conn dc=new Conn();
      
    
   }
    
}


