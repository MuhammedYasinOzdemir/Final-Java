public class Kamyon extends Arac{
    private double toplam_agirlik;

    public Kamyon(String marka, String model, double maliyet, int uretim_yili, Kullanici kullanici,double toplam_agirlik) {
        super(marka, model, maliyet, uretim_yili, kullanici);
        this.toplam_agirlik=toplam_agirlik;
    }
    public double arac_fiyat_hesapla(){
        double fiyat=super.arac_fiyat_hesapla();
        fiyat+=fiyat/3;
        return fiyat;
    }
    public void arac_bilgileri_goster(){
        super.arac_bilgileri_goster();
        System.out.println("Toplam agırlık::"+toplam_agirlik);
    }

}
