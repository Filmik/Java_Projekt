package System_Zamowien;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		System.out.println("Witaj w pizzeri 'Leone'");
		//int l=1;
		Pizza Pizza1=new Pizza();
		Pizza Wegetarianska=new Pizza();
		Pizza Capricciosa=new Pizza();
		Pizza Pepperoni=new Pizza();
		
		Wegetarianska.Ustaw_nazwa("Wegetaria�ska");
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
		
		/*albo odczyt i zapis do pliku albo predefiniowane menu i dodawanie pizzy tylko
		na czas dzia�ania programu */
		
		String odp;
		System.out.println("Czy chcesz doda� now� pizze do Menu? Tak=t/Nie=n");
		Scanner odczyt= new Scanner(System.in);
		odp= odczyt.nextLine() ;
	
		if(odp.equals("t")){
		System.out.println("Tworzenie Pizzy:");
		//Pizza Pizza1=new Pizza();
		//Jaki� wzorzec projektowy
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

		
		System.out.println("Czy chcesz zam�wi� pizze? Tak=t/Nie=n");
		Scanner zam= new Scanner(System.in);
		odp= zam.nextLine();
		if(odp.equals("t")){
		Zamowienia Order1= new Zamowienia();
		Order1.Skladanie_zamowienia(Wegetarianska,Capricciosa,Pepperoni,Pizza1);
		Order1.Wypisz_zamowienie();
		}
	System.out.println("Do widzenia.");
	}
}
