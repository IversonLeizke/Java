public class Fornecedores extends Pessoa{
    String fantasia;
    String website;
    
    public Fornecedores(int id, String nome, String logradouro, int numero, int cep, String bairro, String cidade,
            String uf, long cpfnj, String fantasia, String website) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, cpfnj);
        this.fantasia = fantasia;
        this.website = website;
    }

    
}
