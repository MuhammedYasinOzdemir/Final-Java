public class Arac {
    private String marka;
    private String model;
    private double maliyet;
    private int uretim_yili;
    Kullanici kullanici;

    public Arac(String marka,String model,double maliyet,int uretim_yili,Kullanici kullanici){
        this.kullanici=kullanici;
        this.maliyet=maliyet;
        this.marka=marka;
        this.model=model;
        this.uretim_yili=uretim_yili;
    }
    public double arac_fiyat_hesapla(){
        double fiyat=maliyet+(maliyet/(2022-uretim_yili));
        return fiyat;
    }
    public void arac_bilgileri_goster(){
        System.out.println("Marka:"+marka);
        System.out.println("Model:"+model);
        System.out.println("Uretim Yılı:"+uretim_yili);
        System.out.println("Maliyet:"+maliyet);
        System.out.println("Sahibi:"+kullanici);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getMaliyet() {
        return maliyet;
    }

    public String getMarka() {
        return marka;
    }

    public int getUretim_yili() {
        return uretim_yili;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public void setMaliyet(double maliyet) {
        this.maliyet = maliyet;
    }

    public void setUretim_yili(int uretim_yili) {
        this.uretim_yili = uretim_yili;
    }
}
