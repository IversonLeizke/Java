public class Student {
    private String nome;
    private String endereço;
    private String telefone;
    private String email;
    private String matricula;
    
    public Student(String nome, String endereço, String telefone, String email, String matricula) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }

    public void displayStudent() {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Endereço: %s%n", endereço);
        System.out.printf("Telefone: %s%n", telefone);
        System.out.printf("Email: %s%n", email);
        System.out.printf("Matricula: %s%n", matricula);
    }
}

