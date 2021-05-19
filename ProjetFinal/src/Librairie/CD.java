package Librairie;

public class CD extends CDetDVD{

	private int nbTitres;
	
	public CD(String code, int prix, int duree, String titre, String nom, int annee, int nbTitres) {
		
		super(code, prix, duree, titre, nom, annee);
		this.nbTitres = nbTitres;
	}

	
	public double calculerPrixVente() {
		
		return this.getPrix() * 1.5;
		
		
	}

	public int getNbTitres() {
		return nbTitres;
	}

	public void setNbTitres(int nbTitres) {
		this.nbTitres = nbTitres;
	}

	@Override
	public String toString() {
		return "CD [nbTitres=" + nbTitres + ", toString()=" + super.toString() + "]";
	}
	
}
