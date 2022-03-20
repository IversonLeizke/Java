package Temperatures;

public class Temperature {
    private int celsius;

    public Temperature(int celsius) {
        this.celsius = celsius;
    }

    public int getCelsius() {
        return celsius;
    }

    public int getFahrenheit() {
        return (int) (1.8 * celsius + 32);
    }

    public int getKelvin() {
        return celsius + 273;
    }    
}