import java.util.Scanner;

public class For_dongusu {
    public static void main(String[] args){
        for(int i=0;i<10;i++)//tanımlama,aralık,artış
            System.out.print (i+"  ");
        int[] dizi={1,2,3,4,5};
        for (int i =0;i<dizi.length;i++)//dizi boyutu otomatik buluyor
            System.out.print(i+"  ");
        for (int i:dizi)//each metodu
            System.out.print(i+ "  ");//i dizinin elemanı
        for(int i=0,j=5;i<3 &&j>0;i++,j--)//kosula baglı doner i kosulı 3 defa sağlanıyı için 3 deger uretir
            System.out.println("i:"+i+"\nj:"+j);
        for (int  i=2;i<=64;i*=2)
            System.out.print(i+"  ");
        Scanner scn=new Scanner(System.in);
        System.out.print("\nSayi:");
        int sayi=scn.nextInt();
        int c=1;
        for(int i=1;i<=sayi;i++)
            c*=i;
        System.out.println(sayi+" Faktoriyel:"+c);

    }

}
