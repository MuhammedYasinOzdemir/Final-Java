import java.util.Scanner;

public class Dongu_kullanici_girisi {
    public static void main(String[] args){
        int hak=5;
        String k_adi="cozdemir56.yz@gmail.com",sifre="12345";
        Scanner scn=new Scanner(System.in);
        while (hak>0) {
            System.out.print("Kullanici Adı:");
            String kullanici=scn.nextLine();
            System.out.print("Sifre:");
            String sifree=scn.nextLine();
            if (kullanici.equals(k_adi) && sifree.equals(sifre))
            {
                System.out.println("Hosgeldiniz...");
                break;
            }
            hak--;
        }
    }
}
