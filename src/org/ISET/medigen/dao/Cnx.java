
package org.ISET.medigen.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Cnx {
    public Statement Connexion(){
		Statement  st=null;
		Connection cnx;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/GestionRendezVous","root","");
			 st=(Statement) cnx.createStatement();
		    
		} catch (SQLException e) {
			e.getMessage();
			
		}
		catch (ClassNotFoundException e1) {
			e1.getMessage();
			}
		return st;
	}
    
}
