package AlanHesaplayici;

public class Ucgen extends Sekil{
    private double h;
    private double k;
    public Ucgen(String isim,double h,double k) {
        super(isim);
        this.h=h;
        this.k=k;
    }

    @Override
    double AlanHesapla() {
        return h*k/2;
    }

    @Override
    public String toString() {
        return "Ucgen Alanı :"+h*k/2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
