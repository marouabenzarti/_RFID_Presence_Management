/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;


/**
 *
 * @author user
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection con =ConnectionToDB.connection();
        java.sql.PreparedStatement p =null;
        System.out.println("ok");
       
        Statement s=con.createStatement();
        ResultSet r1 =s.executeQuery("select * from etudiant");
        while(r1.next()){
        System.out.println(r1.getString(1)+" "+r1.getString(2));}
        ConnectionToDB.close(con);
    }
    
}
