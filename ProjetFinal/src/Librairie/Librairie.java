package Librairie;

public class Librairie {

	private static final int MAX = 500;
	private String nom;
	private double solde;
	private static Produit[] stock;
	private static int nb;
	
	public Librairie(String nom, double solde) {
		
		this.nom = nom;
		this.solde = solde;
		stock = new Produit[MAX];
		nb = 0;
	}
	
	public void rajouterProduit(Produit p) {
		
		if(nb < MAX) {
			
			for(int i = 0; i < nb; i++) {
				
				
			}
		}
	}
	
}
