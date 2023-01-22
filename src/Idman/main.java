package Idman;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Hareketler\nBurpee\nSquat\nSitup\nPushup");
        System.out.println("Hareket sayılarını giriniz");
        System.out.print("Burpee sayısı:");
        int burpee=scn.nextInt();
        System.out.print("Squat sayısı:");
        int squat=scn.nextInt();
        System.out.print("Situp sayısı:");
        int situp= scn.nextInt();
        System.out.print("Pushup sayısı:");
        int pushup= scn.nextInt();
        Idman idman=new Idman(burpee,pushup,situp,squat);
        scn.nextLine();
        while (idman.hareket_durum()==false){
            System.out.print("Hareket seciniz(Burpee,Squat,Situp,Pushup):");
            String hareket=scn.nextLine();

            System.out.print("Hareket sayısını giriniz:");
            int sayi= scn.nextInt();
            scn.nextLine();
            idman.hareketYap(sayi,hareket);
        }
        System.out.println("Tebrikler idmanı tamamladınız...");
    }
}
