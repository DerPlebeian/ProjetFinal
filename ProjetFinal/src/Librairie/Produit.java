package Librairie;

	public abstract class Produit {

	    private int code;
	    private double prix;
	    private int quantity;
	    private String description;

	    public Produit(int code, double prix) {
	        
	    	this.code = code;
	        this.prix = prix;
	        description = "Non Disponible";
	        quantity = 0;
	    }
	    
	    abstract double calculerPrixVente();

	    public void augmenterQuantiter() {
	    	
	    	quantity++;
	    }
	    
        public void diminuerQuantiter() {
	    	
	    	quantity--;
	    }
	    
	    public int getCode() {
	        return code;
	    }


	    public void setCode(int code) {
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
	
