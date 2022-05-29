public class CirculoMovel implements PontoMovel{
    int raio, x, y, velX, velY;

    public CirculoMovel(int raio, int x, int y, int velX, int velY) {
        this.raio = raio;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    @Override
    public void moverParaCima() {
        this.x += velX;
        
    }

    @Override
    public void moverParaBaixo() {
        this.x -= velX;
        
    }

    @Override
    public void moverParaEsquerda() {
        this.y += velY;
    }

    @Override
    public void moverParaDireita() {
        this.y -= velY;
    }

    @Override
    public void position() {
        System.out.printf("The figure position is X: %d and Y: %d%n", x, y);
    }

}
