package Kalitim.Hayvan;

public class Hayvan {
    private String isim;
    private double kilo;
    private double boy;
    private int bacak_sayisi;

    public Hayvan(String isim,double kilo,double boy,int bacak_sayisi){
        this.bacak_sayisi=bacak_sayisi;
        this.isim= isim;
        this.kilo=kilo;
        this.boy=boy;
    }
    public void yemek_ye(){
        System.out.println("Hayvan yemek yiyor");
    }
    public void harekete_gec(int hiz)
    {
        System.out.println("Hayvan " +hiz +" ile hareket ediyor.");
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }

    public String getIsim() {
        return isim;
    }

    public double getKilo() {
        return kilo;
    }

    public double getBoy() {
        return boy;
    }

    public int getBacak_sayisi() {
        return bacak_sayisi;
    }
}
