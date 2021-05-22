package Librairie;

public abstract class Document extends Produit{

	private String titre;
	private int annee;
	
    public Document(String code, int prix, int quantity, String description, String titre, int annee){
  	  
		super(code,prix);
		this.titre = titre;
		this.annee = annee;
    }

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Document [titre=" + titre + ", annee=" + annee + ", toString()=" + super.toString() + "]";
	}

	
	
}
