package Librairie;

public class DVD extends CDetDVD{
	
	public DVD(String code, int prix, int quantity, int duree, String titre, String nom, int annee) {
		super(code, prix, quantity, duree, titre, nom, annee);
	}

	
	// Calcule le prix de vente des DVDs
	@Override
	public double calculerPrixVente() {
		
		return this.getPrix() * 1.5;
		
	}

	@Override
	public String toString() {
		return "DVD [toString()=" + super.toString() + "]";
	}

}
