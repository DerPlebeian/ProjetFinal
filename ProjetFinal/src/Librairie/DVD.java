package Librairie;

public class DVD extends CDetDVD{
	
	public DVD(String code, int prix, int duree, String titre, String nom, int annee) {
		super(code, prix, duree, titre, nom, annee);
	}

	@Override
	public double calculerPrixVente() {
		
		return this.getPrix() * 1.5;
		
	}

	@Override
	public String toString() {
		return "DVD [toString()=" + super.toString() + "]";
	}

}
