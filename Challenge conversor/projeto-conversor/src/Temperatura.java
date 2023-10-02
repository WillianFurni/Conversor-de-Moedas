
public class Temperatura {

	public double getCelsius(double fahrenheit) {
		return (fahrenheit -32) * 5/9;
	}
	
	public double getFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	
}