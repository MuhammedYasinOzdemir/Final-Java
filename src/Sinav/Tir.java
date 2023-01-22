package Sinav;

public class Tir extends absart{

    public Tir(String marka, int teker, double agirlik) {
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
        System.out.println("Tır gidiyor");
    }
}
