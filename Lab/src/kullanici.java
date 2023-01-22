import java.time.LocalDate;
import java.util.ArrayList;

public class kullanici {
    private long tcNo;
    private String ad;
    private String soyAd;
    private String dogumTarihi;
    private String uyelikTarihi;
    private ArrayList<evrak> belgeler;

    public void belgeEkle(evrak belge){
        belgeler.add(belge);
        System.out.println("Belge Eklendi !");
    }

    public kullanici(long tcNo, String ad, String soyAd, String dogumTarihi) {
        this.tcNo = tcNo;
        this.ad = ad;
        this.soyAd = soyAd;
        this.dogumTarihi = dogumTarihi;
        this.uyelikTarihi = String.valueOf(LocalDate.now());
    }
    public void belgeleriGoruntule(){
        for (int i =0;i< belgeler.size();i++){
            System.out.println("\nSeri No: "+belgeler.get(i).getSeriNo()+"\nBelge Türü: "+belgeler.get(i).getTur()+
                    "\nBelge Tarihi: " +belgeler.get(i).getTarih()+"\nDoğrulama kodu: "+belgeler.get(i).getDogrulamaKod()
            +"\nİmzalayan: "+belgeler.get(i).getImzalayan().getAd()+" "+belgeler.get(i).getImzalayan().getSoyAd());
            if (belgeler.get(i).isGecerlilik()){
                System.out.println("\nBelge Geçerlidir");
            }
            else{
                System.out.println("\nBelge Geçerli Değildir");
            }
        }
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
    public String getUyelikTarihi() {
        return uyelikTarihi;
    }

    public void setUyelikTarihi(String uyelikTarihi) {
        this.uyelikTarihi = uyelikTarihi;
    }

    public ArrayList<evrak> getBelgeler() {
        return belgeler;
    }

    public void setBelgeler(ArrayList<evrak> belgeler) {
        this.belgeler = belgeler;
    }
    public String toString() {
        return "\nTC NO: "+getTcNo()+"\nAd: " +getAd()+"\nSoyad: "+getSoyAd()+"\nDoğum Tarihi: "+
                getDogumTarihi()+"\nÜyelik Tarihi: " + getUyelikTarihi();
    }
}
