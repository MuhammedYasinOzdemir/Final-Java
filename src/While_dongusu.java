import java.util.Scanner;

public class While_dongusu {
    public static void main(String[] args){
        //While kosul dogru oldugu surece salısır
        int i=0;
        while(i<10){
            System.out.print(i+"   ");
            i++;
        }
        Scanner scn=new Scanner(System.in);
        int sayi=scn.nextInt(),f=1;
        while (sayi>0){
            f*=sayi;
            sayi--;
        }
        System.out.println(f);
        //do-while
        int s2=scn.nextInt(),t=0;
        do{
            t+=s2%10;
            s2/=10;
        }while(s2!=0);
        System.out.println(t);
        //break donguden cıkılır
        //contine işareti gordumu cıkar
    }
}
