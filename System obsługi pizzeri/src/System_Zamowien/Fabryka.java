package System_Zamowien;

public class Fabryka {//Fabryka

	public Pizza getIntance() {
		
		return new Pizza();
		
	}
	
	
	
	
	
	/*
	public Pizza getIntance(Pizza nazwa,int numer) {
		if(numer==1) {
		nazwa.Ustaw_nazwa("Wegetariañska");
		nazwa.skladniki[0]= "papryka";
		nazwa.skladniki[1]= "pomido";
		nazwa.skladniki[2]= "ser";
		nazwa.Ustaw_ostrosc(0);
		nazwa.Ustaw_cena(25);
		//return  new Pizza();
		}
		if(numer==2) {
			nazwa.Ustaw_nazwa("Capricciosa");
			nazwa.skladniki[0]= "pieczarki";
			nazwa.skladniki[1]= "sos";
			nazwa.skladniki[2]= "szynka";
			nazwa.Ustaw_ostrosc(1);
			nazwa.Ustaw_cena(27);
			}
		if(numer==3) {
			nazwa.Ustaw_nazwa("Pepperoni");
			nazwa.skladniki[0]= "salami";
			nazwa.skladniki[1]= "papryka ostra";
			nazwa.skladniki[2]= "cebula";
			nazwa.skladniki[3]= "ser";
			nazwa.Ustaw_ostrosc(5);
			nazwa.Ustaw_cena(30);
				}
		return  nazwa;
	}*/
	
}
