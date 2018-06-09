package System_Zamowien;
//import java.util.Scanner;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Witaj w pizzeri 'Leone'");
		Wywolanie Leone=new Wywolanie();
		Leone.wywolanie(args);
		System.out.println("Do widzenia.");
	}
}
	
