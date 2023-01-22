package MayinTarlasi;

import java.util.Scanner;
import java.util.SortedMap;

public class Oyun {
    private Tarla tarla;
    private String boyut;
    private int zorluk;
    private int puan;
    private String[][] temp;
    public  Oyun(){
        Scanner scn=new Scanner(System.in);
        while (true) {
            System.out.println("Boyut seciniz kucuk orta buyuk (1,2,3) olarak: ");
            String secim= scn.nextLine();
            if(secim.equals("1")) {
                boyut = "8x6";
                break;
            }
            else if (secim.equals("2")) {
                boyut="12x8";
                break;
            } else if (secim.equals("3")) {
                boyut="15x10";
                break;
            }
            else {
                System.out.println("Hatalı kodlama...");
            }
        }
        while (true) {
            System.out.println("zorluk seciniz kolay orta zor (1,2,3) olarak: ");
            String secim= scn.nextLine();
            if(secim.equals("1")) {
                zorluk = 6;
                break;
            }
            else if (secim.equals("2")) {
                zorluk=4;
                break;
            } else if (secim.equals("3")) {
                zorluk=2;
                break;
            }
            else {
                System.out.println("Hatalı kodlama...");
            }
        }
        tarla=new Tarla(Integer.parseInt(boyut.split("x")[1]),Integer.parseInt(boyut.split("x")[0]),zorluk);
        tarla.TarlaDoldur();
        temp=new String[Integer.parseInt(boyut.split("x")[1])][Integer.parseInt(boyut.split("x")[0])];
        for (int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                temp[i][j]="X";
            }
        }
        puan=0;
    }
    public void Calis(){
        System.out.println("\nHosgeldiniz...");
        String menu= """
                1-Oyna
                2-Tarla Göster
                3-Mayın yerlerini goster
                q çıkıs
           
           secim:""";
        Scanner scn=new Scanner(System.in);
        while (true){
            System.out.print(menu);
            String secim=scn.nextLine();
            if(secim.equals("q")){
                System.out.println("Puan :"+puan);break;
            }

            else if(secim.equals("1")){
                Goster();
                int str;
                int stn;
                while (true){
                    try{
                        System.out.print("\nSatir:");
                        str=scn.nextInt();
                        System.out.print("Sutun:");
                        stn=scn.nextInt();
                        break;
                    }
                    catch (Exception e){
                        System.out.println("Lütfen sayı giriniz");
                    }
                }

                if(kontrol(str,stn)){
                    temp[str][stn]="_";
                    puan++;
                }
                else {
                    System.out.println("Oyun bitti...");
                    System.out.println("Puan :"+puan);
                    break;
                }
                Goster();
            }

            else if (secim.equals("2")) {
                    Goster();
            } else if (secim.equals("3")) {
                tarla.TarlaGoster();
            } else {
                System.out.println("Hatalı kodlama");
            }

        }

    }
    public boolean kontrol(int satir,int sutun){
        if(tarla.getTarla()[satir][sutun].equals("*"))
            return false;
        return true;
    }
    public void Goster(){
        for (int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                System.out.print(temp[i][j]+"  ");
            }
            System.out.println();
        }
    }


}
