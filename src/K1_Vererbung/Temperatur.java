package K1_Vererbung;

public class Temperatur {

	protected double celsius;
	
	public Temperatur() {
		
	}
	public Temperatur(double grad){
		setCelsius(grad);
	}
	
	public double getCelsius(){
		return celsius;
	}
	
	public void setCelsius(double grad){
		if (grad > -273.15){
			celsius = grad;
		}else{
			celsius = -273.15;
		}
	}
}
