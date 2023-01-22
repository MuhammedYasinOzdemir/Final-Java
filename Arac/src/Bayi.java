import java.util.ArrayList;
import java.util.Scanner;

public class Bayi {
    private String ad;
    private int kurulus_yili;
    private int arac_sayisi;
    private ArrayList<Arac> araclar=new ArrayList<Arac>();
    Scanner scn=new Scanner(System.in);
    ArrayList<Kullanici> kullanicilar=new ArrayList<>();
    public Bayi(String ad,int kurulus_yili,int arac_sayisi,ArrayList <Arac>araclar){
        this.ad=ad;
        this.kurulus_yili=kurulus_yili;
        this.arac_sayisi=arac_sayisi;
        this.araclar=araclar;
    }
    public void Arac_ekle(Arac arac){
        araclar.add(arac);
        arac_sayisi++;
        System.out.println("Arac eklendi...");
    }
    public void araclari_goster(){
        for(int i=0;i<araclar.size();i++) {
            System.out.println(i+".Arac\n");
            araclar.get(i).arac_bilgileri_goster();
        }
    }
    public void arac_sil(){
        araclari_goster();

        System.out.print("Silmek istediğiniz indisi giriniz");
        int index= scn.nextInt();
        araclar.remove(index);
        System.out.println("Arac silindi...");
    }
    public void Kullanici_ekle(){

        String ad= scn.nextLine();
        String soyad=scn.nextLine();
        ArrayList<Arac> satinalaınan=new ArrayList<>();
        kullanicilar.add(new Kullanici(ad,soyad,0,satinalaınan));
    }
    public void Kullanici_goster(){
        for(int i=0;i<kullanicilar.size();i++) {
            System.out.println((i + 1) + ".\n\n"+kullanicilar.get(i).bilgileri_goster());
            System.out.println("Satın Alınanlar:");
            for(int j=0;j<kullanicilar.get(i).getSatin_alınanlar().size();j++)
                System.out.println((j+1)+"-");
             kullanicilar.get(i).getSatin_alınanlar().get(i).arac_bilgileri_goster();
        }
    }
    public void Kullanici_sil(){
        Kullanici_goster();
        int index= scn.nextInt();
        kullanicilar.remove(index);
        System.out.println("Kullanici silindi...");
    }

    public void setArac_sayisi(int arac_sayisi) {
        this.arac_sayisi = arac_sayisi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public ArrayList<Arac> getAraclar() {
        return araclar;
    }

    public int getArac_sayisi() {
        return arac_sayisi;
    }

    public int getKurulus_yili() {
        return kurulus_yili;
    }

    public ArrayList<Kullanici> getKullanicilar() {
        return kullanicilar;
    }

    public void setAraclar(ArrayList<Arac> araclar) {
        this.araclar = araclar;
    }

    public void setKurulus_yili(int kurulus_yili) {
        this.kurulus_yili = kurulus_yili;
    }
}
