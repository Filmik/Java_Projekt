package System_Zamowien;

import java.util.Scanner;
//import java.lang.*;

public class Menu {
	protected String nazwa;
	protected String[] skladniki= new String[15];
	public int ostrosc;
	public int cena;
	
	// cena œredniej+5z³ cena du¿ej w stosunku do ma³ej+10z³ //WZORZEC1 
	
	
	//zrob z tego klase i bedzie fabryka! WZORZEC2
	public String Podaj_nazwa(){
		return nazwa;}
	public void Ustaw_nazwa(String nazwa){
		this.nazwa= nazwa;}
	
	public String Podaj_skladniki(){
		return skladniki[15];}
	public void Ustaw_skladniki(String[] skladniki){
		if(nazwa=="Wegetariañska") {
		this.skladniki[0]= "papryka";
		this.skladniki[1]= "pomido";
		this.skladniki[2]= "ser";
		}
		if(nazwa=="Capricciosa") {
			this.skladniki[0]= "pieczarki";
			this.skladniki[1]= "sos";
			this.skladniki[2]= "szynka";
			}
		if(nazwa=="Pepperoni") {
			this.skladniki[0]= "salami";
			this.skladniki[1]= "papryka ostra";
			this.skladniki[2]= "cebula";
			this.skladniki[3]= "ser";
			}
	}
	
	public int Podaj_ostrosc(){
		return ostrosc;}
	public void Ustaw_ostrosc(int ostrosc){
		this.ostrosc= ostrosc;}
		
	public int Podaj_cena(){
		return cena;}
	public void Ustaw_cena(int cena){
		this.cena= cena;}
	
	/*public String Podaj_skladniki(){
		return skladniki[15];}
	
	public int Podaj_ostrosc(){
		return ostrosc;}
	
	public int Podaj_celnoœæ(){
		return cena;}*/
	
	public void wypisz_skladniki() {
		int x=0;
		System.out.print(nazwa+"(");
		do {
		System.out.print(skladniki[x]+",");
		x=x+1;
		if(skladniki[x]==null){
			x=15;
			System.out.print(")");
		}
		}while(x!=15);
		System.out.print(" ostroœæ "+ostrosc+" ,");
		System.out.print((cena-5)+" z³ ma³a,");
		System.out.print(cena+" z³ œrednia,");
		System.out.println((cena+5)+" z³ du¿a");
	}
	
	public void menu() {
		if(nazwa!=null){
		wypisz_skladniki();
		}
	}
}
