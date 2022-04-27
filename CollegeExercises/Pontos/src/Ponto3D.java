public class Ponto3D  extends Ponto2D{
    protected double z = 0.0;

    public Ponto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double[] getXYZ() {
        return new double[] {x, y, z};
    }

    public void setXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
