package Kalitim.Hayvan;

public class Kopek extends Hayvan {
    private int dis_sayisi;
    public Kopek(String isim, double kilo, double boy, int bacak_sayisi,int dis_sayisi) {
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi=dis_sayisi;
    }

    @Override
    public void harekete_gec(int hiz) {
        System.out.println("Kopek " +hiz +" da hareket ediyor");
    }

    public void kos(int hiz){
        System.out.println("Kopek kosuyor");
        super.harekete_gec(hiz);//superle method cagirdik extend ettiğimiz
    }

    public void kos2(int hiz){
        System.out.println("Kopek kosuyor");
        harekete_gec(hiz);//overiding ettiğimiz bu daha sağlıklı
    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
}
