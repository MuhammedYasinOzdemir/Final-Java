package Calisan;

import java.util.Scanner;

public class Muhendis extends Personel{
    private String alan;
    public  Muhendis(String ad,String soyad,int yas,double maas){
        super(ad,soyad,yas,maas);
        this.alan=alan;
    }

    public double zam_iste(){
        Scanner scn=new Scanner(System.in);
        System.out.print("Miktar:");
        double miktar= scn.nextDouble();
        System.out.println(alan+" Muhendisi"+getAd()+" "+getSoyad()+" zam istiyor...");
        return miktar;
    }
}
