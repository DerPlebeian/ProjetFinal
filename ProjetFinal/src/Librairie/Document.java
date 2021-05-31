package Librairie;

public abstract class Document extends Produit{

	private String titre;
	private int annee, quantity;
	
    public Document(String code, int prix, int quantity, String titre, int annee){
  	  
		super(code,prix);
		this.quantity = quantity;
		this.titre = titre;
		this.annee = annee;
    }
    

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
