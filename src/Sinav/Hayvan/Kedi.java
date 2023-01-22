package Sinav.Hayvan;

public class Kedi extends Hayvan{
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public void konustur() {
        System.out.println("Kedi konusuyr");
    }

    @Override
    public void kos() {
        System.out.println("kedi yatıyor...");
    }
}
