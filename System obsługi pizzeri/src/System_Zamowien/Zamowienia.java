package System_Zamowien;

import java.util.Scanner;

public class Zamowienia extends Pizza {
	String[] zam=new String[100];
	int[] ilosc = new int[100];
	int[] wielkosc=new int[100];
	String odp;
	String adres;

	public void Skladanie_zamowienia(String Wegetarianska,String Capricciosa,String Pepperoni) {
		int x=0;
		System.out.println("aaa= "+Wegetarianska);//działaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		
		System.out.println("System składania zamowienia");
		do{
			
			Scanner odczyt= new Scanner(System.in);
			do{System.out.print("Podaj nazwę pizzy: ");
			zam[x]=odczyt.nextLine();
			System.out.println("");
			System.out.println("cap="+Capricciosa);
			}while(zam[x]!=Capricciosa);//z jakieś powodu nie działa, zrob jakoś inaczej
			
		do {
		System.out.print("Podaj ilość: ");
		Scanner ile= new Scanner(System.in);
		ilosc[x]=odczyt.nextInt();
		}while(ilosc[x]<1);
		do {
		System.out.print("Podaj Wielkość: /1-mała 2-średnia 3-duża ");
		Scanner wiel= new Scanner(System.in);
		wielkosc[x]=odczyt.nextInt();
		}while(wielkosc[x]<1||wielkosc[x]>3);
		if(wielkosc[x]>1) {
			cena=cena+5;
			if(wielkosc[x]>2) {
				cena=cena+5;
			}
		}
		System.out.println("Jeszcze jakąś pizze? Tak=t/Nie=n");
		Scanner czy_jescze= new Scanner(System.in);
		odp= czy_jescze.nextLine();
		x=x+1;
		}while(odp.equals("t"));
		System.out.println("Odbiór osobisty? Tak=t/Nie=n");
		Scanner odczyt= new Scanner(System.in);
		odp= odczyt.nextLine();
			if(odp.equals("n")){
				System.out.println("Podaj adres zamowienia:");
				Scanner adr= new Scanner(System.in);
				adres= adr.nextLine();
			}
	}
	public void Wypisz_zamowienie() {
		int x=0;
		System.out.println("");
		System.out.println("Podsumowanie zamowienia:");
		do {
		System.out.print("Pizza:");
		System.out.print(zam[x]);
		System.out.print(" Ilość:"+ilosc[x]);
		System.out.println(" Wielkość:"+wielkosc[x]);
		//CENA!!! wybranej pizzy :/
		x=x+1;
		}while(zam[x]!=null);
		if(adres!=null) {
		System.out.println("Pod adres: "+adres);
		}else {System.out.println("Odbiur osobisty");}
		System.out.println("");
		System.out.println("Żwyczmy smacznego!");
	}
}
