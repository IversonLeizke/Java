abstract class Forma {
    String cor;
    Boolean preenchido;
    
    public Forma(String cor, Boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public abstract String getCor();

    public abstract void setCor(String cor);

    public abstract Boolean getPreenchido();

    public abstract void setPreenchido(Boolean preenchido);

    

}
