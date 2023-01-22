package Sinav;

public class TelefonMAin {
    static class Apple extends Telefon{
        public Apple(String marka, String model, int ram, double hafiza, double kamera) {
            super(marka, model, ram, hafiza, kamera);
        }

        @Override
        public void bilgileriGoster() {
            System.out.println("******* Apple *********");
            super.bilgileriGoster();
        }

        @Override
        void isletimSistemiYukle() {
            System.out.println("İos yukleniyor...");
        }


    }
    static class  Samsung extends Telefon{
        public Samsung(String marka, String model, int ram, double hafiza, double kamera) {
            super(marka, model, ram, hafiza, kamera);
        }

        @Override
        public void bilgileriGoster() {
            System.out.println("******** Samsung **********");
            super.bilgileriGoster();
        }

        @Override
        void isletimSistemiYukle() {
            System.out.println("ONE 5.0 yukeniyor");
        }
    }
    public static void main(String[] args){
        Telefon telefon=new Apple("Apple","14 pro",8,512,12);
        Telefon telefon1=new Samsung("Samsung","S22",12,512,48);
        telefon.bilgileriGoster();
        telefon1.bilgileriGoster();
    }
}
