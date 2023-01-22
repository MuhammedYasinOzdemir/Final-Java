import java.util.Scanner;

public class Scanner_veri_alma {
 public static void main(String[] args){
     Scanner scn=new Scanner(System.in);
     System.out.print("Lutfen yas giriniz");
     if (scn.hasNextInt()){
         int yas=scn.nextInt();
         System.out.println("Yasınız:"+yas);}
     else{
         System.out.println("lutfen sayı giriniz");}


     System.out.print("Ad:");
     String c=scn.next(),ad=scn.nextLine();//nextline da olur next bosluk gordumu almaz
     System.out.println(ad);//!nextint den sonra iki tane nextline llazım
     System.out.println("Boy:");
     double boy=scn.nextDouble();
     System.out.println("Boy:"+boy);

 }
}
