package Librairie;

import java.io.*;
public class Bilan {
	
	// M�thode pour �crire le bilan sur un document nomm� "Bilan.txt"
	public static void ecrireBilan(String type, String code, int quantity) throws IOException {
		
	    BufferedWriter fichierSortie = new BufferedWriter(new FileWriter("\\Desktop\\Librairie\\Bilan.txt"));
		fichierSortie.write(type + ", " + code + ", " + quantity);
		fichierSortie.newLine();
		fichierSortie.close();
	}
}