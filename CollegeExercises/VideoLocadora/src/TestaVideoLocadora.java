
/**
 * @author Rodrigo Gregori
 *
 */
public class TestaVideoLocadora {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Testa um Video.
        Video vid1 = new Video();
        vid1.setTitulo("O Poderoso Chefao");

        vid1.adicionaNota(3);
        vid1.adicionaNota(2);
        vid1.adicionaNota(5);
        vid1.getNota();

        System.out.printf("%s: %.2f\n", vid1.getTitulo(), vid1.getNota());

        vid1.alugar();
        getStatus(vid1);
        vid1.devolverALoja();
        getStatus(vid1);

        // Testa uma VideoLocadora.
        VideoLocadora vl = new VideoLocadora();

        vl.adicionarVideo("O Encouracado Potemkin");
        vl.adicionarVideo("O Poderoso Chefao");
        vl.adicionarVideo("Cidade dos Anjos");

        // Adiciona notas do usuario para 'O Encouracado Potemkin'.
        vl.avaliarVideo(0, 5);
        vl.avaliarVideo(0, 4);
        vl.avaliarVideo(0, 4);
        vl.avaliarVideo(0, 3);
        vl.avaliarVideo(0, 5);
        vl.avaliarVideo(0, 4);
        // vl.avaliarVideo(0, 4);
        // vl.avaliarVideo(0, 3);
        System.out.println(vl.getVideoPorIndice(3));

        vl.alugarVideo(0);
        vl.alugarVideo(2);

        System.out.println("A nota media para o video #0: "
                + vl.notaParaVideo(0));

        vl.listarInventario();
    }

    public static void getStatus(Video v) {
        String titulo = v.getTitulo();
        if (v.isAlugado()) {
            String s = String.format("'%s' esta alugado.", titulo);
            System.out.println(s);
        } else {
            String s = String.format("'%s' esta nas estantes.", titulo);
            System.out.println(s);

        }
    }

}
