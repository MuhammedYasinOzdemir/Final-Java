public class Otomobil extends Arac{
    private int silindir_hacmi;

    public Otomobil(String marka,String model,double maliyet,int uretim_yili,Kullanici kullanici,int silindir_hacmi) {
        super(marka,model,maliyet,uretim_yili,kullanici);
        this.silindir_hacmi = silindir_hacmi;
    }
    public double arac_fiyat_hesapla(){
        double fiyat=super.arac_fiyat_hesapla();
        fiyat+=fiyat/5;
        return fiyat;
    }
    public void arac_bilgileri_goster(){
        super.arac_bilgileri_goster();
        System.out.println("Silindir Hacmi:"+silindir_hacmi);
    }

}
