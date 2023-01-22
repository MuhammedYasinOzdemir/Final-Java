package Atm;

import java.util.Scanner;

public class Atm {
    public void calıs(Hesap hesap){
        Login login=new Login();
        Scanner scn=new Scanner(System.in);
        System.out.println("************ YapıKredi **************\n");
        int hak=5;
        while (true){
            if (login.login(hesap)){
                System.out.println("Hoşgeldiniz...");
                break;
            }
            else
            {
                System.out.println("Yanlış kullanıcı adı veya paralo");
                hak--;
            }
            if (hak==0)
                return;//methodun sonlanmasına yarar.
        }
        String islemler= """
                1-Bakiye goruntule
                2-Para çek
                3-Para Yatır
                4-q çıkış
        
        secim:""";
        while (true){
            System.out.print(islemler);
            String secim=scn.nextLine();
            if (secim.equals("1")){
                System.out.println("Bakiye:"+hesap.getBakiye());}
            else if(secim.equals("2")){
                System.out.print("Miktar giriniz:");
                double miktar=scn.nextDouble();
                hesap.Para_cek(miktar);
            }
            else if(secim.equals("3")){
                System.out.print("Miktar giriniz:");
                double miktar=scn.nextDouble();
                hesap.para_yatır(miktar);
            }
            else if (secim.equals("q")){
                break;}
            else{
                System.out.println("Hatalı kodlama...");}
        }


    }
}
