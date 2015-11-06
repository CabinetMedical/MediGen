/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ISET.medigen.dao;

import java.sql.*;
import java.sql.Statement;
import java.util.logging.Level;

/**
 *
 * @author karama
 */
public class AjoutConsultation {
    
    public static void main(String[] args) throws SQLException {
        Statement st ;
        Connecter cnx=new Connecter();
        ResultSet res=null;
        
        String stat = "SELECT nom, prenom FROM patient";
       
            // org.ISET.medigen.ui.AjoutConsultation.jComboBox1.removeAllItems();
           
            //Sélectionner dans la DB
           
            //ResultSet res = st.executeQuery(stat);
            //Ajouter les elements 1 a 1
            while (res.next()) {
              //  org.ISET.medigen.ui.AjoutConsultation.jComboBox1.addItem(res.getString(0) + " " + res.getString(1));
            }
            res.close();
            
        } 
  /* 
 		
		st=cnx.connect() ;
		String req = "insert into article values ("+c.getMaladie+",'"+c.getDatconsult()+"','"+c.getProchRDV()+"','"+c.getPoid()+"','"+c.getTaille()+"','"+c.getTention()+"','"+C.getTemperature()+"','"+C.getCommentaire()+"')";
		st.executeUpdate(req) ;
		return req;

					

				} 
				catch (SQLException ex) 
				{
					JOptionPane.showMessageDialog(null,"erreur d'exception ");
					ex.printStackTrace();
				}
			}*/
}
