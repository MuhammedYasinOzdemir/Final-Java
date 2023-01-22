package Sinav.Hayvan;

public class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public void konustur() {
        System.out.println("Kopek konusuyor");
    }

    public void kos(int hiz) {
        System.out.println("Kopek "+hiz +"da kosuyor");
    }
}
