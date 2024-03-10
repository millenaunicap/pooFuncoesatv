package PooFuncoes;

public class Q7 {
	
	 public static void main(String[] args) {
	        double temperaturaCelsius = 25.0;

	        double temperaturaFahrenheit = converterParaFahrenheit(temperaturaCelsius);

	        System.out.println(temperaturaCelsius + " graus Celsius equivalem a " + temperaturaFahrenheit + " graus Fahrenheit.");
	    }

	    
	    public static double converterParaFahrenheit(double temperaturaCelsius) {
	       
	        double temperaturaFahrenheit = temperaturaCelsius * (9.0 / 5.0) + 32.0;

	        return temperaturaFahrenheit;
	    }

}
