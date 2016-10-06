package K1_Vererbung;

public class Koerpertemperatur extends Temperatur {

	public Koerpertemperatur(){
		super(36.5);
	}
	
	public void setCelsius(double grad){
		super.setCelsius(grad);
		
		if (grad >= 25 || grad <= 43){
			celsius = grad;
		}else{
			System.out.println("tot");
		}
	}
}
