package System_Zamowien;
import java.util.Scanner;

public class Pizza {
//a
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
	
	//opis zawieraj¹cy/sk³daniki,posiom ostroœci,cena/zale¿ne od zawartoœci itp. 
	//sos-ostroœæ=1
	//papryka-ostroœæ=0
	//papryka_ostra-ostroœæ=5
}
