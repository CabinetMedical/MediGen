
package org.ISET.medigen.dao;
import java.sql.*;
public class Connecter
{
    String urlpilote="com.mysql.jdbc.Driver";
    String urlbase="jdbc:mysql://localhost:3306/MediGen";
    Connection con;
public Connecter()
{
    try
    {
    Class.forName(urlpilote);
    System.out.println("chargement de pilote reussie");
    }
    catch (ClassNotFoundException e)
    {
     System.out.print(e);
    }// permet d afficher ou se trove l'erreur        
    try
    {
    con=DriverManager.getConnection(urlbase,"root","");
    System.out.print("connection a la base de donneé reussie");
    }
    catch (SQLException e)
    {
    System.out.print(e);
    }// permet d afficher ou se trove l'erreur
            
            
    }
    
    Connection obtenirconnection()
{return con;
}
    }

