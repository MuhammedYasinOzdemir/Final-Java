package Soru2_171421005;
public class Harf extends Metin{
    //Muhammed Yasin Özdemir
    //171421005
    private static int boyut=1;
    public Harf(String tip,String deger) {
        this.setTip(tip);
        this.setDeger(deger);
        boyut++;
    }

    public static double getBoyut() {
        return (int) boyut;
    }

    @Override
    double boyutHesapla() {
        return 1;
    }

    @Override
    public void sil() {
        setTip("");
        setDeger("");
    }

    public static void setBoyut(int boyut) {
        Harf.boyut = boyut;
    }

}
