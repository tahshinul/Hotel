/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TAHSHIN
 */
public class connectionProvider {
    public static Connection getCon(){
        try {
           String url = "jdbc:mysql://localhost:3306/hotel";
           String user = "root";
           String password= "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  con = DriverManager.getConnection(url,user,password);
            return con;
        }catch (Exception e){
            return null;
        }
    }
}
