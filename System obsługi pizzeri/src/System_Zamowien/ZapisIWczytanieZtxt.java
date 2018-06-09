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
			System.out.println("Menu");
			System.out.println("-------------------------------------------------------------------------------------------");	
			File plik=new File("Menu_Pizzeri.txt");
			System.out.println("Plik zawiera:");
			Scanner odczyt= new Scanner(plik);
			while(odczyt.hasNextLine())
				System.out.println(odczyt.nextLine());
			odczyt.close();
		}
		
		/*public void zapis(Pizza Wegetarianska,Pizza Capricciosa,Pizza Pepperoni,Pizza Pizza1) throws FileNotFoundException{
		//	PrintWriter plik = new PrintWriter("Menu_Pizzeri.txt",true);  
			//FileWriter plik = new FileWriter("Menu_Pizzeri.txt",true);  
			//PrintWriter zapis= new PrintWriter(plik);
			//PrintWriter zapis= new PrintWriter(plik);
			//zapis.println("Nowa pizza"+" Sladniki");
			//zapis.close();
			//plik.write("Nowa pizza");
			//plik.close();
			Writer output = new BufferedWriter(new FileWriter("Menu_Pizzeri.txt", true));  
			output.append("jakiœ tekst");
			output.close();
		}*/
		
}
