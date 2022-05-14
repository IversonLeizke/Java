public class Quadrado extends Forma{
    double medida;
    
    public Quadrado() {
        this.cor = "Vermelho";
        this.preenchido = true;
        this.medida = 1;
    }

    public Quadrado(double medida) {
        this.cor = "Vermelho";
        this.preenchido = true;
        this.medida = medida;
    }
    
    public double getArea() {
        return this.medida * this.medida;
    }

}
