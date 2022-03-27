
/**
 * Classe VideoLocadora.
 *
 * @author Rodrigo Gregori
 * @version 1.0
 */

public class VideoLocadora {

    Video[] catalogo = new Video[10];
    int contadorDeVideos;

    public void adicionarVideo(String titulo ){
        if (contadorDeVideos > 10) {
            System.out.println("Desculpe, as prateleiras estao cheias!");
        } else {
            catalogo[contadorDeVideos] = new Video();
            catalogo[contadorDeVideos].setTitulo(titulo);
            contadorDeVideos++;
        }
    }

    public void alugarVideo(int video) {
        catalogo[video].alugar();
    }

    public void devolverVideo(int video) {
        catalogo[video].devolverALoja();
    }

    public void avaliarVideo(int video, int nota) {
        catalogo[video].adicionaNota(nota);
    }

    public double notaParaVideo(int video) {
        return catalogo[video].getNota();
    }

    public int getVideoPorTitulo(String titulo) {
        for (int i = 0; i < contadorDeVideos; i++) {
            if (titulo.equals(catalogo[i].getTitulo())) {
                return i;
            }
        }
        return 0;
    }

    public String getVideoPorIndice(int indice) {
        if (catalogo[indice] == null) {
            return "Video #" + indice + " nao encontrado.";
        } else {
            return catalogo[indice].getTitulo();
        }
    }

    public void listarInventario() {
        for (int i = 0; i < contadorDeVideos; i++) {
            System.out.println(i + ": " + catalogo[i].getTitulo());
            System.out.println("\tNota:" + notaParaVideo(i));
            if (catalogo[i].isAlugado()) {
                System.out.println("\tAlugado: Sim");
            } else {
                System.out.println("	Alugado: Nao");
            }
        }
    }
}
