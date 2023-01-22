import java.util.Scanner;

public class Dongu_atm_proje {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String islemler= """
                1-Bakiye ogren
                2--Para Çek
                3-Para Yatır
                4-Çıkış
        secim:""";
        double bakiye=5000;
        while (true) {
            System.out.print(islemler);
            String sec = scn.next();
            if (sec.equals("4"))
                break;
            else if (sec.equals("1")){
                System.out.println("Bakiye:"+bakiye);
            } else if (sec.equals("2")) {
                double miktar= scn.nextDouble();
                if (bakiye>=miktar){
                    bakiye-=miktar;
                    System.out.println("Para cekildi...");
                }
                else
                    System.out.println("Bakiye yetersiz...");
            } else if (sec.equals("3")) {
                double miktar=scn.nextDouble();
                bakiye+=miktar;
                System.out.println("Bakiye eklendi...");

            }
            else
                System.out.println("Hatalı kodlama...");
        }
    }
}
