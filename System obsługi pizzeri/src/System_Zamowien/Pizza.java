package System_Zamowien;
import java.util.Scanner;

public class Pizza extends Menu{
	
	/*protected String nazwa;
	protected String[] skladniki= new String[15];
	public int ostrosc;
	public int cena;*/// cena œredniej+5z³ cena du¿ej w stosunku do ma³ej+10z³ //mozna dodaæ jedn¹ z trzech metod
	//Przy³ad
	
	public String podaj_nazwe() {
		System.out.println("Podaj nazwê pizzy");
		Scanner odczyt= new Scanner(System.in);
		nazwa= odczyt.nextLine() ;
		return nazwa;
	}
	
	public String podaj_skladniki() {
		System.out.println("Podaj sk³adniki pizzy");
		int x=0;
		String odp;
		do{
		System.out.println("Skladnik_"+(x+1));
		Scanner	skladnik=new Scanner(System.in);
		skladniki[x]= skladnik.nextLine() ;
		System.out.println("Jeszcze jeden s³adnik? Tak=t/Nie=n");
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
		do{System.out.print("Podaj ostroœæ pizzy w zakresie od 0 do 10:");
		Scanner ostr= new Scanner(System.in);
		ostrosc= ostr.nextInt();
		if(ostrosc<0 || ostrosc>10){
			System.out.println("Z³y zakres ostroœci");
		 }
		}while(ostrosc<0||ostrosc>10);
		return ostrosc;
		}
	
	public void podaj_cene() {
		System.out.print("Podaj cene œredniej pizzy:");
		Scanner odczyt= new Scanner(System.in);
		cena= odczyt.nextInt();
		}
	
}
