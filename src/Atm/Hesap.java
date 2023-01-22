package Atm;

public class Hesap {
    private String kullaniciadi;
    private  String paralo;
    private double bakiye;

    public Hesap(String kullaniciadi,String paralo,double bakiye){
        this.bakiye=bakiye;
        this.kullaniciadi=kullaniciadi;
        this.paralo=paralo;
    }
    public void para_yatır(double miktar){
        bakiye+=miktar;
        System.out.println("Para yatırıldı...");
    }
    public void Para_cek(double miktar){
        if (bakiye-miktar<0)
        {
            System.out.println("Yetersiz bakiye");
        }
        else {
            bakiye-=miktar;
            System.out.println("Para çekilidi");
        }
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public String getParalo() {
        return paralo;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public void setParalo(String paralo) {
        this.paralo = paralo;
    }
}
