package Hata_Yakalama;

import java.util.Random;

public class YolcuMain {
    public static void main(String[] args) {
        Yolcu[] yolcular = new Yolcu[10];
        Random rnd = new Random();
        for (int i = 0; i < yolcular.length; i++) {
            yolcular[i]=new Yolcu(rnd.nextBoolean(),rnd.nextBoolean(),rnd.nextBoolean());
            /*yolcular[i].setVize(rnd.nextBoolean());
            yolcular[i].setBilet(rnd.nextBoolean());
            yolcular[i].setAdli_sicil(rnd.nextBoolean());*/
            System.out.println((i + 1) + " yolcu kaydı yapıldı.");
        }
        for (int i = 0; i < yolcular.length; i++) {
            try {
                yolcular[i].adliKontrol();
                yolcular[i].vizeKontrol();
                yolcular[i].biletKontrol();
                System.out.println((i+1) +" Yolcunun girişi onaylandı...");
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println((i+1)+" yolcu Kayıt edilemedi...");
            }
            finally {
                System.out.println();
                System.out.println((i+2)+" yolcuya gecildi...\n");
            }
        }
    }
}
