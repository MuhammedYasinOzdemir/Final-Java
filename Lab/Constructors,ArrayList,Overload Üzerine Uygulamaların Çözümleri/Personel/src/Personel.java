public class Personel {

private String ad;
private String soyad;
private int CalismaYili;
private int maas;

    Personel() {
        System.out.println("Perosnel bilgisi girilmedi");
        this.ad = "Belirtilmemiş";
        this.soyad = "Belirtilmemiş";
        this.CalismaYili = 0;
        this.maas = 0;
    }


    Personel(String ad, String soyad, int CalismaYili, int maas){
        this.ad = ad;
        this.soyad = soyad;
        this.CalismaYili = CalismaYili;
        this.maas = maas;

    }

    public int getCalismaYili() {
        return CalismaYili;
    }

    public int getMaas(){
        return maas;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setCalismaYili(int calismaYili) {
        CalismaYili = calismaYili;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
}

