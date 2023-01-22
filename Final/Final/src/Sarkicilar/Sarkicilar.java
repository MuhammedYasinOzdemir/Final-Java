package Sarkicilar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sarkicilar {
    private ArrayList<Sarki> sarkilar;
    private String isim;
    private String sanatci;
    private Scanner scn;
    private int pozisyon;
    private Random rnd;
    public Sarkicilar() {
        sarkilar=new ArrayList<>();
        scn=new Scanner(System.in);
        rnd=new Random();
    }
    public void SarkiEkle(){
        System.out.print("Sarki ismi :");
        isim=scn.nextLine();
        System.out.print("Sanatci :");
        sanatci=scn.nextLine();
        sarkilar.add(new Sarki(isim,sanatci,rnd.nextInt(10)));
    }
    public void SarkiSil(){
        Goster();
        while (true){
            try {
                System.out.print("Sıra numarasini giriniz:");
                pozisyon=scn.nextInt()-1;
                if(pozisyon>=0 && pozisyon<=sarkilar.size())
                    break;
            }
           catch (Exception e){
               System.out.println("Hatali kodlama...");
           }

        }
        sarkilar.remove(pozisyon);
    }
    public void Goster(){
        if(sarkilar.size()==0)
            System.out.println("Sarki bulunmamaktadir");
        else{
        for(Sarki sarki:sarkilar){
            System.out.println(sarki);
        }}
    }
    public void SarkiGuncelle(){
        Goster();
        while (true){
            try {
                System.out.print("Sıra numarasini giriniz:");
                pozisyon=scn.nextInt()-1;
                if(pozisyon>=0 && pozisyon<sarkilar.size())
                    break;
            }
            catch (Exception e){
                System.out.println("Hatali kodlama...");
            }

        }
        System.out.print("Sarki ismi :");
        isim=scn.nextLine();
        System.out.print("Sanatci :");
        sanatci=scn.nextLine();
        sarkilar.set(pozisyon,new Sarki(isim,sanatci, rnd.nextInt(10)));
    }

}
