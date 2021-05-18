package Librairie;

public abstract class CDetDVD extends Produit{

	private int duree, annee;
	private String titre, nom;
	
	public CDetDVD(int code, int prix, int duree, String titre, String nom, int annee){
		
		super(code,prix);
		this.duree = duree;
		this.titre = titre;
		this.nom = nom;
		this.annee = annee;
    }
	

	public int getDuree() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}


	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "CDetDVD [duree=" + duree + ", annee=" + annee + ", titre=" + titre + ", nom=" + nom + ", toString()="
				+ super.toString() + "]";
	}

	
}