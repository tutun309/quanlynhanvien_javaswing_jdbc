/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;



import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

/**
 *
 * @author HP
 */
public class DAO {
    public static Connection con;


    public DAO() {
        String server = "localhost";
        String user = "sa";
        String pass ="12345";
        String db ="QuanLyTaiKhoanNganHang";
        int port =1433;
        SQLServerDataSource sql = new SQLServerDataSource();
        sql.setUser(user);
        sql.setPortNumber(port);
        sql.setServerName(server);
        sql.setPassword(pass);
        sql.setDatabaseName(db);
        try {
            con = sql.getConnection();
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi");
        }
    }
      
      
    public static void main(String[] args) {

    }
}