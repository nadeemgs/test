/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proj.framework;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ultimate
 */
public class DBUtils{
    

public static Connection getConnection()
        {
	Connection con=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","MTXYMN", "YS$mtx_2010#xtm1sys");
	}
        catch(Exception e)
        {
            System.out.println(e);
        }
        if(con==null){
            System.out.println("Cannot connect to Oracle Database");
        }
	return con;
    }
public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            } 
        } catch (Exception e) {
           
            System.out.println(e);
           
        }
    }
}
