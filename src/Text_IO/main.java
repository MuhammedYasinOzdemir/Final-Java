package Text_IO;

import java.io.FileWriter;
import java.io.IOException;
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
        int i=1;
        try(FileWriter writer=new FileWriter("C:\\Users\\User\\Desktop\\javaa\\java\\src\\Text_IO\\log.txt")){
            writer.write("\t*********** Idman Programi ***********\n\n");
            writer.write("Burpee sayısı : "+idman.getBurpee_sayisi()+"\n");
            writer.write("Pushup sayısı : "+idman.getPushup_sayisi()+"\n");

            writer.write("Situp sayısı : "+idman.getSitup_sayisi()+"\n");

            writer.write("Squat sayısı : "+idman.getSquat_sayisi()+"\n");

            while (idman.hareket_durum()==false){
            System.out.print("Hareket seciniz(Burpee,Squat,Situp,Pushup):");
            String hareket=scn.nextLine();

            System.out.print("Hareket sayısını giriniz:");
            int sayi= scn.nextInt();
            scn.nextLine();
            idman.hareketYap(sayi,hareket);
            writer.write(i+".İşlem ---------------> Hareket : "+hareket+" Sayı : "+sayi+"\n");
            i++;
        }
        System.out.println("Tebrikler idmanı tamamladınız...");
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
