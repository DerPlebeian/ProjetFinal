package Librairie;

public class DVD extends CDetDVD{
	
	public DVD(int code, int prix, int duree, String titre, String nom, int annee) {
		super(code, prix, duree, titre, nom, annee);
	}

	@Override
	double calculerPrixVente() {
		
		double prixVente = super.getPrix() * 1.5;
		return prixVente;
	}

	@Override
	public String toString() {
		return "DVD [toString()=" + super.toString() + "]";
	}

}
