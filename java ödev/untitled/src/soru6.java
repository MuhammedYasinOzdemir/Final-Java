import java.util.Random;

public class soru6 {
    public static void main(String[] args){
        Random rnd=new Random();
        int[] dizi=new int[20];
        for(int i=0;i< dizi.length;i++)
            dizi[i]=rnd.nextInt(100)+1;
        matris_goster(dizi);
        int max_eleman=max_bul(dizi);
        System.out.println("\nMax eleman:"+max_eleman);
    }
    public static int max_bul(int[] a){
        int max_indis=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[j]>a[i])
                    max_indis=j;
            }
        }
        return a[max_indis];
    }
    public static void matris_goster(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");

    }
}
