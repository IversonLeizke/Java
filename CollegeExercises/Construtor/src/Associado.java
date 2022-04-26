public class Associado extends Pessoa {
    String situacao;
    int cadastro;

    public Associado(int id, String nome, String logradouro, int numero, int cep, String bairro, String cidade,
            String uf, long cpfnj, String situacao, int cadastro) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, cpfnj);
        this.situacao = situacao;
        this.cadastro = cadastro;
    }

}
