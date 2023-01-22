import java.util.Scanner;

public class Metodlar {

    public static void main(String[] args){
        selamla();
        FaktoriyeL();
        selamla("Yasin");//ustune yazma işlemi
        toplam(4,5);
    }
    public static void selamla(){//erişim belleği,ekstra ozellik ,donus tipi fonk adı,paarmetreler istege bağşlı
        System.out.println("Merhaba");
    }
    public static void selamla(String a){
        System.out.println("Merhabalar "+a);
    }
    public static void FaktoriyeL(){
        System.out.print("Sayi:");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(),f=1;
        for (int i=1;i<=s;i++)
            f*=i;
        System.out.println(f);
    }
    public static void toplam(int a,int b){
        System.out.println(a+b);
    }
}

