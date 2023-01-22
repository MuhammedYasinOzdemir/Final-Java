package bp1_16_12_2021;

import java.util.ArrayList;
import java.util.List;

public class MusterilerTest {
    public static void main(String[] args) {
        List<Musteriler> list = new ArrayList<>(); // Musteriler tipindeki listemizi //olusturduk.
        Musteriler ms = new Musteriler(); // Musteriler sinifinda islem yapacagimiz icin //bu siniftan bir nesne olusturduk.
        String ad = "James"; // Listemize ekleyecegimiz kisinin adi.
        String soyad = "Gosling"; // Listemize ekleyecegimiz kisinin soyadi.
        int yas = 64; // Listemize ekleyecegimiz kisinin yasi
        
        ms.setMusteriAdi(ad); // Musteriler sinifindaki musteriAdi degiskenine ad //degiskenini verdik.
        ms.setMusteriSoyadi(soyad); // musteriSoyadi degiskenine soyad degiskenini verdik.
        ms.setMusteriYasi(yas); // musteriYasi degiskenine yas degiskenini verdik.
        list.add(ms); // Degerlerini tanimladigimiz degiskenlerin hepsini listemize //ekledik.
    
        for(Musteriler i : list){ // Listemizi geziyoruz. Fakat burada soyle bir durum //var; integer tipindeki listemizi int i ile gezmistik. Musteriler tipindeki //listemizi ise Musteriler i ile geziyoruz.
            System.out.println(i.getMusteriAdi()); // i. index'deki musteriAdi
            System.out.println(i.getMusteriSoyadi()); // i. index'deki musteriSoyadi
            System.out.println(i.getMusteriYasi()); // i. index'deki musteriYasi
        }  
   }
  
}
