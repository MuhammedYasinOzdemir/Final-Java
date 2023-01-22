import java.util.Random;

public class soru5 {
    public static void main(String[] args){
        Random rnd=new Random();
        int[][] matris=new int[2][2];
        for (int z=0;z<10;z++){
            for (int i=0;i<matris.length;i++)
                for(int j=0;j<matris[i].length;j++)
                    matris[i][j]= rnd.nextInt(2);
            if (matris_kontrol(matris)){
                System.out.println("\n"+(z+1)+"-matris Birim matristir...");
                matris_yazdır(matris);

            }
            else{
                System.out.println("\n"+(z+1)+"-matris Birim matris değildir...");
                matris_yazdır(matris);
            }
        }
    }
    public static void matris_yazdır(int[][] a){
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
    public static boolean matris_kontrol(int[][] a){
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
            if(i==j){
                if(a[i][j]!=1)
                    return false;
            }
            else{
                if(a[i][j]!=0)
                    return false;
            }
            }
            }
        return true;
    }
}
