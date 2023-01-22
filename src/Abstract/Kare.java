package Abstract;

public class Kare extends Sekil{
    private double kenar;
    public Kare(String isim,double kenar) {
        super(isim);
        this.kenar=kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public void alan_hesapla() {//implemnets edildi mecbur kullanımalı
        System.out.println(getIsim()+" alanı : "+(kenar*kenar));
    }
    public void cevreHesapla(){
        System.out.println(getIsim()+" cevre "+(4*kenar));
    }
}
