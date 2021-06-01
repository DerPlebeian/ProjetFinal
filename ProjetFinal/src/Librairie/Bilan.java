package Librairie;

import java.io.*;
import java.util.Scanner;
public class Bilan {
	
	// Méthode pour écrire le bilan sur un document nommé "Bilan.txt"
	public static void ecrireBilan(String type, String code, int quantity) throws IOException {
		
		Scanner saisie = new Scanner(System.in);
		
		// Prend un fichier donné en saisie
		String path;
		
		System.out.println("Quel est le chemin de votre fichier? : ");
		path = saisie.nextLine();
		
	    BufferedWriter fichierSortie = new BufferedWriter(new FileWriter(path));
		fichierSortie.write(type + ", " + code + ", " + quantity);
		fichierSortie.newLine();
		fichierSortie.close();
		
		saisie.close();
	}
}