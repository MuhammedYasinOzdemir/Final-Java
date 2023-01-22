package Hata_Yakalama;

public class Hata_stack {
    public static void  birincif(){
        ikincif();
    }
    public static void  ikincif(){
        ucuncuf();//metodlarda hata altta yakalıyormu bakar throws anahtar kelimesein istege gore koyarız
    }
    public static void  ucuncuf(){
        int a=10/0;
    }
    public static void main(String[] args){
        try{//burda hatayı yakladık
        birincif();}
        catch (ArithmeticException e){
            System.out.println(e);//once uc de sonra iki sonra bir sonra mainde yakalanmazsa hata alır hatayı birbirlerine aktarır
        }
        //stack mantıgını kullnır
    }
}
