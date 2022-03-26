import Calc.Calc;

public class Main {
    public static void main(String[] args) throws Exception {
        Calc calc1 = new Calc();
        calc1.setBase(5);
        calc1.setHeight(5);
        calc1.setLength(5);
        System.out.printf("The area is %.2f.", calc1.getCalc());
    }
}
