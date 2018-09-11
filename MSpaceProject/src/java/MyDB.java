
import java.sql.*;
import java.sql.DriverManager;
import sun.util.logging.PlatformLogger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author android
 */
public class MyDB {
    
    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/mydb";
    
    public static void main(String[] arg){
    
    Connection conn = null;
    try{
        conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
        System.out.println("connected!");
        Statement stmt = (Statement) conn.createStatement();
            
        
    }catch(SQLException e){
        System.err.println(e);
    }
    
    }
}

