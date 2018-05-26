package System_Zamowien;
import java.util.Scanner;

public class Pizza {

	protected String nazwa;
	
	protected String[] skladniki= new String[15]; //mo¿e tablica stringow??? albo jakoœ inaczej
	public int ostrosc;//np. od 0 do 10
	public char cena;// cena œredniej+5z³ cena du¿ej w stosunku do ma³ej+10z³ //mozna dodaæ jedn¹ z trzech metod
	//Przy³ad
	
	//capricciosa (pieczarki, sos, szynka), ostroœæ 1, 22 z³ ma³a, 27 z³ œrednia, 32 z³ du¿a
	public String podaj_nazwe() {
		return nazwa;
	}
	public String podaj_skladniki() {
		System.out.println("Podaj sk³adniki pizzy");
		int x=0;
		return skladniki[x];
		for(x=2;x>14;x++) {
		System.out.println("Jeszcze jeden s³adnik? Tak=t/Nie=n");
		String odp ;
		Scanner odczyt = new Scanner(System.in);
		odp= odczyt.nextLine() ;
		//	return odp;//jak wpisaæ liczbe w konsoli?
		
		}
	}
	
	
	//opis zawieraj¹cy/sk³daniki,posiom ostroœci,cena/zale¿ne od zawartoœci itp. 
	//sos-ostroœæ=1
	//papryka-ostroœæ=0
	//papryka_ostra-ostroœæ=5
}
