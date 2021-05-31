package Librairie;

import java.io.*;
public class Librairie {

	private static final int MAX = 500;
	private String nom;
	private double solde;
	private static Produit[] listeStock;
	private static int nb;
	
	public Librairie(String nom, double solde) {
		
		this.nom = nom;
		this.solde = solde;
		listeStock = new Produit[MAX];
		nb = 0;
	}
	
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getSolde() {
		return solde;
	}



	public void setSolde(double solde) {
		this.solde = solde;
	}



	public static Produit[] getListeStock() {
		return listeStock;
	}



	public static void setListeStock(Produit[] listeStock) {
		Librairie.listeStock = listeStock;
	}



	public static int getNb() {
		return nb;
	}

	public void ajouterProduit(Produit p) {
		
		if(nb < MAX) {
			
			listeStock[nb] = p;
			nb++;
		}
	}
	
	public void retirerProduit(String code) {
		
		if(nb > 0) 
			
			for(int i = 0; i < nb; i++) {
				
				if(listeStock[i].getCode().equals(code)) {
					listeStock[i] = listeStock[nb];
				    nb--;
				}
			}
			
	}
	
	public boolean acheterProduit(int quantite, String code) throws IOException {
		
		Produit produit = rechercherProduit(code);
		double prixTotal = 0.0;
		double prix = 0.0;
		
		if(produit != null) {
		produit.augmenterQuantiter(quantite);
		prix = produit.getPrix();
		}
		
		prixTotal = prix * quantite;
		
		if(solde < prixTotal)
			return false;
		else {
			solde -= prixTotal;
			Bilan.ecrireBilan("Achat", code, quantite);
			return true;
		} 
	}
	
	public boolean vendreProduit(int quantite, String code) throws IOException {
		
       Produit produit = rechercherProduit(code);
       double prix = 0.0;
       double prixTotal = 0.0;
		
		if(produit != null) {
		produit.diminuerQuantiter(quantite);
		prix = produit.calculerPrixVente();
		}
		
		prixTotal = prix * quantite;
		
		solde += prixTotal;
		Bilan.ecrireBilan("Vente", code, quantite);
		
		return true;
	}
		
	
	public Produit rechercherProduit(String code) {
		
		Produit produit = null;
		
		for(int i = 0; i < nb; i++) {
			
			if(listeStock[i].getCode().equals(code))
				produit = listeStock[i];
		}
		
		return produit;
	}


	@Override
	public String toString() {
		return "Librairie [nom=" + nom + ", solde=" + solde + "]";
	}
	
	
	
}
