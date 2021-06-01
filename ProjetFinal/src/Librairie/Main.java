package Librairie;

import java.util.Scanner;
import java.io.*;

public class Main {

	static Scanner keyb;

	public static void main(String[] args) {

		Librairie l1;
		String nom;
		double solde;

		keyb = new Scanner(System.in);

		// Demande le nom et le solde de la librairie cr��e
		System.out.print("Quel est le nom de la librairie? : ");
		nom = keyb.nextLine();
		System.out.print("Quel est le solde? : ");
		solde = keyb.nextDouble();
		keyb.nextLine();

		l1 = new Librairie(nom, solde);

		// Rentre dans la m�thode "menu"
		menu(l1);

		keyb.close();
	}

	// M�thode qui affiche le menu de l'utilisateur
	static void menu(Librairie l1) {

		System.out.println("\n --------------------------------------------------------");
		System.out.print("\n Bienvenue � la librairie " + l1.getNom() + "!" + "\n 1. Saisir les produits par fichier"
				+ "\n 2. Ajouter des nouveaux produits" + "\n 3. Retirer des produits discontinu�s"
				+ "\n 4. Traiter des achats" + "\n 5. Traiter des ventes"
				+ "\n 6. Rechercher un produit et afficher ses caract�ristiques" + "\n 7. Consulter le solde"
				+ "\n 8. Quitter l'application" + "\n");

		// Rentre dans la m�thode "reponse"
		int reponse = reponse();
		// Rentre dans le m�thode "choix" avec la r�ponse saisie pr�c�dement
		choix(reponse, l1);
	}

	// M�thode pour trouver la r�ponse qui sera utilis� dans la m�thode "choix"
	static int reponse() {

		int reponse;
		
		do {
			System.out.print("Choisissez une option : ");
			reponse = keyb.nextInt();
			keyb.nextLine();

		} while (reponse < 1 || reponse > 8);

		// saisie.close();
		return reponse;
	}

