package System_Zamowien;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class ZapisIWczytanieZtxt {
		
		public void menu_pizzeri() throws FileNotFoundException{
			File plik=new File("Menu_Pizzeri.txt");
			System.out.println("Plik zawiera:");
			Scanner odczyt= new Scanner(plik);
			while(odczyt.hasNextLine())
				System.out.println(odczyt.nextLine());
			odczyt.close();
		}
		
		public void zapis(String[] args) throws FileNotFoundException{
			PrintWriter pliku = new PrintWriter("Menu_Pizzeri.txt", true);  
			pliku.println("jakiœ tekst");
			pliku.close();
			//PrintWriter zapis= new PrintWriter(plik);
			//zapis.println("Nowa pizza"+" Sladniki");
			//zapis.close();
		}
		
}
