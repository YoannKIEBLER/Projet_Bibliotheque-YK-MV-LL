package fr.adaming.model;

public class Livre {
	
	private int id;
	private String titre;
	private String auteur;
	private float prix;
	public Livre(int id, String titre, String auteur, float prix) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	public Livre(String titre, String auteur, float prix) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + "]";
	}
	
	

}
