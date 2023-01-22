import java.util.Random;
import java.util.Scanner;

public class soru1 {
    public static void main(String[] args){
        int[] dizi=new int[10];
        Random rnd=new Random();
        Scanner scn=new Scanner(System.in);
        for (int i=0;i<dizi.length;i++)
            dizi[i]=rnd.nextInt(20);

        while (true){
        System.out.print("""
           \n\t\t************Dizi Sayı Bulma************\n
                \t1-sayı girişi
                \t2-Çıkıs:
                
                secim:""");
            String secim=scn.next();
            if (secim.equals("1"))
            {
                System.out.print("Sayı giriniz:");
                int sayi=scn.nextInt(),kontrol=0;
                for(int i=0;i<dizi.length;i++){
                    if (dizi[i]==sayi){
                        System.out.println("\nSayı:"+sayi+"\nİndix:"+i);
                        kontrol=1;
                        break;
                    }
                }
                if (kontrol==0)
                    System.out.println("\nSayı bulunmuyor");
            }
            else if(secim.equals("2")){
                break;
            }
            else{
                System.out.println("\nHatalı kodlama...");
            }


    }
    }
}
