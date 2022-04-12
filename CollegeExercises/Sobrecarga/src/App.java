public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("Calculo usando as medidas %d e %d, area igual a %.2f.\n", 10, 10, Calc.area(10, 10));
        System.out.printf("Calculo usando as medidas %d, %d e %d, area igual a %.2f.\n", 10, 10, 5, Calc.area(10, 10, 5));
    }
}
