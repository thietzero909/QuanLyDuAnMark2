/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Untils;
import java.sql.*;
/**
 *
 * @author thiet
 */
public class JDBC {
    static String url = "jdbc:sqlserver://BUIVANTHIET:1433;encrypt=false;databaseName=polypro";
    static String name = "sa";
    static String pass = "123456789";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, name, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("thanh cong");
        } else {
            System.out.println("that bai");
        }
    }
}
