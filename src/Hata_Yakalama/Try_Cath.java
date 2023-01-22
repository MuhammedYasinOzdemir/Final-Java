package Hata_Yakalama;

public class Try_Cath {
    public static void main(String[] args){
        /*
        try{
        //Expetion(Hata) oluşabilecek bloklar
        }
        catch(Expetion_turu(hata_turu) e){
        //hata durumundan yapılacak işlemler
        }
         */
        //Unchecked Expetion:Çalışma zamanı hatası yani sıfır girecini java bilemze
        //int a=30/0 //Hata kodu:AritmeticExpetion
       /* int a[]={1,2,3};
        System.out.println(a[6]);   //Hata indexe erişmek olmayan:hatakodu:ArrayIndexOutOfBoundExpetion
        */
        try{
            int a=20/0;
            int b[]={1,5,6};
            System.out.println(b[4]);
        }
        catch (ArithmeticException e){ //Expetion e Yazılsa yine çalışır Expetion da bir çk hata turu calışır
            System.out.println("Bir sayı 0 a bolunemz");
        }
        try{

            int b[]={1,5,6};
            System.out.println(b[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayın boyunu astınız...");
        }
        try{

            int b[]={1,5,6};
            System.out.println(b[4]);
        }
        catch (Exception e){ //Expetion e Yazılsa yine çalışır Expetion da bir çk hata turu calışır
            System.out.println("Arrayın boyunu astınız...");
        }
        try{

            int b[]={1,5,6};
            System.out.println(b[4]);
        }
        catch (IndexOutOfBoundsException e){ //bu yazılsa yine çalışır çunku ArrayIndexOutOfBoundExpetion üst klası Runtime Expetionda bunun ust clası
            System.out.println("Arrayın boyunu astınız...");
            e.printStackTrace();//Hata mesajını soyluyor
        }
        try{

            int b[]={1,5,6};
            int a=3/0;
            System.out.println(b[4]);
        }
        catch (Exception e){ //Hata olsutumu yazar herhangi
            System.out.println("Bir hata olustu...");
            e.printStackTrace();//Hata mesajını soyluyor
        }
        try{

            int b[]={1,5,6};
            int a=30/0;
            System.out.println(b[4]);
        }
        /*   catch (Exception e){ //Hata olsutumu yazar herhangi
            System.out.println("Bir hata olustu...");
            e.printStackTrace();//Hata mesajını soyluyor
        }*///Bunu yazarsak unların ust classı olduğu için asağıdakileri vermicek ve hataya sebep olacak ozel hatalar yazarken ust classlara dikkat edilmeli
        catch (ArrayIndexOutOfBoundsException e){ //Bir çok ozel olarak hatalar cath blokları alt alta çalışabilir
            System.out.println("Arrayın boyunu astınız...");
        }
        catch (ArithmeticException e){
            System.out.println("Sayı 0 a bolunemez");
        }

        System.out.println("Burası çalışıyor");

    }
}
