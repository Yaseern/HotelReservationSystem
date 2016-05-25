package Final_ST2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kiddabove
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jbdc.Driver");
            System.out.println("Connection established");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Connection faild" + cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/HotelSystem";
        try{
            DBConnection = DriverManager.getConnection(url, "root", "");
            System.out.println("DATABASE FOUND");
        }
        catch(SQLException se){
            System.out.println("DATABASE NOT FOUND");
        }
        return DBConnection;
    }
}
