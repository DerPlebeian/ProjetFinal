package Librairie;

public class Livre extends Document{

	private String auteur, editeur;
	
	public Livre(int code, int prix, int quantity, String description, String titre, int annee, String auteur, String editeur) {
		
		super(code, prix, quantity, description, titre, annee);
		this.auteur = auteur;
		this.editeur = editeur;
	}
	
	public double calculerPrixVente() {
		
		double prixVente = super.getPrix() * 1.75;
		return prixVente;
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
