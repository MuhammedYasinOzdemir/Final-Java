package Hata_Yakalama;

import java.util.Scanner;

public class Throw {
    public static void kontrol(int yas){
        if (yas<18)
            throw new ArithmeticException("Mekana 18 yastan kucukler giremez.");//Hata fırlatır bu sekilde hata mesajıda yazabiliriz
        else
            System.out.println("Mekana hosgeldiniz");
    }
    public static void main(String[] args){
        //Throw anahtar kelimesi kendimiz hata fırlatırız.
        Scanner scn=new Scanner(System.in);
        System.out.print("Yas:");
        int yas=scn.nextInt();
        try {//kendi hatamızı fırlatıp yakaladık
            kontrol(yas);
        }
        catch (ArithmeticException e){
           e.printStackTrace();
        }
        System.out.println("Hata alırsa burayı yazmaaz try cath olmazssa");
    }
}
