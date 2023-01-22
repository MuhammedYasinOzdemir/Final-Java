package Sarkicilar;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        Sarkicilar sarkicilar=new Sarkicilar();
        String islemler= """
                0. Çıkış
                1. Sarkiları Goruntule
                2. Sarki Ekle
                3. Sarki Sil
                4.Sarki Guncelle
        secim:""";
        while (true){
            System.out.print(islemler);
            String sec=scn.nextLine();
            if(sec.equals("0"))
                break;
            else if (sec.equals("1")) {
                sarkicilar.Goster();
            } else if (sec.equals("2")) {
                sarkicilar.SarkiEkle();
            } else if (sec.equals("3")) {
                sarkicilar.SarkiSil();
            } else if (sec.equals("4")) {
                sarkicilar.SarkiGuncelle();
            }
            else{
                System.out.println("Hatali kodlama...");
            }
        }
    }
}
