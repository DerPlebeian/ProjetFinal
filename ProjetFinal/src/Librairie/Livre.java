package Librairie;

public class Livre extends Document{

	private String auteur, editeur;
	
	public Livre(String code, int prix, int quantity, String titre, String auteur, int annee, String editeur) {
		
		super(code, prix, quantity, titre, annee);
		this.auteur = auteur;
		this.editeur = editeur;
	}
	
	// Calcule le prix de vente des livres
	public double calculerPrixVente() {
		
		return this.getPrix() * 1.75;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", editeur=" + editeur + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
