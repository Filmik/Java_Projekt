package System_Zamowien;

public class Menu {
	protected String nazwa;
	protected String[] skladniki= new String[15];
	public int ostrosc;
	public int cena;
	
	public void Ustaw_nazwa(String nazwa){
		this.nazwa= nazwa;}
	public void Ustaw_ostrosc(int ostrosc){
		this.ostrosc= ostrosc;}
	public int Podaj_cena(){
		return cena;}
	public void Ustaw_cena(int cena){
		this.cena= cena;}
	
	public void Ustaw_skladniki(String[] skladniki){//ustawia sk�adniki dla pizzy z menu
		if(nazwa=="Wegetaria�ska") {
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
	
	public void wypisz_skladniki() {//wypisuje pizze do menu
		if(nazwa!=null){
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
		System.out.print(" ostro�� "+ostrosc+" ,");
		System.out.print((cena-5)+" z� ma�a,");
		System.out.print(cena+" z� �rednia,");
		System.out.println((cena+5)+" z� du�a");
		}
	}
	
}
