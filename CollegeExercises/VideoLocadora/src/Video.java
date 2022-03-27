import java.util.*;

/**
 * Modelo de um Video para o cenario da VideoLocadora
 *
 * @author Rodrigo Gregori
 * @version 1.0
 */
public class Video {

    private String titulo;
    private Boolean alugado = false;
    private double notaMedia;
    private int somaDasNotas = 0;
    private ArrayList<Integer> notas= new ArrayList<Integer>();
    private int contagemDasNotas = 0;

    /**
     * Insere novo titulo.
     *
     * @param novoTitulo novo titulo a ser inserido
     */
    public void setTitulo(String novoTitulo) {
        titulo = novoTitulo;
    }

    /**
     * Retorna o titulo.
     * @return o titulo do Video
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Adiciona uma nota.
     *
     * @param nota A nota do usuario para este video.
     */
    public void adicionaNota(int nota) {
        /* TODO: modifique este metodo para que as notas mais alta e mais baixa
	 * sejam ignoradas se houver pelo menos quatro notas. 
         */
        notas.add(nota);
        contagemDasNotas = contagemDasNotas + 1;
        Collections.sort(notas);
        if (contagemDasNotas > 4) {
            contagemDasNotas -= 2;
            notas.remove(contagemDasNotas);
            notas.remove(0);
        }
        somaDasNotas = 0;
        for (int valor : notas) {
            somaDasNotas += valor;
        }
        notaMedia = ((double) somaDasNotas) / contagemDasNotas;
    }

    /**
     * Retorna uma nota.
     * @return a media das notas
     */
    public double getNota() {
        return notaMedia;
    }

    /**
     * Ajusta o video como alugado.
     */
    public void alugar() {
        alugado = true;
    }

    /**
     * Desmarca o video como alugado.
     */
    public void devolverALoja() {
        alugado = false;
    }

    /**
     * Obtem o valor de alugado.
     * @return o valor da flag alugado
     */
    public Boolean isAlugado() {
        return alugado;
    }
}
