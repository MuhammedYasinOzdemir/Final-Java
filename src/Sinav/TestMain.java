package Sinav;

import Sinav.Hayvan.Kedi;

public class TestMain {
    public static void main(String[] args){
        absart a1=new Otomobil("ford",4,2000);
        absart a2=new Tir("Volvo",8,60000);
        Kisi[] kisi=new Kisi[20];
        a1.bilgileriGoster();
        a1.sur();
        a2.bilgileriGoster();
        a2.sur();
        for(int i=0;i<kisi.length;i++){
            kisi[i]=new Kisi();
            try{
                kisi[i].kontrol();
            }
            catch (Exception e){
                System.out.println(e);
            }
            finally {
                System.out.println("Diğer kisiye gecildi");
            }
        }
    }
}
