package Hata_Yakalama;

import java.util.Scanner;

public class Kendi_Expetion {
    public static void kontrol(int yas){
        if (yas<18)
            throw new InvalidExpetion("Invalid age hatası");//kendi olusturduğumuz expetion hangi expetion türünden türediyse onun gibi davaranır
        //chec expetiondan tanımladıkmı yakalamdan çalıştırmaz
        else
            System.out.println("Mekana hosgeldiniz");
    }
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        System.out.print("Yas:");
        int yas=scn.nextInt();
        try {//kendi hatamızı fırlatıp yakaladık
            kontrol(yas);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
