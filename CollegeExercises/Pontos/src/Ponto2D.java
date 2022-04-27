
public class Ponto2D {

    protected double x = 0.0;
    protected double y = 0.0;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public final double getX() {
        return x;
    }
    public final void setX(double x) {
        this.x = x;
    }
    public final double getY() {
        return y;
    }
    public final void setY(double y) {
        this.y = y;
    }
    public double[] getXY() {
        return new double[] {x, y};
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
        
}