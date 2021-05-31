package Librairie;

import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) {

		Librairie l1;
		String nom;
		double solde;
		
		Scanner saisie = new Scanner(System.in);
		
		// Demande le nom et le solde de la librairie cr��e
		System.out.print("Quel est le nom de la librairie? : ");
		nom = saisie.nextLine();
		System.out.print("Quel est le solde? : ");
		solde = saisie.nextDouble();
		saisie.nextLine();
		
		l1 = new Librairie(nom, solde);
		
		// Rentre dans la m�thode "menu"
		menu(l1);
		
		saisie.close();
	}
	
	// M�thode qui affiche le menu de l'utilisateur
	static void menu(Librairie l1) {
		
		System.out.println("--------------------------------------------------------");
		System.out.print("\n Bienvenue � la librairie " + l1.getNom() + "!"
				+ "\n 1. Saisir les produits par fichier"
				+ "\n 2. Ajouter des nouveaux produits"
				+ "\n 3. Retirer des produits discontinu�s"
				+ "\n 4. Traiter des achats"
				+ "\n 5. Traiter des ventes"
				+ "\n 6. Rechercher un produit et afficher ses caract�ristiques"
				+ "\n 7. Consulter le solde"
				+ "\n 8. Quitter l'application"
				+ "\n");
		
		// Rentre dans la m�thode "reponse"
		int reponse = reponse();
		// Rentre dans le m�thode "choix" avec la r�ponse saisie pr�c�dement
		choix(reponse, l1);
	}
	
	// M�thode pour trouver la r�ponse qui sera utilis� dans la m�thode "choix"
	static int reponse() {
		
		int reponse;
		
		Scanner saisie = new Scanner(System.in);
		
		do {
		System.out.print("Choisissez une option : ");
		reponse = saisie.nextInt();
		
		} while(reponse < 1 || reponse > 8);
			
		saisie.close();
		return reponse;
	}
	
	// M�thode qui envoie l'utilisateur dans le choix qu'il a choisi
	static void choix(int reponse, Librairie l1)  {
		
		if(reponse == 1)
			choix1(l1);
		else {
			if(reponse == 2)
				choix2(l1);
			else {
				if(reponse == 3)
					choix3(l1);
				else {
					if(reponse == 4)
						choix4(l1);
					else{
						if(reponse == 5)
							choix5(l1);
						else {
							if(reponse == 6)
								choix6();
							else {
								if(reponse == 7)
									choix7(l1);
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
	}
	
	// M�thode qui prend le document "produit.txt" en entr� et transforme les lignes du fichier en produits
	static void choix1(Librairie l1) throws IOException {

		// Lit le fichier "produit.txt"
		BufferedReader ficEntree = new BufferedReader(new FileReader("\\Desktop\\Librairie\\produit.txt"));
		String ligneEntree = ficEntree.readLine();
		Scanner keybz = new Scanner(System.in);
		while (ligneEntree != null) {

			String delims = "[,]+";
			String[] tokens = ligneEntree.split(delims);
			System.out.print("Quel est le type de votre produit ");
			String type = keybz.nextLine();

			if (type == "CD") {
				Produit cd;
				cd = new CD(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), tokens[4], tokens[5],
						Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7]));

				l1.ajouterProduit(cd);

			}

			else {

				if (type == "DVD") {
					Produit dvd;
					dvd = new DVD(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), tokens[4],
							tokens[5], Integer.parseInt(tokens[6]));
					l1.ajouterProduit(dvd);
				}

				else {

					if (type == "JeuSociete") {
						Produit js;

						js = new JeuSociete(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), tokens[3],
								Integer.parseInt(tokens[4]), tokens[5], tokens[6]);

						l1.ajouterProduit(js);
					}

					else {

						if (type == "Magazine") {

							Produit Mg;
							Mg = new Magazine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]),  
									tokens[3], Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]),
									tokens[6]);
							l1.ajouterProduit(Mg);
						}

						else {

							if (type == "Livre") {
								Produit livre;
								livre = new Livre(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), 
										tokens[3], tokens[4], Integer.parseInt(tokens[5]), tokens[6]);
								l1.ajouterProduit(livre);

							}

							else {

								System.out.print("Ce type n'existe pas");
							}
						}

					}
				}
			}

		}

		menu(l1);
		keybz.close();
		ficEntree.close();
	}

	// M�thode qui demande � l'utilisateur les produits qu'il veut cr�er
	static void choix2(Librairie l1) {

		// Demande le nombre de produits � cr�er
		System.out.print("Vous voulez rentrer combien de produit");
		Scanner keyb = new Scanner(System.in);
		int nb;
		nb = keyb.nextInt();
		keyb.nextLine();

		for (int i = 0; i < nb; i++) {

			// Demande le type du produit, ses caract�ristiques et cr�er le produit. La loop for recommence un nombre de fois d�terminer au d�but
			System.out.print("Le Type de produit");
			String type = keyb.nextLine();

			// Si le type est "CD"
			if (type.equals("CD")) {

				Produit cd;
				System.out.print("Entrer le code,  prix, quantit�, duree,  titre, nom, annee et nbTitres du CD");

				String code = keyb.nextLine();
				int prix = keyb.nextInt();
				keyb.nextLine();
				int quantity = keyb.nextInt();
				keyb.nextLine();
				int duree = keyb.nextInt();
				keyb.nextLine();
				String titre = keyb.nextLine();
				String nom = keyb.nextLine();
				int anne = keyb.nextInt();
				keyb.nextLine();
				int nbTitres = keyb.nextInt();
				keyb.nextLine();

				cd = new CD(code, prix, quantity, duree, titre, nom, anne, nbTitres);

				l1.ajouterProduit(cd);

			}

			else {
				// Si le type est "DVD"
				if (type.equals("DVD")) {

					Produit dvd;
					System.out.print("Entrer le code,  prix, quantit�, duree,  titre,  nom et l' annee du DVD");

					String code = keyb.nextLine();
					int prix = keyb.nextInt();
					keyb.nextLine();
					int quantity = keyb.nextInt();
					keyb.nextLine();
					int duree = keyb.nextInt();
					keyb.nextLine();
					String titre = keyb.nextLine();
					String nom = keyb.nextLine();
					int anne = keyb.nextInt();
					keyb.nextLine();

					dvd = new DVD(code, prix, quantity, duree, titre, nom, anne);

					l1.ajouterProduit(dvd);
				}

				else {
					//Si le type est "Jeu de Societ�"
					if (type.equals("JeuSociete")) {
						Produit js;
						System.out.print(" code,  prix, quantit�, nom,  nbJoueur, theme et niveau du jeux de Societ�");

						String code = keyb.nextLine();
						int prix = keyb.nextInt();
						keyb.nextLine();
						int quantity = keyb.nextInt();
						keyb.nextLine();
						String nom = keyb.nextLine();
						int nbJoueur = keyb.nextInt();
						keyb.nextLine();
						String theme = keyb.nextLine();
						String niveau = keyb.nextLine();

						js = new JeuSociete(code, prix, quantity, nom, nbJoueur, theme, niveau);

						l1.ajouterProduit(js);
					}

					else {
						// Si le type est "Magazine"
						if (type.equals("Magazine")) {

							Produit Mg;
							System.out.print(
									" code,  prix, quantity, titre, mois, annee et categorie du magazine");
							String code = keyb.nextLine();
							int prix = keyb.nextInt();
							keyb.nextLine();
							int quantity = keyb.nextInt();
							keyb.nextLine();
							String titre = keyb.nextLine();
							int mois = keyb.nextInt();
							keyb.nextLine();
							int annee = keyb.nextInt();
							keyb.nextLine();
							String categorie = keyb.nextLine();

							Mg = new Magazine(code, prix, quantity, titre, mois, annee, categorie);
							l1.ajouterProduit(Mg);
						}

						else {
							//Si le type est "Livre"
							if (type.equals("Livre")) {

								Produit livre;
								System.out.print(
										" code,  prix,  quantity, titre,  annee,  auteur et l' editeur du Livre");

								String code = keyb.nextLine();
								int prix = keyb.nextInt();
								keyb.nextLine();
								int quantity = keyb.nextInt();
								keyb.nextLine();
								String titre = keyb.nextLine();
								String auteur = keyb.nextLine();
								int annee = keyb.nextInt();
								keyb.nextLine();
								String editeur = keyb.nextLine();

								livre = new Livre(code, prix, quantity, titre, auteur, annee, editeur);
								l1.ajouterProduit(livre);

							}

							else {
								// Si aucun type de se nom
								System.out.print("Ce type n'existe pas");
							}

						}

					}

				}

			}

		}
		// Retourne au menu
		menu(l1);
		keyb.close();

	}
	
	// M�thode qui efface les produits discontinu�s par leur code que l'utilisateur donne en saisie
    static void choix3(Librairie l1) {
		
    	String code, reponse;
    	
    	Scanner saisie = new Scanner(System.in);
    	
    	do {
    		// Demande le code du produit
    	System.out.print(" \n Quel est le code du produit discontinu�? : ");
    	code = saisie.nextLine();
    	
    	/* Le produit est cherch� et si sa quantit� est de 0, il est retir� du tableau gr�ce � la m�thode "retirerProduit".
    	 Sinon, un message s'affiche pour dire � l'utilisateur que le produit n'�tais pas discontinu� */
    	if(l1.rechercherProduit(code).getQuantity() == 0)
    		l1.retirerProduit(code);
    	else
    		System.out.println("Erreur, le produit n'est pas discontinu�.");
    	
    	// Demande � l'utilisateur s'il veut retirer un autre produit
    	System.out.print("Voulez-vous retirer un autre produit? : ");
    	reponse = saisie.nextLine();
    	
    	} while(reponse.equals("Oui"));
    	
    	// Retourner au menu
    	menu(l1);
    	
    	saisie.close();
	}
    
    // M�thode pour acheter des produits
    static void choix4(Librairie l1) {
		
    	String code;
    	int quantity;
    	String reponse;
    	
    	Scanner saisie = new Scanner(System.in);
    	// Demande le code du produit � acheter et sa quantit�
    	do {
    	System.out.print("\n Quel est le code du produit � acheter? : ");
    	code = saisie.nextLine();
    	System.out.print("Quel est la quantit�? : ");
    	quantity = saisie.nextInt();
    	saisie.nextLine();
    	
    	// Si le solde de la librairie n'est pas trop basse, le produit sera achet�. Sinon, le produit ne sera pas achet�
    	if(l1.acheterProduit(quantity, code)) 
    		System.out.println("Produit achet�!");
    	else
    		System.out.println("Erreur, le solde de la librairie est trop basse.");
    	
    	// Demande l'utilisateur s'il veut acheter un autre produit
    	System.out.print("Voulez-vous acheter un autre produit? (Oui/Non) :  ");
    	reponse = saisie.nextLine();
    	
    	} while(reponse.equals("Oui"));
    	
    	// Retourne au menu
    	menu(l1);
    	
    	saisie.close();
	}
    
    // M�thode pour vendre des produits
    static void choix5(Librairie l1) {
    	
    	String code;
    	int quantity;
    	String reponse;
    	
    	Scanner saisie = new Scanner(System.in);
    	
    	// Demande � l'utilisateur le code du produit � vendre et sa quantit�
    	do {
    	System.out.print("\n Quel est le code du produit � vendre? : ");
    	code = saisie.nextLine();
    	System.out.print("Quel est la quantit�? : ");
    	quantity = saisie.nextInt();
    	saisie.nextLine();
    	
    	// Utilise la m�thode "vendreProduit" pour vendre le produit
    	if(l1.vendreProduit(quantity, code)) 
    		System.out.println("Produit vendu!");
    	
    	// Demande � l'utilisateur s'il veut vendre un autre produit
    	System.out.print("Voulez-vous vendre un autre produit? (Oui/Non) : ");
    	reponse = saisie.nextLine();
    	
    	} while(reponse.equals("Oui"));
    	
    	// Retourne au menu
    	menu(l1);
    	
    	saisie.close();
    	
	}
    
    static void choix6() {
		
	}
    
    // M�thode pour afficher le solde de la librairie
    static void choix7(Librairie l1) {
    	
    	// Affiche le solde
    	System.out.print("\n Le solde de la librairie est : " + l1.getSolde() + "!");
    	
    	// Retourne au menu
    	menu(l1);
	}
	
    // M�thode pour quitter l'application
	static void choix8() {
		
		System.out.println("--------------------------------------------------------"
				+ "\n Bonne journ�e!");
	}
}