package Librairie;

	public abstract class Produit {

	    private String code;
	    private double prix;
	    private int quantity;
	    private String description;

	    public Produit(String code, double prix) {
	        
	    	this.code = code;
	        this.prix = prix;
	        description = "Non Disponible";
	        quantity = 0;
	    }
	    
	    // Méthode abstraite qui calcule le prix de vente des classes enfants de la classe Produit
	    abstract double calculerPrixVente();

	    // Augmente la quantité du produit
	    public void augmenterQuantiter(int quantity) {
	    	
	    	this.quantity += quantity;
	    }
	    
	    // Diminue la quantité du produit
        public void diminuerQuantiter(int quantity) {
	    	
	    	this.quantity -= quantity;
	    }
	    
	    public String getCode() {
	        return code;
	    }


	    public void setCode(String code) {
	        this.code = code;
	    }


	    public double getPrix() {
	        return prix;
	    }


	    public void setPrix(int prix) {
	        this.prix = prix;
	    }


	    public int getQuantity() {
	        return quantity;
	    }


	    public void setQuantity(int Quantity) {
	        this.quantity = Quantity;
	    }


	    public String getDescription() {
	        return description;
	    }


	    public void setDescription(String Description) {
	        this.description = Description;
	    }


	    @Override
	    public String toString() {
	        return "Produit [code=" + code + ", prix=" + prix + ", Quantity=" + quantity + ", Description=" + description
	                + "]";
	    }
   }
	