	// M�thode qui envoie l'utilisateur dans le choix qu'il a choisi
	static void choix(int reponse, Librairie l1) {

		if (reponse == 1) {
			try {
				choix1(l1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (reponse == 2)
			choix2(l1);
		else if (reponse == 3)
			choix3(l1);
		else if (reponse == 4)
			choix4(l1);
		else if (reponse == 5)
			choix5(l1);
		else if (reponse == 6)
			choix6(l1);
		else if (reponse == 7)
			choix7(l1);
		else if (reponse == 8)
			choix8();

	}

	// M�thode qui prend le document "produit.txt" en entr� et transforme les lignes
	// du fichier en produits
	static void choix1(Librairie l1) throws IOException {

		String path;
		// Lit le fichier donné en saisie
		System.out.println("Quel est le chemin du fichier qui sera lu? :");
		path = keyb.next();

		BufferedReader ficEntree = new BufferedReader(new FileReader(path));
		String ligneEntree = ficEntree.readLine();
		while (ligneEntree != null) {

			String delims = " ?: ?|, ?";
			String[] tokens = ligneEntree.split(delims);

			if (tokens[0].equals("CD")) {
				Produit cd;
				cd = new CD(tokens[1], Integer.parseInt(tokens[2].trim()), Integer.parseInt(tokens[3].trim()),
						Integer.parseInt(tokens[4].trim()), tokens[5], tokens[6], Integer.parseInt(tokens[7].trim()),
						Integer.parseInt(tokens[8].trim()));

				l1.ajouterProduit(cd);

			}

			else

			if (tokens[0].equals("DVD")) {
				Produit dvd;
				dvd = new DVD(tokens[1], Integer.parseInt(tokens[2].trim()), Integer.parseInt(tokens[3].trim()),
						Integer.parseInt(tokens[4].trim()), tokens[5], tokens[6], Integer.parseInt(tokens[7].trim()));
				l1.ajouterProduit(dvd);
			}

			else

			if (tokens[0].equals("Jeu")) {
				Produit js;

				js = new JeuSociete(tokens[1], Integer.parseInt(tokens[2].trim()), Integer.parseInt(tokens[3].trim()), tokens[4],
						Integer.parseInt(tokens[5].trim()), tokens[6], tokens[7]);

				l1.ajouterProduit(js);
			}

			else

			if (tokens[0].equals("Magazine")) {

				Produit Mg;
				Mg = new Magazine(tokens[1], Integer.parseInt(tokens[2].trim()), Integer.parseInt(tokens[3].trim()), tokens[4],
						Integer.parseInt(tokens[5].trim()), Integer.parseInt(tokens[6].trim()), tokens[7]);
				l1.ajouterProduit(Mg);
			}

			else

			if (tokens[0].equals("Livre")) {
				Produit livre;
				livre = new Livre(tokens[1], Integer.parseInt(tokens[2].trim()), Integer.parseInt(tokens[3].trim()), tokens[4],
						tokens[5], Integer.parseInt(tokens[6].trim()), tokens[7]);
				l1.ajouterProduit(livre);

			}

			else
				System.out.println("Ce type n'existe pas : " + ligneEntree);
			
			ligneEntree = ficEntree.readLine();
		}
	
		ficEntree.close();

	    menu(l1);
    }

	// M�thode qui demande � l'utilisateur les produits qu'il veut cr�er
	static void choix2(Librairie l1) {

		// Demande le nombre de produits � cr�er
		System.out.print("\n Combien de produit voulez-vous rentrer? : ");
		int nb;
		nb = keyb.nextInt();

		for (int i = 0; i < nb; i++) {

			// Demande le type du produit, ses caract�ristiques et cr�er le produit. La loop
			// for recommence un nombre de fois d�terminer au d�but
			System.out.print("Quel est le type de produit? ");
			String type = keyb.next();

			// Si le type est "CD"
			if (type.equals("CD")) {

				Produit cd;
				System.out.println("Entrez le code, le prix, la quantit�, la dur�e, le titre, le nom, l'ann�e et le nombre de titres du CD :");

				String code = keyb.next();
				int prix = keyb.nextInt();
				int quantity = keyb.nextInt();
				int duree = keyb.nextInt();
				String titre = keyb.next();
				String nom = keyb.next();
				int annee = keyb.nextInt();
				int nbTitres = keyb.nextInt();
				cd = new CD(code, prix, quantity, duree, titre, nom, annee, nbTitres);

				l1.ajouterProduit(cd);

			}

			else
			// Si le type est "DVD"
			if (type.equals("DVD")) {

				Produit dvd;
				System.out.println("Entrez le code, le prix, la quantit�, la dur�e, le titre, le nom et l'ann�e du DVD : ");

				String code = keyb.next();
				int prix = keyb.nextInt();
				int quantity = keyb.nextInt();
				int duree = keyb.nextInt();
				String titre = keyb.next();
				String nom = keyb.next();
				int anne = keyb.nextInt();

				dvd = new DVD(code, prix, quantity, duree, titre, nom, anne);

				l1.ajouterProduit(dvd);
			}

			else
			// Si le type est "Jeu de Societ�"
			if (type.equals("Jeu")) {
				Produit js;
				System.out.println("Entrez le code, le prix, la quantit�, le nom, le nombre de joueurs, le theme et le niveau de jeu :");

				String code = keyb.next();
				int prix = keyb.nextInt();
				int quantity = keyb.nextInt();
				String nom = keyb.nextLine();
				int nbJoueur = keyb.nextInt();
				String theme = keyb.next();
				String niveau = keyb.next();

				js = new JeuSociete(code, prix, quantity, nom, nbJoueur, theme, niveau);

				l1.ajouterProduit(js);
			}

			else
			// Si le type est "Magazine"
			if (type.equals("Magazine")) {

				Produit Mg;
				System.out.println("Entrez le code, le prix, la quantit�, le titre, le mois, l'ann�e et la categorie du magazine : ");
				String code = keyb.next();
				int prix = keyb.nextInt();
				int quantity = keyb.nextInt();
				String titre = keyb.nextLine();
				int mois = keyb.nextInt();
				int annee = keyb.nextInt();
				String categorie = keyb.next();

				Mg = new Magazine(code, prix, quantity, titre, mois, annee, categorie);
				l1.ajouterProduit(Mg);
			}

			else
			// Si le type est "Livre"
			if (type.equals("Livre")) {

				Produit livre;
				System.out.println("Entrz le code, le prix, la quantit�, le titre, l'ann�e, l'auteur et l'�diteur du livre : ");

				String code = keyb.next();
				int prix = keyb.nextInt();
				int quantity = keyb.nextInt();
				String titre = keyb.next();
				String auteur = keyb.next();
				int annee = keyb.nextInt();
				String editeur = keyb.next();

				livre = new Livre(code, prix, quantity, titre, auteur, annee, editeur);
				l1.ajouterProduit(livre);

			}

			else
				// Si aucun type de se nom
				System.out.print("Ce type n'existe pas");

		}

		// Retourne au menu
		menu(l1);

	}

	// M�thode qui efface les produits discontinu�s par leur code que l'utilisateur
	// donne en saisie
	static void choix3(Librairie l1) {

		String code, reponse;

		// Scanner saisie = new Scanner(System.in);

		do {
			// Demande le code du produit
			System.out.print(" \n Quel est le code du produit discontinu�? : ");
			code = keyb.nextLine();

			/*
			 * Le produit est cherch� et si sa quantit� est de 0, il est retir� du tableau
			 * gr�ce � la m�thode "retirerProduit". Sinon, un message s'affiche pour dire �
			 * l'utilisateur que le produit n'�tais pas discontinu�
			 */
			if (l1.rechercherProduit(code).getQuantity() == 0)
				l1.retirerProduit(code);
			else
				System.out.println("Erreur, le produit n'est pas discontinu�.");

			// Demande � l'utilisateur s'il veut retirer un autre produit
			System.out.print("Voulez-vous retirer un autre produit? : ");
			reponse = keyb.nextLine();

		} while (reponse.equals("Oui"));

		// Retourner au menu
		menu(l1);
	}

	// M�thode pour acheter des produits
	static void choix4(Librairie l1) {

		String code;
		int quantity;
		String reponse;

		// Scanner saisie = new Scanner(System.in);
		// Demande le code du produit � acheter et sa quantit�
		do {
			System.out.print("\n Quel est le code du produit � acheter? : ");
			code = keyb.nextLine();
			System.out.print("Quel est la quantit�? : ");
			quantity = keyb.nextInt();
			keyb.nextLine();

			// Si le solde de la librairie n'est pas trop basse, le produit sera achet�.
			// Sinon, le produit ne sera pas achet�
			try {
				if (l1.acheterProduit(quantity, code))
					System.out.println("Produit achet�!");
				else
					System.out.println("Erreur, le solde de la librairie est trop basse.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Demande l'utilisateur s'il veut acheter un autre produit
			System.out.print("Voulez-vous acheter un autre produit? (Oui/Non) :  ");
			reponse = keyb.nextLine();

		} while (reponse.equals("Oui"));

		// Retourne au menu
		menu(l1);
	}

	// M�thode pour vendre des produits
	static void choix5(Librairie l1) {

		String code;
		int quantity;
		String reponse;

		// Scanner saisie = new Scanner(System.in);

		// Demande � l'utilisateur le code du produit � vendre et sa quantit�
		do {
			System.out.print("\n Quel est le code du produit � vendre? : ");
			code = keyb.nextLine();
			System.out.print("Quel est la quantit�? : ");
			quantity = keyb.nextInt();
			keyb.nextLine();

			// Utilise la m�thode "vendreProduit" pour vendre le produit
			try {
				if (l1.vendreProduit(quantity, code))
					System.out.println("Produit vendu!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Demande � l'utilisateur s'il veut vendre un autre produit
			System.out.print("Voulez-vous vendre un autre produit? (Oui/Non) : ");
			reponse = keyb.nextLine();

		} while (reponse.equals("Oui"));

		// Retourne au menu
		menu(l1);
	}

	// M�thode pour rechercher un produit par son code et montrer ses
	// caract�ristiques
	static void choix6(Librairie l1) {

		// Demande le code � l'utilisateur
		System.out.print("\n Entrez le code du produit : ");
		// Scanner keybs = new Scanner(System.in);
		String c = keyb.nextLine();

		// Si le produit existe
		if(l1.rechercherProduit(c) != null)
		// Recherche le produit avec la m�thode "rechercherProduit" et montre ses
		// caract�ristiques
		System.out.println(l1.rechercherProduit(c).toString());
		else
			System.out.println("Le produit avec ce code n'existe pas.");
		menu(l1);

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

		System.out.println("--------------------------------------------------------" + "\n Bonne journ�e!");
		
	}
}