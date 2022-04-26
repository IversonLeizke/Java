public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa1 = new Pessoa(5555, "Iverson", "Rua XV de nov", 650, 89270000, "Centro", "Guaramirim", "SC", 55555555);

        Colaborador colaborador1 = new Colaborador(999999, "João", "Rua 28 de agosto", 690, 89270000, "Centro", "Guaramirim", "SC", 6666666, "Aux. Adm");

        System.out.println(pessoa1.nome);
        System.out.println((colaborador1.nome + " " + colaborador1.cargo));
    }
}
