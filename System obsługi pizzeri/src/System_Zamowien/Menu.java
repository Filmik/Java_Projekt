package System_Zamowien;

public class Menu {

	protected String nazwa;
	protected String[] skladniki= new String[15];
	public int ostrosc;
	public int cena;// cena œredniej+5z³ cena du¿ej w stosunku do ma³ej+10z³ //mozna dodaæ jedn¹ z trzech metod
	//Przy³ad
	
	public String Podaj_si³e(){
		return nazwa;}
	
	public String Podaj_obrona(){
		return skladniki[15];}
	
	public int Podaj_inteligencja(){
		return ostrosc;}
	
	public int Podaj_celnoœæ(){
		return cena;}
	
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
//capricciosa (pieczarki, sos, szynka), ostroœæ 1, 22 z³ ma³a, 27 z³ œrednia, 32 z³ du¿a
	}
	
	public void menu() {
		System.out.println("Menu");
		System.out.println("-----------------------------------------");
		System.out.println("");
		if(nazwa!=null){
		wypisz_skladniki();
		}
		System.out.println("-----------------------------------------");
		}
}
