import java.util.Scanner;

public class Kosul_Durumlari {
    public static void main(String[] args) {
        /*
        Karşılastırma operetorleri
        == eşittit
        != eşit değil
        > buyukmu
        < kucuk mu
        >= buyuk ve esitmşmi
        <= kucuk ve eşitmi

         */
        /*
        Mantıksal operetorlaer
        && ve
        || veya
        ! değil
         */
        //if else
        Scanner scn = new Scanner(System.in);
        System.out.println("Yas giriniz:");
        if (scn.hasNextInt()) {
            int yas = scn.nextInt();
            if (yas < 18)
                System.out.println("EHliyet alamaz");
            else
                System.out.println("Ehliyet alabilir");
        } else {
            System.out.println("Sayı girniz");

        }

        //if else else if
        String islem = scn.next();
        if (islem.equals("1"))
            System.out.println("islem 1");
        else if (islem.equals("2"))
            System.out.println("islem 2");
        else if (islem.equals("3"))//string esitlik boyle yapılır
            System.out.println("islem 3");
        else if (islem.equals("4"))
            System.out.println("islem 4");
        else
            System.out.println("Hatalı kodlama");
        //Switch Case
        int sec = scn.nextInt();
        switch (sec) {
            case 1:
                System.out.println(1);break;
            case 2:
                System.out.println(2);//break olmassa asağidaki leri yazar
            default:
                System.out.println("aa");    //bulamzsayazar
        }
        System.out.println("Sayıları giriniz");
        int a= scn.nextInt(),b= scn.nextInt(),c= scn.nextInt();
        if (a>b){
            if(b>c)
                System.out.println(b);
            else
                System.out.println(c);
        }
        else{
            if(a>c)
                System.out.println(a);
            else
                System.out.println(c);
        }
    }

}
