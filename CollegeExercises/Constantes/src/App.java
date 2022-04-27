import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Por favor insira o valor de custo do produto: ");
        double valor = Markup.calcMarkup(input.nextDouble());
        System.out.printf("O preço de venda do produto é de R$ %.2f.", valor);

}
}
