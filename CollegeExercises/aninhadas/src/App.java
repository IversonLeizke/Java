public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("%f + %f = %f%n", 15., 10., Calcular.somar.operacao(15, 10));
        System.out.printf("%f - %f = %f%n", 15., 10., Calcular.aubtrair.operacao(15, 10));
        System.out.printf("%f / %f = %f%n", 15., 10., Calcular.dividir.operacao(20, 10));
        System.out.printf("%f * %f = %f%n", 15., 10., Calcular.multiplicar.operacao(15, 10));
    }
}
