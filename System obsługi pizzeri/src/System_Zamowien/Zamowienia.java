package System_Zamowien;

import java.util.Scanner;

public class Zamowienia {//extends Pizza {
	String[] zam=new String[100];
	int[] ilosc = new int[100];
	int[] wielkosc=new int[100];
	String odp;
	String adres;
	int cena_zamowienia;
	
	public void Skladanie_zamowienia(Pizza Wegetarianska,Pizza Capricciosa,Pizza Pepperoni,Pizza Pizza1) {
		int x=0;
		System.out.println("System sk³adania zamowienia");
		do{
			int zamu=0;
			Scanner odczyt= new Scanner(System.in);
			do{System.out.print("Podaj nazwê pizzy: ");
			zam[x]=odczyt.nextLine();
			if(zam[x].equals(Wegetarianska.nazwa)) {
				zamu=1;}
			if(zam[x].equals(Capricciosa.nazwa)) {
				zamu=1;}
			if(zam[x].equals(Pepperoni.nazwa)) {
				zamu=1;}
			if(zam[x].equals(Pizza1.nazwa)) {
				zamu=1;}
			System.out.println("");
			}while(zamu!=1 );
			
		do {
		System.out.print("Podaj iloœæ: ");
		//Scanner ile= new Scanner(System.in);
		ilosc[x]=odczyt.nextInt();
		}while(ilosc[x]<1);
		do {
		System.out.print("Podaj Wielkoœæ: /1-ma³a 2-œrednia 3-du¿a ");
		//Scanner wiel= new Scanner(System.in);
		wielkosc[x]=odczyt.nextInt();
		}while(wielkosc[x]<1||wielkosc[x]>3);
		if(zam[x].equals(Wegetarianska.nazwa)) {
			if(wielkosc[x]==1) {
			 cena_zamowienia+=(Wegetarianska.Podaj_cena()-5)*ilosc[x];}
			if(wielkosc[x]==2) {
				 cena_zamowienia+=Wegetarianska.Podaj_cena()*ilosc[x];}
			if(wielkosc[x]==3) {
				 cena_zamowienia+=(Wegetarianska.Podaj_cena()+5)*ilosc[x];}
		}
			if(zam[x].equals(Capricciosa.nazwa)) {
				if(wielkosc[x]==1) {
				 cena_zamowienia+=(Capricciosa.Podaj_cena()-5)*ilosc[x];}
				if(wielkosc[x]==2) {
					 cena_zamowienia+=Capricciosa.Podaj_cena()*ilosc[x];}
				if(wielkosc[x]==3) {
					 cena_zamowienia+=(Capricciosa.Podaj_cena()+5)*ilosc[x];}
		}
			if(zam[x].equals(Pepperoni.nazwa)) {
				if(wielkosc[x]==1) {
				 cena_zamowienia+=(Pepperoni.Podaj_cena()-5)*ilosc[x];}
				if(wielkosc[x]==2) {
					 cena_zamowienia+=Pepperoni.Podaj_cena()*ilosc[x];}
				if(wielkosc[x]==3) {
					 cena_zamowienia+=(Pepperoni.Podaj_cena()+5)*ilosc[x];}
				
		}
			if(zam[x].equals(Pizza1.nazwa)) {
				if(wielkosc[x]==1) {
				 cena_zamowienia+=(Pizza1.Podaj_cena()-5)*ilosc[x];}
				if(wielkosc[x]==2) {
					 cena_zamowienia+=Pizza1.Podaj_cena()*ilosc[x];}
				if(wielkosc[x]==3) {
					 cena_zamowienia+=(Pizza1.Podaj_cena()+5)*ilosc[x];}
			}
		System.out.println("Jeszcze jak¹œ pizze? Tak=t/Nie=n");
		Scanner czy_jescze= new Scanner(System.in);
		odp= czy_jescze.nextLine();
		x=x+1;
		}while(odp.equals("t"));
		System.out.println("Odbiór osobisty?(Koszt dowozu pod podany adres=10) Tak=t/Nie=n");
		Scanner odczyt= new Scanner(System.in);
		odp= odczyt.nextLine();
			if(odp.equals("n")){
				 cena_zamowienia+=10;
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
		System.out.print(" Iloœæ:"+ilosc[x]);
		System.out.println(" Wielkoœæ:"+wielkosc[x]);
		
		x=x+1;
		}while(zam[x]!=null);
		System.out.println("Cena zamówienia:"+cena_zamowienia);
		if(adres!=null) {
		System.out.println("Pod adres: "+adres);
		}else {System.out.println("Odbiur osobisty");}
		System.out.println("");
		System.out.println("¯wyczmy smacznego!");
	}
}
