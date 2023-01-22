package Calisan;

import Calisan.Personel;

import java.util.ArrayList;

public class Firma {

    private String ad;
    private int kurulus_yili;
    private ArrayList<Personel> personelListesi;

    public Firma(String ad, int kurulus_yili) {
        this.ad = ad;
        this.kurulus_yili = kurulus_yili;
        this.personelListesi = new ArrayList<Personel>();

    }

    public void personelEkle(Personel personel) {
        this.personelListesi.add(personel);
    }

    public void personelBilgiListele() {
        for (int i = 0; i < this.personelListesi.size(); i++) {
            Personel personel = this.personelListesi.get(i);
            System.out.println(personel.getAd() + " " + personel.getSoyad());
            System.out.println(personel.getMaas());
            System.out.println("------------------------");
        }
    }

    // Get - Set Metotları
    //--------------------
    public String getAd() {
        return ad;
    }

    public int getKurulus_yili() {
        return kurulus_yili;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setKurulus_yili(int kurulus_yili) {
        this.kurulus_yili = kurulus_yili;
    }

    public ArrayList<Personel> getPersonelListesi() {
        return personelListesi;
    }
}

