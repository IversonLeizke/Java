public class Fisica extends Pessoa{

    String nome, titulação, disciplinas;
    int cpf, rg, idade;

    public Fisica(String logradouro, String bairro, String cidade, String uF, String email, int número, int telefone,
            String nome, String titulação, String disciplinas, int cpf, int rg, int idade) {
        super(logradouro, bairro, cidade, uF, email, número, telefone);
        this.nome = nome;
        this.titulação = titulação;
        this.disciplinas = disciplinas;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }
    
}
