public class Calc {
    
    public static double area(double med1, double med2) {
        double area = med1 * med2;
        return area;
    }

    public static double area(double bas1, double bas2, double alt) {
        double area = ((bas1 + bas2) * alt) / 2;
        return area;
    }
}
