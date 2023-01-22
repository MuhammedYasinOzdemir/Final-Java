public class mudur extends calisan implements zamIslem,evrakIptal{

    public mudur(long tcNo, String ad, String soyAd, String dogumTarihi, double maas) {
        super(tcNo, ad, soyAd, dogumTarihi, maas);
    }

    public void maasArttir(gorevli gorev) {
        gorev.setMaas((gorev.getMaas()/100)*150);
    }

    public void maasAzalt(gorevli gorev) {
        gorev.setMaas((gorev.getMaas()/100)*50);
    }

    @Override
    public void evrakIptalEt(evrak belge) {
        if (belge.isGecerlilik()){
            belge.setGecerlilik(false);
            System.out.println("Belge Artık Geçerli Değildir");
        }
        else{
            System.out.println("Belge Zaten Geçerli Değildir");
        }
    }

    @Override
    public String toString() {
        return "\nTC NO: " + getTcNo() + "\nAd: " + getAd() +"\nSoyad: "+ getSoyAd() + "\nDoğum Tarihi: "+getDogumTarihi()
                + "Maaş: " + getMaas();
    }
}
