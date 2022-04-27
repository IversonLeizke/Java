public class Juridica extends Pessoa {

    String razãoSocial, nomeFantasia, website, disciplinas;
    int inscriçãoMunicipal, inscriçãoEstadual, cnpj;

    public Juridica(String logradouro, String bairro, String cidade, String uF, String email, int número, int telefone,
            String razãoSocial, String nomeFantasia, String website, String disciplinas, int inscriçãoMunicipal,
            int inscriçãoEstadual, int cnpj) {
        super(logradouro, bairro, cidade, uF, email, número, telefone);
        this.razãoSocial = razãoSocial;
        this.nomeFantasia = nomeFantasia;
        this.website = website;
        this.disciplinas = disciplinas;
        this.inscriçãoMunicipal = inscriçãoMunicipal;
        this.inscriçãoEstadual = inscriçãoEstadual;
        this.cnpj = cnpj;
    }   
}
