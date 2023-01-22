import java.util.Random;
import java.util.SortedMap;

public class soru1 {
    public static void diziDoldur(int dizi[]) {
        Random rnd = new Random();
        for (int i = 0; i < dizi.length; i++)
            dizi[i] = rnd.nextInt(1,20);
    }
    public static void diziTopla(int[] dizi,int eleman_sayisi){
        int t=0;
        for(int i=0;i<eleman_sayisi;i++)
            t+=dizi[i];
        System.out.println("Dizi Toplamı="+t);
    }
    public static void main(String[] args){
        int[] dizi1=new int[5],dizi2=new int[11],dizi3=new int[8];
        diziDoldur(dizi1);
        diziDoldur(dizi2);
        diziDoldur(dizi3);
        try{
            diziTopla(dizi1,4);
            diziTopla(dizi2,12);
            diziTopla(dizi3,11);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Hatalı boyut girildi...\n");
            System.out.println("Hata"+ex.toString());
        }
        catch (Exception e){
            System.out.println("Hata var"+e.toString());
        }//Burayı yazmaz ama üstte olsaydı bu altta kalanın üst clası olduğu için sytax hatasına sebep olur.

        try{
            diziTopla(dizi1,44);

        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Dizi1 Hatalı boyut girildi...\n");
            System.out.println("Hata"+ex.toString());
        }
        try{

            diziTopla(dizi2,12);

        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Dizi2 Hatalı boyut girildi...\n");
            System.out.println("Hata"+ex.toString());
        }
        try{
            diziTopla(dizi3,11);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Dizi3 Hatalı boyut girildi...\n");
            System.out.println("Hata"+ex.toString());
        }
        finally {
            System.out.println("Her turlu burası yazar");
        }

    }
}
