public class Pessoa {
    int id;
    String nome;
    String logradouro;
    int numero;
    int cep;
    String bairro;
    String cidade;
    String uf;
    long cpfnj;

    public Pessoa(int id, String nome, String logradouro, int numero, int cep, String bairro, String cidade, String uf,
            long cpfnj) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cpfnj = cpfnj;
    }

}