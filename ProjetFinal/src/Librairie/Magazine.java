package Librairie;

public class Magazine extends Document{

	private String categorie;
	private int mois;

	public Magazine(String code, int prix, int quantity, String titre, int mois, int annee, String categorie) {
		
		super(code, prix, quantity, titre, annee);
		this.mois = mois;
		this.categorie = categorie;
	}
	
	// Calcule le prix de vente des magazines
	public double calculerPrixVente() {
		
		return this.getPrix() * 1.25;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Magazine [mois=" + mois + ", categorie=" + categorie + ", toString()=" + super.toString() + "]";
	}
	
	
}
	
