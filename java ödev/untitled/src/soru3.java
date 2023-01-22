import java.util.Random;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        int[][] dizi = new int[5][5];
        Random rnd = new Random();
        System.out.println("\n");

        for (int i = 0; i< dizi.length; i++) {

            for (int j = 0; j < dizi[i].length; j++) {
                if(j==0)
                    System.out.print("\t\t");
                dizi[i][j] = rnd.nextInt(10);
                System.out.print(dizi[i][j]+"\t");
            }
            System.out.println();
        }
        int[] sutun_sum=new int[dizi.length];
        for (int i = 0; i< dizi.length; i++) {
            sutun_sum[i]=0;
            for (int j = 0; j < dizi[i].length; j++) {
             sutun_sum[i]+=dizi[j][i];
            }
            System.out.println("\n\t"+(i+1)+"-Sutun Toplamı="+sutun_sum[i]);
        }

    }
}


