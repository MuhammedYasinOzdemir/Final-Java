

public abstract class calisan {
    private long tcNo;
    private String ad;
    private String soyAd;
    private String dogumTarihi;
    private double maas;
    public calisan(long tcNo, String ad, String soyAd, String dogumTarihi, double maas) {
        this.tcNo = tcNo;
        this.ad = ad;
        this.soyAd = soyAd;
        this.dogumTarihi = dogumTarihi;
        this.maas = maas;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String toString() {
        return null;
    }
}
