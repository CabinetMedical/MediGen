/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ISET.medigen.dao;

/**
 *
 * @author karama
 */
public class Consultation {
    private int numDossier;
    private String maladie;
    private String dateConsult;
    private String prochRDV;
    private float poids;
    private int taille;
    private int tention;
    private int tempirature;
    private String commentaire;
    
    public Consultation(int numDossier, String maladie, String dateConsult,
			String prochRDV, float poids, int taille, int tention,
			int tempirature, String commentaire) {
		super();
		this.numDossier = numDossier;
		this.maladie = maladie;
		this.dateConsult = dateConsult;
		this.prochRDV = prochRDV;
		this.poids = poids;
		this.taille = taille;
		this.tention = tention;
		this.tempirature = tempirature;
		this.commentaire = commentaire;
	}
    public int getNumDossier() {
		return numDossier;
	}

	public void setNumDossier(int numDossier) {
		this.numDossier = numDossier;
	}

	public String getMaladie() {
		return maladie;
	}

	public void setMaladie(String maladie) {
		this.maladie = maladie;
	}

	public String getDateConsult() {
		return dateConsult;
	}

	public void setDateConsult(String dateConsult) {
		this.dateConsult = dateConsult;
	}

	public String getProchRDV() {
		return prochRDV;
	}

	public void setProchRDV(String prochRDV) {
		this.prochRDV = prochRDV;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getTention() {
		return tention;
	}

	public void setTention(int tention) {
		this.tention = tention;
	}

	public int getTempirature() {
		return tempirature;
	}

	public void setTempirature(int tempirature) {
		this.tempirature = tempirature;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}
