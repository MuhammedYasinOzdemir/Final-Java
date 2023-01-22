package Soru2_171421005;

public class Goruntu extends Veri implements Kucultulebilir{
    //Muhammed Yasin Özdemir
    //171421005
    private double kisakenar;
    private double uzunkenar;
    private String renk;

    public Goruntu(String tur,  double kisakenar, double uzunkenar, String renk) {
        super(tur);
        this.kisakenar = kisakenar;
        this.uzunkenar = uzunkenar;
        this.renk = renk;
    }

    @Override
    public double boyutAzalt() {
        this.setBoyut(getBoyut()-(getBoyut()/4));
        return getBoyut();
    }

    public void goster(){
        System.out.println("\nUzun kenar:"+getUzunkenar());
        System.out.println("Kısa kenar:"+getKisakenar());
        System.out.println("Renk:"+getRenk());
        System.out.println("Boyut"+getBoyut()+"\n");
    }

    @Override
    double boyutHesapla() {
        double alan=getKisakenar()*getUzunkenar();
        double cevre=(2*(getUzunkenar()+getUzunkenar()));
        this.setBoyut(alan*cevre*10);
        return getBoyut();
    }

    public double getKisakenar() {
        return kisakenar;
    }

    public void setKisakenar(double kisakenar) {
        this.kisakenar = kisakenar;
    }

    public double getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(double uzunkenar) {
        this.uzunkenar = uzunkenar;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
