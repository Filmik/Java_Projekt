package System_Zamowien;
import java.util.Scanner;

public class Pizza {
//a
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
		String odp;
		do{
		System.out.println("Skladnik_"+(x+1));
		Scanner	skladnik=new Scanner(System.in);
		skladniki[x]= skladnik.nextLine() ;
		System.out.println("Jeszcze jeden s�adnik? Tak=t/Nie=n");
		Scanner odczyt= new Scanner(System.in);
		odp= odczyt.nextLine() ;
		x=x+1;
		if(odp.equals("n")){
			x=15;
		 }
		}while(x!=15);
		return skladniki[1];
	}
	
	public void wypisz_skladniki() {
		int x=0;
		System.out.println("Skldniki(");
		do {
		System.out.println(skladniki[x]+",");
		x=x+1;
		if(skladniki[x]==null){
			x=15;
		}
		}while(x!=15);
		System.out.println(")");
	}
	
	//opis zawieraj�cy/sk�daniki,posiom ostro�ci,cena/zale�ne od zawarto�ci itp. 
	//sos-ostro��=1
	//papryka-ostro��=0
	//papryka_ostra-ostro��=5
}
