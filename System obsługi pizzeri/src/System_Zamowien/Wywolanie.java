package System_Zamowien;
import java.util.Scanner;

public class Wywolanie {//Fasada,Fabryka
	
	public void wywolanie(String[] args){
		//deklaracja pizzy wyswetlanych w menu
		Pizza Pizza1=new Pizza();
		Pizza Wegetarianska=new Pizza();
		Pizza Capricciosa=new Pizza();
		Pizza Pepperoni=new Pizza();
		//ustawianie parametrow pizzy 
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
	
		
		String odp;
		System.out.println("Czy chcesz dodaæ now¹ pizze do Menu? Tak=t/Nie=enter");
		Scanner odczyt= new Scanner(System.in);
		odp= odczyt.nextLine() ;
		
		if(odp.equals("t")){//Pozwala dodaæ now¹ pizze
			System.out.println("Tworzenie Pizzy:");
			Pizza1.podaj_nazwe();
			Pizza1.podaj_skladniki();
			Pizza1.podaj_ostrosc();
			Pizza1.podaj_cene();
			Pizza1.wypisz_skladniki();
			}
		
		System.out.println("Menu");
		System.out.println("-------------------------------------------------------------------------------------------");	
		Wegetarianska.wypisz_skladniki();
		Capricciosa.wypisz_skladniki();
		Pepperoni.wypisz_skladniki();
		Pizza1.wypisz_skladniki();
		System.out.println("-------------------------------------------------------------------------------------------");

		System.out.println("Czy chcesz zamówiæ pizze? Tak=t/Nie=enter");
		Scanner zam= new Scanner(System.in);
		odp= zam.nextLine();
		if(odp.equals("t")){//Pozwala zamowiæ wybrane pizze
		Zamowienia Order1= new Zamowienia();
		Order1.Skladanie_zamowienia(Wegetarianska,Capricciosa,Pepperoni,Pizza1);
		Order1.Wypisz_zamowienie();
		}
	}
	

}
