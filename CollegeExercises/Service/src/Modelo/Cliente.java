package Modelo;

public class Cliente {

    private String cpf;
    private String nome;
    private String endereço;
    private String email;
    private String telefone;

    public Cliente(String string, String nome, String endereço, String email, String telefone) {
        this.cpf = string;
        this.nome = nome;
        this.endereço = endereço;
        this.email = email;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void showCustomer() {
        System.out.printf("Nome: %s,%nCPF: %s,%nEndereço: %s,%nE-mail: %s,%nTelefone: %s,%n", nome, cpf, endereço, email, telefone);
    }
}