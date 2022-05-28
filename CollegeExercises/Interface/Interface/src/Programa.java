import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Programa implements Constantes {

    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.executar();
    }

    public void executar() {
        String opcao = solicitarOpcaoDoUsuario();
        String conceito = avaliarConceito(opcao);
        apresentar(opcao, conceito);
    }

    private String solicitarOpcaoDoUsuario() {
        Component componentePai = null;
        Object mensagem = "Selecione o conceito do aluno";
        String titulo = "Entrada de dados";
        int tipoMensagem = JOptionPane.QUESTION_MESSAGE;
        Icon icone = null;
        Object[] valoresSelecionaveis = new String[] { "A", "B", "C" };
        Object valorInicialSelecionado = "A";
        String opcao = (String) JOptionPane.showInputDialog(componentePai, mensagem, titulo, tipoMensagem, icone, valoresSelecionaveis, valorInicialSelecionado);
        return opcao;
    }

    private String avaliarConceito(String opcao) {
        switch (opcao) {
            case "A":
                return A; // retorna a constante A
            case "B":
                return B; // retorna a constante B
            case "C":
            default:
                return C; // retorna a constante C
        }
    }

    private void apresentar(String opcao, String conceito) {
        Component componentePai = null;
        Object mensagem = "O conceito do aluno é: " + opcao + "\n" + conceito;
        String titulo = "Resultado";
        int tipoMensagem = JOptionPane.INFORMATION_MESSAGE;
        JOptionPane.showMessageDialog(componentePai, mensagem, titulo, tipoMensagem);
    }
}