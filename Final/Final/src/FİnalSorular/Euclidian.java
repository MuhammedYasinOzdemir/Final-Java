package FİnalSorular;

public class Euclidian extends Distance{
    public Euclidian(int x1, int x2, int y1, int y2) {
        super(x1, x2, y1, y2);
    }

    @Override
    public double MesafeHesapla() {
        return Math.sqrt(Math.pow((getX2()+getX1()),2)-Math.pow((getY2()-getY1()),2));//dikkat miras edilen sınıftan get metodu kullan
    }
}
