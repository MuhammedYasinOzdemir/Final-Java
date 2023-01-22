package AlanHesaplayici;

public class Daire extends Sekil{
    private double r;
    public Daire(String isim,double r) {
        super(isim);
        this.r=r;
    }

    @Override
    double AlanHesapla() {
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "Daire Alanı :"+Math.PI*r*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
