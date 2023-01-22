import java.util.Scanner;

public class Dongu_Arstgorm_sayı {
    public static void main(String[] args){
        //1634=1^4+6^4+3^4+4^4
     int temp,t;
     for (int i=1;i<10000000;i++){
         int basamak=i%10;
         temp=i;
         t=0;
         do {
             t+=Math.pow(temp%10,basamak);
             temp/=10;
         }while (temp>0);
         if (t==i)
             System.out.println(t);
     }

    }
}
