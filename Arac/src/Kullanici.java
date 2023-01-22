import java.util.ArrayList;

public class Kullanici {
    private String ad;
    private String soyad;
    private int arac_sayisi;
    private ArrayList<Arac> satin_alınanlar=new ArrayList<>();

    public Kullanici(String ad,String soyad,int arac_sayisi,ArrayList satin_alınanlar){
        this.ad=ad;
        this.soyad=soyad;
        this.arac_sayisi=arac_sayisi;
        this.satin_alınanlar=satin_alınanlar;
    }
    public String bilgileri_goster(){
        return "Ad:"+ad+"\nSoyad:"+soyad+"\nArac sayısı:"+arac_sayisi;
    }


    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getAd() {
        return ad;
    }

    public ArrayList<Arac> getSatin_alınanlar() {
        return satin_alınanlar;
    }

    public int getArac_sayisi() {
        return arac_sayisi;
    }

    public void setArac_sayisi(int arac_sayisi) {
        this.arac_sayisi = arac_sayisi;
    }

    public void setSatin_alınanlar(ArrayList<Arac> satin_alınanlar) {
        this.satin_alınanlar = satin_alınanlar;
    }

}
