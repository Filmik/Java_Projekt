package System_Zamowien;
import java.util.Scanner;

public class Pizza extends Menu{
	
	/*protected String nazwa;
	protected String[] skladniki= new String[15];
	public int ostrosc;
	public int cena;*/// cena �redniej+5z� cena du�ej w stosunku do ma�ej+10z� //mozna doda� jedn� z trzech metod
	//Przy�ad
	
	public String podaj_nazwe() {
		System.out.println("Podaj nazw� pizzy");
		Scanner odczyt= new Scanner(System.in);
		nazwa= odczyt.nextLine() ;
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
		
	public int podaj_ostrosc(){
		do{System.out.print("Podaj ostro�� pizzy w zakresie od 0 do 10:");
		Scanner ostr= new Scanner(System.in);
		ostrosc= ostr.nextInt();
		if(ostrosc<0 || ostrosc>10){
			System.out.println("Z�y zakres ostro�ci");
		 }
		}while(ostrosc<0||ostrosc>10);
		return ostrosc;
		}
	
	public void podaj_cene() {
		System.out.print("Podaj cene �redniej pizzy:");
		Scanner odczyt= new Scanner(System.in);
		cena= odczyt.nextInt();
		}
	
}
