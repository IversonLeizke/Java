public class App {
    public static void main(String[] args) throws Exception {
        
        CirculoMovel novoCirculo = new CirculoMovel(5, 2, 3, 2, 1);

        novoCirculo.moverParaCima();
        novoCirculo.moverParaDireita();

        novoCirculo.position();
    }
}
