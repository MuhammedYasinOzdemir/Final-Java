package Hata_Yakalama;

public class Finally {
    public static void main(String[] args){
        //Her durumda çalışan bloktur finally veritabanı bağlantısı kesme gibi
        try {
            String s=null;//herhangi bir yeri gostermiyor
            System.out.println(s.hashCode());//NullPointer hatası alır
        }
        catch (NullPointerException e){
            System.out.println("Null referans hatası");
        }
        finally {
            System.out.println("finally çalışıyor");
        }
        try {
            String s="Yasin";//cath calışmayacak am afinaly her turlu calısacak
            System.out.println(s.hashCode());
        }
        catch (NullPointerException e){
            System.out.println("Null referans hatası");
        }
        finally {
            System.out.println("finally çalışıyor");
        }
        try {
            int a=30/0;//hata oldu ama kontrl etmedik hata mesajı yazar ve alttakileri yazmaz ama eğerki finally kullnırsak kesin yazar

        }
        catch (NullPointerException e){
            System.out.println("Null referans hatası");//Buraya girmez Aritmetic hata gonderir program durur.
        }
        finally {
            System.out.println("finally çalışıyor");//Ama hata olsa bile finaly kodu kesin çalışır

        }

    }
}
