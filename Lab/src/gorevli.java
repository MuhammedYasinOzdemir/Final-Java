import java.time.LocalDate;
import java.util.ArrayList;
public class gorevli extends calisan {
    private String isGirisTarihi;
    private String isCikisTarihi;
    private boolean calismaDurumu;
    private ArrayList<evrak> imzalanan;

    public gorevli(long tcNo, String ad, String soyAd, String dogumTarihi, double maas) {
        super(tcNo, ad, soyAd, dogumTarihi, maas);
        this.isGirisTarihi = String.valueOf(LocalDate.now());
        this.calismaDurumu = true;
    }
    @Override
    public String toString() {
        return "\nTC NO: " + getTcNo() + "\nAd: " + getAd() +"\nSoyad: "+ getSoyAd() + "\nDoğum Tarihi: "+getDogumTarihi()
                + "\nMaaş: " + getMaas();
    }
}
