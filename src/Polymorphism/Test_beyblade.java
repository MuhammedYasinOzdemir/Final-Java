package Polymorphism;

import java.util.Scanner;

public class Test_beyblade {
    public static void main(String [] args){
        System.out.println("Beyblade programına hosşgeldiniz...");
        System.out.println("Çıkış için q ya basınız...");
        Scanner scn=new Scanner(System.in);
        while (true){
            System.out.println("Habgi beyblade turu");
            String islem= scn.nextLine();
            if(islem.equals("q")){
                break;
            }
            else{
                Beyblade_Fabrikası fabrika=new Beyblade_Fabrikası();
                Beyblade beyblade=fabrika.beybladeUret(islem);//ne doneceği belli değil çok biçimli davranmış olur bizim gireceğimiz ad gore nesne referansı dondurur
                //polifimiz bunda kullanıır
                if(beyblade==null) {//gecersiz beyble dondugu belirtilir
                    System.out.println("Gecerli beyblade giriniz...");
                }
                else{
                    beyblade.bilgileri_goster();
                    beyblade.saldir();//bu metod overdie edilmediği için beyblade sınıfında kullanılır
                    beyblade.kutsoalcanavarOrtaaycikar();//overrde edilen metod calısır
                }
            }
        }
    }
}
