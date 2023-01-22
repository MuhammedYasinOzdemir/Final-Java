package Calisan;

import java.util.Scanner;

public class Isci extends Personel {
    public  Isci(String ad,String soyad,int yas,double maas){
        super(ad,soyad,yas,maas);
    }
    public double zam_iste(){
        Scanner scn=new Scanner(System.in);
        System.out.print("Miktar:");
        double miktar= scn.nextDouble();
        System.out.println(getAd()+" "+getSoyad()+" zam istiyor...");
        return miktar;
    }
}
