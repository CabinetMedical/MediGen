package org.ISET.medigen.dao;



import org.ISET.medigen.dao.Cnx;

import java.sql.*;
public abstract class AjoutConsultation {

	public AjoutConsultation(Consultation con) {
		
                                      Cnx c= new Cnx();
                                         
						Statement stm;
                                        stm = c.Connexion();
                                        try{
						 stm.executeUpdate("INSERT INTO acc_acc VALUES(" + con.getNumDossier() + ", " + "'"+ con.getMaladie() + "', " + "'"+ con.getDateConsult() + "', " + "'"+con.getProchRDV() + "',"+"' "+con.getPoids() + "',"+ "'"+con.getTaille() + "',"+"' "+con.getTention() + "',"+ "'"+con.getTempirature() + "',"+ "'"+con.getCommentaire() + "')");
                                        }
					 catch (SQLException e) {
						System.err.println("insertion echouer"+ e.getMessage());
                                                e.printStackTrace();
	                                }finally { try { 

                                                            if(stm != null) 
                                                                 stm.close(); 
                                                            
                                                       } catch(SQLException e2) {
                                                           System.err.println("Erreur lors de la fermeture des ressources : " + e2.getMessage());
                                                                                 } 
                                                              e2.printStackTrace(); 
                                        } 
        }

						
	}
