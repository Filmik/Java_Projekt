package System_Zamowien;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		System.out.println("Witaj w pizzeri 'Leone'");
		Pizza Pizza1=new Pizza();
		//System.out.println("Wybierz pizze z listy:");
		/*albo odczyt i zapis do pliku albo predefiniowane menu i dodawanie pizzy tylko
		na czas dzia³ania programu 
		Pizza*/
		String odp;
		System.out.println("Czy chcesz dodaæ now¹ pizze do Menu? Tak=t/Nie=n");
		Scanner odczyt= new Scanner(System.in);
		odp= odczyt.nextLine() ;
		
		if(odp.equals("t")){
		System.out.println("Tworzenie Pizzy:");
		//Pizza Pizza1=new Pizza();
		//Stwoz nowy obiekt jeœli odp=t
		Pizza1.podaj_nazwe();
		Pizza1.podaj_skladniki();
		Pizza1.podaj_ostrosc();
		Pizza1.podaj_cene();
		}
		
		Pizza1.menu();
		
		System.out.println("Czy chcesz zamówiæ pizze? Tak=t/Nie=n");
		Scanner zam= new Scanner(System.in);
		odp= zam.nextLine();
		if(odp.equals('t')) {
		System.out.println("Tworzenie zamowienia:");
		System.out.println("Wybierz Pizze:");
		System.out.println("Podaj wielkoœæ:");
		System.out.println("Podaj iloœæ:");
		}
	}
}
