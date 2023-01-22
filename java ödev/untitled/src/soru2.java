import java.util.Random;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        int[][] dizi = new int[5][5];
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i< dizi.length; i++)
            for (int j = 0; j < dizi[i].length; j++)
                dizi[i][j] = rnd.nextInt(20);

        while (true) {
            System.out.print("""
                    \n\t\t************ÇokBoyutlıDizi Sayı Bulma************\n
                         \t1-sayı girişi
                         \t2-Çıkıs:
                         
                         secim:""");
            String secim = scn.next();
            if (secim.equals("1")) {
                System.out.print("Sayı giriniz:");
                int sayi = scn.nextInt(), kontrol = 0;
                for (int i = 0; i < dizi.length; i++) {
                    for (int j = 0; j < dizi[i].length; j++) {
                        if (dizi[i][j] == sayi) {
                            System.out.println("\nSayı:" + sayi + "\nİndix:" + "(" + (i + 1 )+ "," + (j + 1) + ")");
                            kontrol = 1;
                            break;
                        }
                    }
                    if (kontrol == 1)
                        break;
                }
                if (kontrol == 0)
                    System.out.println("\nSayı bulunmuyor");
            } else if (secim.equals("2"))
                break;
            else
                System.out.println("\nHatalı kodlama...");

        }
    }
}


