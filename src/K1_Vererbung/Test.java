package K1_Vererbung;

public class Test {

	public static void main (String args[]){
		
		Temperatur temp = new Temperatur();
		Temperatur temp2 = new Temperatur(-300.00);
		System.out.println(temp.getCelsius());
		System.out.println(temp2.getCelsius());
		
		Koerpertemperatur ktemp = new Koerpertemperatur();
		System.out.println(ktemp.getCelsius());
	}
}
