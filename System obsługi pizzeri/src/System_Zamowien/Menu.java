package System_Zamowien;

public class Menu {

	protected String nazwa;
	protected String[] skladniki= new String[15];
	public int ostrosc;
	public int cena;// cena �redniej+5z� cena du�ej w stosunku do ma�ej+10z� //mozna doda� jedn� z trzech metod
	//Przy�ad
	
	public String Podaj_si�e(){
		return nazwa;}
	
	public String Podaj_obrona(){
		return skladniki[15];}
	
	public int Podaj_inteligencja(){
		return ostrosc;}
	
	public int Podaj_celno��(){
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
		System.out.print(" ostro�� "+ostrosc+" ,");
		System.out.print((cena-5)+" z� ma�a,");
		System.out.print(cena+" z� �rednia,");
		System.out.println((cena+5)+" z� du�a");
//capricciosa (pieczarki, sos, szynka), ostro�� 1, 22 z� ma�a, 27 z� �rednia, 32 z� du�a
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
