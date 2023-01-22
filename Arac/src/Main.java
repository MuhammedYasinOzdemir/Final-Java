import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Arac> araclar=new ArrayList<>();
        Bayi Ozdemir_oto=new Bayi("Özdemir Otomotiv",2012,3,araclar);
        String menu= """
                1-Aracları goster
                2-Arac ekle
                3-Arac sil
                4-Kullanıcıları goster
                5-Kullanıcı ekle
                6-Kullancı sil
                7-q Çıkış
                
        secim:""";

        Scanner scn=new Scanner(System.in);
        while (true){
            System.out.print(menu);
            String secim=scn.nextLine();
            if (secim.equals("1")){
                Ozdemir_oto.araclari_goster();}

            else if (secim.equals("2")) {
                System.out.print("Marka:");
                String marka=scn.nextLine();
                System.out.print("Model:");
                String model=scn.nextLine();
                System.out.print("Maliyet:");
                double maliyet= scn.nextDouble();
                System.out.println("Uretim yılı:");
                int uretim_yil= scn.nextInt();
                System.out.println("Kullanıcı Bilgileri");
                Ozdemir_oto.Kullanici_goster();
                System.out.println("İndex giriniz:");
                int index= scn.nextInt();
                while (true) {
                    System.out.print("secim:");
                    String sec = scn.nextLine();
                    if (sec.equals("1")) {
                        int silindir_hacmi = scn.nextInt();
                        Arac arac = new Otomobil(marka, model, maliyet, uretim_yil, Ozdemir_oto.getKullanicilar().get(index), silindir_hacmi);
                        Ozdemir_oto.Arac_ekle(arac);
                        break;
                    }
                else if (sec.equals("2")) {
                    double toplam_agirlik= scn.nextDouble();
                    Arac arac=new Kamyon(marka,model,maliyet,uretim_yil,Ozdemir_oto.getKullanicilar().get(index),toplam_agirlik);
                    Ozdemir_oto.Arac_ekle(arac);
                        break;
                }
                else
                    System.out.println("Hatalı kodlama");
                }


            } else if (secim.equals("3")) {
                Ozdemir_oto.arac_sil();
            } else if (secim.equals("q")) {
                break;
            } else if (secim.equals("4")) {
               Ozdemir_oto.Kullanici_goster();

            } else if (secim.equals("5")) {
                Ozdemir_oto.Kullanici_ekle();

            } else if (secim.equals("6")) {
                Ozdemir_oto.Kullanici_sil();
            } else
                System.out.println("Hatalı kodlama...");

        }
    }
}