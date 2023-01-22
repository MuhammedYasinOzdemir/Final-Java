package Sinav;

public class method_overloading {
    public static int topla(int a,int b){
        return a+b;
    }
    public static int topla(int a,int b,int c){
        return a+b+c;
    }
    public static int topla(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static int topla(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }
    public static void Kisi(){
        System.out.println("bilinmiyor");
    }
    public static void Kisi(String isim){
        System.out.println(isim);
    }
    public static void Kisi(String isim,String soyad){
        System.out.println(isim+soyad);
    }
    public static void main(String[] args){
        System.out.println(topla(1,2));
        System.out.println(topla(1,2,3));
        System.out.println(topla(1,2,3,4));
        System.out.println(topla(1,2,3,4,5));
       Kisi();
       Kisi("Yasin");
       Kisi("yasin","ozdemir");
    }

}
