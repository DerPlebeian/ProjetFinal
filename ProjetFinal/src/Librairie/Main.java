package Librairie;

import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) {

		menu();
	}
	
	static void menu() {
		
		System.out.print("Bienvenue à la librairie!"
				+ "\n 1. Saisir les produits par fichier"
				+ "\n 2. Ajouter des nouveaux produits"
				+ "\n 3. Retirer des produits discontinués"
				+ "\n 4. Traiter des achats"
				+ "\n 5. Traiter des ventes"
				+ "\n 6. Rechercher un produit et afficher ses caractéristiques"
				+ "\n 7. Consulter le solde"
				+ "\n 8. Quitter l'application"
				+ "\n");
		
		int reponse = reponse();
		choix(reponse);
	}
	
	static int reponse() {
		
		int reponse;
		
		Scanner saisie = new Scanner(System.in);
		
		do {
		System.out.print("Choisissez une option : ");
		reponse = saisie.nextInt();
		
		}while(reponse < 1 || reponse > 8);
			
		saisie.close();
		return reponse;
	}
	
	static void choix(int reponse) {
		
		if(reponse == 1)
			choix1();
		else {
			if(reponse == 2)
				choix2();
			else {
				if(reponse == 3)
					choix3();
				else {
					if(reponse == 4)
						choix4();
					else{
						if(reponse == 5)
							choix5();
						else
							if(reponse == 6)
								choix6();
							else {
								if(reponse == 7)
									choix7();
								else {
									if(reponse == 8)
										choix8();
								}
							}
					}
				}
			}
		}
	}
	
	static void choix1() {
		
	}
    static void choix2() {
		
    	
	}
    static void choix3() {
		
	}
    static void choix4() {
		
	}
    static void choix5() {
		
	}
    static void choix6() {
		
	}
    static void choix7() {
    	
	}
	
	static void choix8() {
		
		System.out.println("--------------------------------------------------------"
				+ "\n Bonne journée");
	}
}
