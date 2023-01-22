import java.util.Scanner;

public class soru4 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        while (true){
            System.out.println("""
                    \t********************\tHesap Makinesi\t********************\n
                    0-Çıkış
                    1-Toplama
                    2-Çıkarma
                    3-Çarpma
                    4-Bolme
                    
        secim:""");
            String secim= scn.nextLine();
            if (secim.equals("0"))
                break;
            System.out.print("1-sayıyı giriniz:");
            int a= scn.nextInt();
            System.out.print("2-sayıyı giriniz:");
            int b= scn.nextInt();
            if(secim.matches("1"))
                toplam(a,b);
            else if(secim.equals("2"))
                cıkarma(a,b);
            else if(secim.equals("3"))
                carpma(a,b);
            else if(secim.equals("4"))
                bolme(a,b);
        }
    }
    public static void toplam(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public static void cıkarma(int a,int b){
        System.out.println(a+"-"+b+"="+(a-b));
    }
    public static void carpma(int a,int b){
        System.out.println(a+"x"+b+"="+(a*b));
    }
    public static void bolme(int a,int b){
        System.out.println(a+"/"+b+"="+(a/b));
    }
}
