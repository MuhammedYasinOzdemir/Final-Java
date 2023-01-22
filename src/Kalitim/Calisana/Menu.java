package Kalitim.Calisana;

import java.util.Scanner;

public class Menu {
    private boolean durum=true;


    public void menu(){
        System.out.print("""
               1-Çalışanları göster
               2-Çalışan ekle
               3-Çalışan sil
               4-Çalışan bilgileri değiştir.
               5-Çalışana is yaptır.
               6-Çıkış
               
        secim:""");
    }
    public void sistem(){
        Scanner scn=new Scanner(System.in);
        Yonetici2 yonetici=new Yonetici2("Yasin",20000,"Mudur",10);

        while (durum){
            menu();
            String secim=scn.nextLine();

            if (secim.equals("1")){
                if(yonetici.getCalisanlar().size()!=0 ){
                    yonetici.calisanlari_goster();
                }
                else{
                    System.out.println("Çalısan yok...");
                }
            }
            else if (secim.equals("2")) {
                yonetici.calisan_ekle();
            } else if (secim.equals("3")) {
                if(yonetici.getCalisanlar().size()!=0 ){
                    yonetici.calisan_sil();
                }
                else{
                    System.out.println("Çalısan yok...");
                }
            } else if (secim.equals("4")) {
                   yonetici.calisan_bilgi_degistir();
            } else if (secim.equals("5")) {
                yonetici.is_ver();
            } else if (secim.equals("6")) {
                durum=false;
            }
            else{
                System.out.println("Hatalı kodlama...");
            }
        }
    }
}
