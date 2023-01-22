package Interface;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{
    private double harc;
    private boolean siyasiYasak;
    private boolean vize;

    public Yolcu() {
        Scanner scn=new Scanner(System.in);
        System.out.print("Yatırdığınız Harç Bedeli : ");
        this.harc=scn.nextDouble();
        scn.nextLine();//hata önlemek için
        System.out.print("Siyasi yasağınız bulunuyor mu(Evet,Hayır):");
        String cevap=scn.nextLine();
        if(cevap.toLowerCase().equals("evet"))
            this.siyasiYasak=true;
        else
            this.siyasiYasak=false;
        System.out.print("Vizeniz bulunuyor mu(Evet,Hayır):");
        String cevap2= scn.nextLine();
        if(cevap2.toLowerCase().equals("evet"))
            this.vize=true;
        else
            this.vize=false;
    }

    @Override
    public boolean vizeDurum() {
        if(vize){
            System.out.println("Vizeniz onaylandı.");
            return true;}
        else{
            System.out.println("Vizeniz Yoktur Çıkamazsınız.");
            return false;}

    }

    @Override
    public boolean harc() {
        if(harc<15){
            System.out.println("Yurt  dışını harcını tam yatırın");
            return false;
        }
        else{
            System.out.println("Yurt dışı harcı tamam.");
            return true;
        }


    }

    @Override
    public boolean siyasiYasak() {
        if(siyasiYasak)
        {
            System.out.println("Siyasi yasağınız bulunuyor yurt dışına çıkamazsınız.");
            return false;
        }
       else {
            System.out.println("Siyasi yasak bulunmuyor yurt dışına çıkabilirsiniz");
            return true;
        }
    }
}
