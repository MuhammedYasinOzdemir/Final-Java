import java.util.Scanner;

public class ornek_beden_kitle_endeksi {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Boy giriniz:");
        double boy=scn.nextDouble();
        System.out.print("Kilo giriniz:");
        double kilo= scn.nextDouble();
        System.out.println("Beden Kutle endeksi:"+(kilo/(boy*boy)));
    }
}
