package System_Zamowien;
import java.util.Scanner;

public class Pizza {

	protected String nazwa;
	
	protected String[] skladniki= new String[15]; //mo�e tablica stringow??? albo jako� inaczej
	public int ostrosc;//np. od 0 do 10
	public char cena;// cena �redniej+5z� cena du�ej w stosunku do ma�ej+10z� //mozna doda� jedn� z trzech metod
	//Przy�ad
	
	//capricciosa (pieczarki, sos, szynka), ostro�� 1, 22 z� ma�a, 27 z� �rednia, 32 z� du�a
	public String podaj_nazwe() {
		return nazwa;
	}
	public String podaj_skladniki() {
		System.out.println("Podaj sk�adniki pizzy");
		int x=0;
		return skladniki[x];
		for(x=2;x>14;x++) {
		System.out.println("Jeszcze jeden s�adnik? Tak=t/Nie=n");
		String odp ;
		Scanner odczyt = new Scanner(System.in);
		odp= odczyt.nextLine() ;
		//	return odp;//jak wpisa� liczbe w konsoli?
		
		}
	}
	
	
	//opis zawieraj�cy/sk�daniki,posiom ostro�ci,cena/zale�ne od zawarto�ci itp. 
	//sos-ostro��=1
	//papryka-ostro��=0
	//papryka_ostra-ostro��=5
}
