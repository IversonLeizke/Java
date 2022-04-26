public class Colaborador extends Pessoa {
    String cargo;

    public Colaborador(int id, String nome, String logradouro, int numero, int cep, String bairro, String cidade,
            String uf, long cpfnj, String cargo) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, cpfnj);
        this.cargo = cargo;
    }

    
}
