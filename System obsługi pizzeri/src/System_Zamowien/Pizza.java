package System_Zamowien;
import java.util.Scanner;

public class Pizza extends Menu{//Fabryka
	
	public String podaj_nazwe() {//Pozwala na podanie nazwy pizzy przez u¿ytkownika 
		System.out.println("Podaj nazwê pizzy");
		@SuppressWarnings("resource")
		Scanner odczyt= new Scanner(System.in);
		nazwa= odczyt.nextLine() ;
		return nazwa;
	}
	
	public void podaj_skladniki() {//Pozwala na podanie sk³adnikow pizzy
		System.out.println("Podaj sk³adniki pizzy");
		int x=0;
		String odp;
		do{
		System.out.println("Skladnik_"+(x+1));
		@SuppressWarnings("resource")
		Scanner	skladnik=new Scanner(System.in);
		skladniki[x]= skladnik.nextLine() ;
		System.out.println("Jeszcze jeden s³adnik? Tak=enter/Nie=n");
		@SuppressWarnings("resource")
		Scanner odczyt= new Scanner(System.in);
		odp= odczyt.nextLine() ;
		x=x+1;
		if(odp.equals("n")){
			x=15;
		 }
		}while(x!=15);
	}
		
	public int podaj_ostrosc(){//Pozwala na podanie ostrosci pizzy w zakresie od 0 do 10
		do{System.out.print("Podaj ostroœæ pizzy w zakresie od 0 do 10:");
		@SuppressWarnings("resource")
		Scanner ostr= new Scanner(System.in);
		ostrosc= ostr.nextInt();
		if(ostrosc<0 || ostrosc>10){
			System.out.println("Z³y zakres ostroœci");
		 }
		}while(ostrosc<0 || ostrosc>10);
		return ostrosc;
		}
	
	public void podaj_cene() {//Pozwala na podanie ceny pizzy nie mniejszej od 6zl-srednia
		do{System.out.print("Podaj cene œredniej pizzy:");
		@SuppressWarnings("resource")
		Scanner odczyt= new Scanner(System.in);
		cena= odczyt.nextInt();
		if(cena<6){
			System.out.println("Zbyt niska cena!");
		 }
		}while(cena<6);
		}
	
}
