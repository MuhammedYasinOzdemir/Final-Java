package Kalitim.Calisana;

import java.util.ArrayList;
import java.util.Scanner;

public class Yazilimci extends Calisan2 {
    private ArrayList<String> bildigi_diller;
    public Yazilimci(String isim, double maas, String departman,ArrayList<String > bildigi_diller) {
        super(isim, maas, departman);
        this.bildigi_diller=bildigi_diller;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Bildiği diller "+bildigi_diller);
    }
    public void format_at(String isletim_sistemi){
        System.out.println(getIsim()+" kisisi "+isletim_sistemi +" sistemini yükledi.");
    }
    public void bakim_yap(){
        System.out.println(getIsim()+" kisisi  Bakım yaptı...");
    }
    public void dil_ekle(){
        Scanner scn=new Scanner(System.in);
        System.out.print("Dil:");
        String dil= scn.nextLine();
        bildigi_diller.add(dil);
    }



    public ArrayList<String> getBildigi_diller() {
        return bildigi_diller;
    }

    public void setBildigi_diller(ArrayList<String> bildigi_diller) {
        this.bildigi_diller = bildigi_diller;
    }
}
