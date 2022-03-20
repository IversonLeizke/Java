import Temperatures.Temperature;

public class App {
    public static void main(String[] args) throws Exception {
        Temperature temperature1 = new Temperature(100);

        System.out.println("Celsius: " + temperature1.getCelsius());
        System.out.println("Fahrenheit: " + temperature1.getFahrenheit());
        System.out.println("Kelvin: " + temperature1.getKelvin());
    }
}
