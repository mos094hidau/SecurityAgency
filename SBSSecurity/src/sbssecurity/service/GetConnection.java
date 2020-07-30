
package sbssecurity.service;

import java.sql.*;
import java.sql.DriverManager;

public class GetConnection {
  private static Connection con = null;
  public static Connection getConnection(){
   try{
     Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver Loaded");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SBSSecurity","root");
	System.out.println("Connection Stablished");
        System.out.println(con);
   }
   catch(Exception e){
    e.printStackTrace();
    System.out.println(e);
   }
   return con;
  }

public static void main(String args[]){
   Connection con =GetConnection.getConnection();
   System.out.println(con);
}
}
