import java.util.Scanner;

public class HataAyiklama {
    public static void main(String[] args){
        //Hata ayıklama try catch
        try{
            int a=5/0;//0 a bolunemez hatası alir catch duser alt blogu calitirmaz
            int[] b={1,2,3};
            System.out.println(b[6]);
        }
        /*catch (Exception e){
            System.out.println("Hatali tanimlama"); bir ust class oldugu için
        }*/
        catch (ArithmeticException e){
            System.out.println("Sayi sifira bolunemez");
        }
        catch (Exception e){
            System.out.println("Dogru tanimlama");
        }
        finally {
            System.out.println("Her türlü çalışan finally");
        }
        //kendi hatamizi firlatma
        Scanner scn=new Scanner(System.in);
        try {
            System.out.print("Yas:");
            int yas=scn.nextInt();
            if(yas<18)
                throw new Exception("Yas 18 den kucuk olamaz");
        }
        catch (Exception e){
            System.out.println(e);
        }
        //Kendi hata sınıfıfmız firlatma
        try {
            System.out.print("Yas:");
            int yas=scn.nextInt();
            if(yas<18)
                throw new Hatasinifi("Yas 18 den kucuk olamaz");
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();

        }
    }
    static class Hatasinifi extends Exception{
        public Hatasinifi(String message) {
            super(message);
        }

        @Override
        public void printStackTrace() {
            System.out.println("printStace");
        }

        @Override
        public String toString() {
            return "To string metodu";
        }
    }
}
