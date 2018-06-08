package System_Zamowien;

import java.util.Scanner;

public class Wywolanie extends Pizza{
	
	public void zapis_txt(){
		
	}
	
	public void wywolanie(String[] args){
		
		Pizza Pizza1=new Pizza();//mozna zrobic osobna finkcje do dodania pizzy i inno do wczytania z pliku i wypisania
		Pizza Wegetarianska=new Pizza();
		Pizza Capricciosa=new Pizza();
		Pizza Pepperoni=new Pizza();
		
		Wegetarianska.Ustaw_nazwa("Wegetariañska");
		Wegetarianska.Ustaw_skladniki(args);
		Wegetarianska.Ustaw_ostrosc(0);
		Wegetarianska.Ustaw_cena(25);	
		
		Capricciosa.Ustaw_nazwa("Capricciosa");
		Capricciosa.Ustaw_skladniki(args);
		Capricciosa.Ustaw_ostrosc(1);
		Capricciosa.Ustaw_cena(27);
		
		Pepperoni.Ustaw_nazwa("Pepperoni");
		Pepperoni.Ustaw_skladniki(args);
		Pepperoni.Ustaw_ostrosc(5);
		Pepperoni.Ustaw_cena(30);
		
		//ZapisIWczytanieZtxt pepe=new ZapisIWczytanieZtxt();
		//pepe.zapis(Pepperoni.wypisz_skladniki());
		
		String odp;
		System.out.println("Czy chcesz dodaæ now¹ pizze do Menu? Tak=t/Nie=n");
		Scanner odczyt= new Scanner(System.in);
		odp= odczyt.nextLine() ;
		
		if(odp.equals("t")){
			System.out.println("Tworzenie Pizzy:");
			//Pizza Pizza1=new Pizza();
			//Jakiœ wzorzec projektowy
			Pizza1.podaj_nazwe();
			Pizza1.podaj_skladniki();
			Pizza1.podaj_ostrosc();
			Pizza1.podaj_cene();
			}
		
		System.out.println("Menu");
		System.out.println("-------------------------------------------------------------------------------------------");
		Wegetarianska.wypisz_skladniki();
		Capricciosa.wypisz_skladniki();
		Pepperoni.wypisz_skladniki();
		Pizza1.wypisz_skladniki();
		System.out.println("-------------------------------------------------------------------------------------------");

		System.out.println("Czy chcesz zamówiæ pizze? Tak=t/Nie=n");
		Scanner zam= new Scanner(System.in);
		odp= zam.nextLine();
		if(odp.equals("t")){
		Zamowienia Order1= new Zamowienia();
		Order1.Skladanie_zamowienia(Wegetarianska,Capricciosa,Pepperoni,Pizza1);
		Order1.Wypisz_zamowienie();
		}
	}
	

}
