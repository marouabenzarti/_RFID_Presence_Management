/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author user
 */
import java.sql.*;

public class ConnectionToDB {

    public static Connection connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet","root", "1");
            return con;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}
/*Statement stmt=con.createStatement();  
  
ResultSet rs=stmt.executeQuery("select * from gouvernorat");  
  
while(rs.next())  
System.out.println(rs.getInt(1));  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
 */
