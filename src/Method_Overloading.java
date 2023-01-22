public class Method_Overloading {
    //methodların birden fazla kullanılmasına yarar aynı işimde olmalı method adı ama paremtreli paremetresiz paremetre sayısısna gore birçok tanımlanabilri
    public static void main(String [] args){
        toplama(1,2);
        toplama(1,2,3);
        toplama(1,2,3,4);
        toplama(1,2,3,4,5);
        skor_hesapla(45);
        skor_hesapla("Mehmet");
        skor_hesapla("Yasin",50);
        skor_hesapla();
    }
    public  static  void toplama(int a,int b,int c){
        System.out.println(a+b+c);                  //boyle bir çok cesit tanımlanbilir
    }
    public  static  void toplama(int a,int b){
        System.out.println(a+b);
    }
    public  static  void toplama(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    public  static  void toplama(int a,int b,int c,int d,int e){
        System.out.println(a+b+c+d+e);
    }
    public static void skor_hesapla(String isim,int puan){
        System.out.println(isim+" Adlı oyuncunun"+puan +" puanı var");
    }
    public static void skor_hesapla(int puan){
        System.out.println(" İsimsiz oyuncunun"+puan +" puanı var");
    }
    public static void skor_hesapla(String isim){
        System.out.println(isim+" Adlı oyuncunun"+" puanı yok");
    }
    public static void skor_hesapla(){
        System.out.println(" isimsiz oyuncunun"+" puanı yok");
    }
}
