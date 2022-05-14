public class Retangulo extends Forma{
    double altura, largura;
    
    public Retangulo() {
        this.cor = "Vermelho";
        this.preenchido = true;
        this.altura = 1;
        this.largura = 1;
    }

    public Retangulo(double altura, double largura) {
        this.cor = "Vermelho";
        this.preenchido = true;
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo(double altura, double largura, String cor, Boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
        this.altura = altura;
        this.largura = largura;
    }
    
    public double getArea() {
        return this.altura * this.largura;
    }
    
}
