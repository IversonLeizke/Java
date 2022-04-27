abstract class Pessoa {
    String logradouro, bairro, cidade, UF, email;
    int número, telefone;

    public Pessoa(String logradouro, String bairro, String cidade, String uF, String email, int número, int telefone) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        UF = uF;
        this.email = email;
        this.número = número;
        this.telefone = telefone;
    }

}
