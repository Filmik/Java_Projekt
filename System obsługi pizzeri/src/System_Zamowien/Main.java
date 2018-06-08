package System_Zamowien;
//import java.util.Scanner;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Witaj w pizzeri 'Leone'");
		ZapisIWczytanieZtxt aha=new ZapisIWczytanieZtxt();
		ZapisIWczytanieZtxt pepe=new ZapisIWczytanieZtxt();
		pepe.zapis(args);
		aha.menu_pizzeri();
		Wywolanie Leone=new Wywolanie();
		Leone.wywolanie(args);
		System.out.println("Do widzenia.");
	}
}
	
