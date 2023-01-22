package Kalitim;

public class Test {
    public static void main(String[] args){
    Yonetici mudur=new Yonetici("Yasin","Mudur",10000,10);
    Calisan c1=new Calisan("Mehmet",2000,"IT");
    Calisan c2=new Yonetici("Mustafa","Ceo",18000,50);//Yonetici sınıfı ust sınıftan tanımlanabilir.
    //Yonetici c3= (Yonetici) new Calisan("Mustafa",5000,"Satış Danışmanı"); //casting işlemi yapılmadan üst sınıftan alt sınıfta tanımlanamaz float int te tanımlanamaz gibi bu almazf
    mudur.bilgileri_goster();
    c1.bilgileri_goster();
    c2.bilgileri_goster();
    //c3.bilgileri_goster();
    mudur.zam_yap(200);
    mudur.calıs();
    mudur.departman_degis("Üretim müdürü");
    c1.calıs();
    c1.departman_degis("Eleman");

}}

