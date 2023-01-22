package AlanHesaplayici;

import java.io.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    private static ArrayList<Sekil> sekiller;
    private static Sekil sekil;
    public static void main(String[] args){
        String menu= """
                1-Sekil Ekle
                2-Sekilleri Goster
                3-Sekil Yazdir
                4-Alan Hesapla
                
        secim(q cikis):""";
        sekiller=new ArrayList<>();
        while (true){
            System.out.print(menu);
            Scanner scn=new Scanner(System.in);
            String sec=scn.nextLine();
            if(sec.equals("q"))
                break;
            else if (sec.equals("1")) {
                System.out.print("Sekil adı yazınız(Kare,ucgen,daire):");
                String secim= scn.nextLine();
                if(secim.toLowerCase().equals("kare") || secim.toLowerCase().equals("ucgen") || secim.toLowerCase().equals("daire")){
                    sekil=SekilBelirle(secim.toLowerCase());
                    sekiller.add(sekil);}
               else
                    System.out.println("Hatalı sekil girisi...");
            } else if (sec.equals("2")) {
                for(Sekil sekil:sekiller)
                    System.out.println(sekil.toString());
            } else if (sec.equals("3")) {
                for(Sekil sekil:sekiller)
                    Yazdir(sekil);
            } else if (sec.equals("")) {
                for(Sekil sekil:sekiller)
                    System.out.println(AlanHesapla(sekil));
            }
        }
    }
    public static Sekil SekilBelirle(Sekil sekil){
        if(sekil instanceof Kare){
            return (Kare) sekil;
        } else if (sekil instanceof Daire) {
            return (Daire) sekil;
        } else if (sekil instanceof Ucgen) {
            return  (Ucgen)sekil;
        }
        return null;
    }
    public static Sekil SekilBelirle(String sekil){
        Scanner scanner=new Scanner(System.in);
        if(sekil.equals("kare")){
            System.out.print("a:");
            double a= scanner.nextDouble();
            System.out.println("b:");
            double b=scanner.nextDouble();
            return (Kare) new Kare("Kare",a,b);
        } else if (sekil.equals("daire")) {
            System.out.print("yaricap:");
            double r=scanner.nextDouble();
            return (Daire) new Daire("Daire",r);
        } else if (sekil.equals("ucgen")) {
            System.out.print("taban:");
            double k= scanner.nextDouble();
            System.out.print("yukseklik :");
            double y= scanner.nextDouble();
            return  (Ucgen) new Ucgen("Ucgen",y,k);
        }
        return null;
    }
    public static <E> void Yazdir(E sekil){//E yerine Sekilde olabilir
        try(FileWriter fos=new FileWriter("sekiller.txt",true)){
            fos.write(sekil.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static <E extends Sekil> double AlanHesapla(E sekil){//bu da ozel tanım
        return sekil.AlanHesapla();
    }



}
