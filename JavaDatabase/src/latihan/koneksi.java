/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author WINDOWS 10
 */
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class koneksi {
   public static void main(String[] args) {
   private static Connection koneksi;
         
    public static Connection GetConnection()throws SQLException{
   if (koneksi==null){
     new Driver();
     
   koneksi=DriverManager.getConnection("jdbc:mysql://localhost/db_mhs","root","");
   
   }
   return koneksi;
 
}
}

