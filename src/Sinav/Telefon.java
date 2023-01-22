package Sinav;

abstract class Telefon {
    private String marka;
    private String model;
    private int ram;
    private double hafiza;
    private double kamera;

    public Telefon(String marka,String model ,int ram,double hafiza,double kamera){
        this.hafiza=hafiza;
        this.marka=marka;
        this.ram=ram;
        this.model=model;
        this.kamera=kamera;
    }
    public Telefon(){
        this("Bilgi yok","Bilgi yok",0,0,0);
    }
    public void bilgileriGoster(){
        System.out.println("Marka:"+marka);
        System.out.println("Model:"+model);
        System.out.println("Ram:"+ram);
        System.out.println("Hafıza:"+hafiza);
        System.out.println("Kamera:"+kamera);
    }
    abstract void isletimSistemiYukle();

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getHafiza() {
        return hafiza;
    }

    public void setHafiza(double hafiza) {
        this.hafiza = hafiza;
    }

    public double getKamera() {
        return kamera;
    }

    public void setKamera(double kamera) {
        this.kamera = kamera;
    }
}
