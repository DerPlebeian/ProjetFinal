package Librairie;

public class Magazine extends Document{

	private String mois, categorie;

	public Magazine(int code, int prix, int Quantity, String Description, String titre, int annee, String mois, String categorie) {
		
		super(code, prix, Quantity, Description, titre, annee);
		this.mois = mois;
		this.categorie = categorie;
	}
	
	public double calculerPrixVente() {
		
		double prixVente = super.getPrix() * 1.25;
		return prixVente;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
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
	
