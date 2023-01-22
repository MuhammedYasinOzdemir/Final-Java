import java.time.LocalDate;
import java.util.Random;

public class evrak {
    static private int no =0;
    private int seriNo;
    private int dogrulamaKod;
    private String tarih;
    private String tur;
    private gorevli imzalayan;
    private kullanici olusturan;
    private boolean gecerlilik;
    Random rnd = new Random();
    public evrak(int tur, kullanici olusturan) {
        this.dogrulamaKod= rnd.nextInt(10000);
        this.tarih = String.valueOf(LocalDate.now());
        this.seriNo =no++;
        if (tur ==1)
            this.tur ="İkametgah";
        else if (tur==2)
            this.tur = "Ceza";
        else if (tur==3)
            this.tur = "Nüfus";
        else if (tur==4)
            this.tur = "Tapu";
        else if (tur==5)
            this.tur = "Taşıt";
        else if (tur==6)
            this.tur = "Gelir";
        this.olusturan = olusturan;
        this.gecerlilik = true;
    }

    @Override
    public String toString() {
        String tmp = "\nSeri Numarası = " + seriNo +
                "\nDoğrulama Kodu = " + dogrulamaKod +
                "\nTarih = " + tarih  +
                "\nTür = " + tur  +
                "\nOluşturan TC NO = " + olusturan.getTcNo();
        if (gecerlilik)
            tmp += "\nGeçerlilik = Belge Geçerlidir";
        else
            tmp += "\nGeçerlilik = Belge Geçerli Değildir";
        if (imzalayan==null)
            tmp+="\nİmzalayan = Yok";
        else
            tmp+="\nİmzalayan ="+imzalayan.getAd()+" "+imzalayan.getSoyAd();
        return tmp;
    }

    public int getSeriNo() {
        return seriNo;
    }

    public void setSeriNo(int seriNo) {
        this.seriNo = seriNo;
    }

    public int getDogrulamaKod() {
        return dogrulamaKod;
    }

    public void setDogrulamaKod(int dogrulamaKod) {
        this.dogrulamaKod = dogrulamaKod;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public gorevli getImzalayan() {
        return imzalayan;
    }

    public void setImzalayan(gorevli imzalayan) {
        this.imzalayan = imzalayan;
    }

    public kullanici getOlusturan() {
        return olusturan;
    }

    public void setOlusturan(kullanici olusturan) {
        this.olusturan = olusturan;
    }
    public boolean isGecerlilik() {
        return gecerlilik;
    }

    public void setGecerlilik(boolean gecerlilik) {
        this.gecerlilik = gecerlilik;
    }
}
