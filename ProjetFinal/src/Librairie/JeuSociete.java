package Librairie;

public class JeuSociete extends Produit{
	
	private String nom, theme, niveau;
	private int nbJoueur, quantity;
	
	public JeuSociete(String code, int prix, int quantity, String nom, int nbJoueur, String theme, String niveau) {
		
		super(code, prix);
		this.quantity = quantity;
		this.nom = nom;
		this.nbJoueur = nbJoueur;
		this.theme = theme;
		this.niveau = niveau;
	}
	
	
	
    public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


    // Calcule le prix de vente des Jeux de sociétés
	public double calculerPrixVente() {
		
    	return this.getPrix() * 2.0;
    	
    	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public int getNbJoueur() {
		return nbJoueur;
	}

	public void setNbJoueur(int nbJoueur) {
		this.nbJoueur = nbJoueur;
	}

	@Override
	public String toString() {
		return "JeuSociete [nom=" + nom + ", theme=" + theme + ", niveau=" + niveau + ", nbJoueur=" + nbJoueur
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	

}
