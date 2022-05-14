public class Circulo extends Forma{
    double raio;

    public Circulo() {
        this.cor = "Vermelho";
        this.preenchido = true;
        this.raio = 1;
    }

    public Circulo(double raio) {
        this.cor = "Vermelho";
        this.preenchido = true;
        this.raio = raio;
    }
    
    public double getArea() {
        return this.raio * 3.14159265359;
    }

}
