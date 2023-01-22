package Sinav;

public class Otomobil extends absart{
    public Otomobil(String marka, int teker, double agirlik) {
        super(marka, teker, agirlik);
    }

    @Override
    void bilgileriGoster() {
        System.out.println("Marka:"+getMarka());
        System.out.println("Teker:"+getTeker());
        System.out.println("Agirlik:"+getAgirlik());
    }

    @Override
    void sur() {
        System.out.println("Araba gidiyor...");
    }
}
