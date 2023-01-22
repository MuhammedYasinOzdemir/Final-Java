package AlanHesaplayici;

public class Kare extends Sekil{
    private double a;
    private double b;
    public Kare(String isim,double a,double b) {
        super(isim);
        this.a=a;
        this.b=b;
    }

    @Override
    double AlanHesapla() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Kare Alanı :"+a*b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
