package Generic;

public class Ogrenci {
    private String isim;
    private String soyad;

    @Override
    public String toString() {
        return "Isim :"+isim+"\nSoyad:"+soyad;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Ogrenci(String isim, String soyad) {

        this.isim = isim;
        this.soyad = soyad;
    }
}
