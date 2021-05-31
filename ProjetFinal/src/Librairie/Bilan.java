package Librairie;

import java.io.*;
public class Bilan {
	
	public static void ecrireBilan(String type, String code, int quantity) throws IOException {
		
	    BufferedWriter fichierSortie = new BufferedWriter(new FileWriter("\\Desktop\\Librairie\\Bilan.txt", true));
		fichierSortie.write(type + ", " + code + ", " + quantity);
		fichierSortie.newLine();
		fichierSortie.close();
	}

}
