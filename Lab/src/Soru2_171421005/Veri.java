package Soru2_171421005;

public abstract class Veri {
    //Muhammed Yasin Özdemir
    //171421005
    private String tur;
    private static double boyut;
    abstract double boyutHesapla();
    abstract void goster();
    public Veri(String tur) {
        this.tur = tur;
    }

    public Veri() {
        this.boyut=0;
        this.tur="Bilinmiyor";
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public static double getBoyut() {
        return boyut;
    }

    public  void setBoyut(double boyut) {
        this.boyut = boyut;
    }
}
