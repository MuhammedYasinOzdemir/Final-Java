public class Telefon {

    public String marka;
    public String model;
    public int ram;
    public int hafiza;
    public double kamera;

    public Telefon(String marka, String model, int ram, int hafiza, double kamera) {
        this.marka = marka;
        this.model = model;
        this.ram = ram;
        this.hafiza = hafiza;
        this.kamera=kamera;
    }

    public Telefon() {
        this.marka = "Tanımlanmadı";
        this.model = "Tanımlanmadı";
        this.ram = 0;
        this.hafiza = 0;
        this.kamera=0.0;
    }

    public void goster(){
        System.out.println("Telefon markası : "+this.marka);
        System.out.println("Telefon modeli : "+this.model);
        System.out.println("Telefon ram'i : "+this.ram);
        System.out.println("Telefon hafızası : "+this.hafiza);
        System.out.println("Telefon kamerası : "+this.kamera);

    }

}

