package Generic;

public class GenericMetodOlusturma {
    public static void main(String[] args){
    EsitAgirlik a=new EsitAgirlik(20,45,21,8);
    EsitAgirlik b=new EsitAgirlik(14,5,25,32);
    Sayisal sayisal=new Sayisal(4,55,8,14);
    Sayisal sayisal1=new Sayisal(15,40,14,8);
        System.out.println(karsilastır(a,b).puanHesapla());
        Yazdir(karsilastır(a,b));//generic içinde generic
        Yazdir(karsilastır(sayisal1,sayisal));
    }
    public static  <E extends Aday> E karsilastır(E a1,E a2){
        //<E extends Aday> anlamı Gelebilecek sınıf belirtmek ama sadece <E> yazılsa çok genel kalıcağı için puan hesaplayı kabul etmezdi
        //O yuzden extend aday ifadesi ile sadece Aday sınıfından miras alan sınıflara özel
        //2 inic E donus tipi ne sınıfından ise  o sınftna doner
        //paremetre kısmı sınıf kısmı
        if(a1.puanHesapla()>a2.puanHesapla()){
            return a1;
        }
        else {
            return a2;
        }
    }
    public static <E extends Aday> void Yazdir(E a){
        System.out.println("Birinci "+a.getClass()+" ogrencisi \nPuani:"+a.puanHesapla());
    }
}
