package Librairie;

public class JeuSociete extends Produit{
	
	private String nom, theme, niveau;
	private int nbJoueur;
	
	public JeuSociete(int code, double prix, String nom, int nbJoueur, String theme, String niveau) {
		
		super(code, prix);
		this.nom = nom;
		this.nbJoueur = nbJoueur;
		this.theme = theme;
		this.niveau = niveau;
	}
	
    public double calculerPrixVente() {
		
    	double PrixVente = super.getPrix() * 2;
    	return PrixVente;
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
