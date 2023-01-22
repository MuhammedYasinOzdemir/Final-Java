package FİnalSorular;

public class Manhattan extends Distance{
    public Manhattan(int x1, int x2, int y1, int y2) {
        super(x1, x2, y1, y2);
    }

    @Override
    public double MesafeHesapla() {
        return Math.abs(getX1()-getX2())+Math.abs(getY1()-getY2());
    }
}
