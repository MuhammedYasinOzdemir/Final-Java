package Hata_Yakalama;


import java.util.InputMismatchException;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static String menu(){
        return """
                0-q çıkış
                1-Topla
                2-Çıkart
                3-Çarp
                4-Böl
                5-Mod al
        secim: """;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        double sonuc,s1,s2;
        while (true){
        System.out.print(menu());
        String secim= scn.nextLine();
        if(secim.equals("q"))
                break;
            try {

                    System.out.print("1-sayıyı giriniz:");
                    s1 = scn.nextDouble();
                    System.out.print("2-sayıyı giriniz:");
                    s2 = scn.nextDouble();
                    if(secim.equals("4")){
                        double k=s1/s2;}


            }
            catch (ArithmeticException e){
                System.out.println("Bir sayı sıfıra bolunemez");
                continue;
            }
            catch (InputMismatchException e)
            {
                System.out.println("sayı giriniz");


                continue;
            }

            finally {
                scn.nextLine();
            }



        if (secim.equals("1")){
            System.out.println("sonuc="+(s1+s2));}
        else if (secim.equals("2")){
            System.out.println("sonuc="+(s1-s2));}
        else if (secim.equals("3")){
            System.out.println("sonuc="+(s1*s2));}
        else if (secim.equals("4")){
            System.out.println("sonuc="+(s1/s2));}
        else if (secim.equals("5")){
            System.out.println("sonuc="+(s1%s2));}
        else{
            System.out.println("Hatalı giriş...");}




        }}

}
