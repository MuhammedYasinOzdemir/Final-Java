package Calisan;

public class Personel {
    private String ad,soyad;
    private int yas;
    private double maas;
    public Personel(String ad,String soyad,int yas,double maas){
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
        this.maas=maas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void zamIste() {
    }
}

