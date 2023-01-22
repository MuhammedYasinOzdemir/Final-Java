import java.util.*;

public class soru3 {
    static void notEkle(ArrayList<Double> b) {
        Scanner scn = new Scanner(System.in);
        int i=0;
        while (i<5){
            try {
                System.out.print((i+1)+". Degeri giriniz:");
                double c = scn.nextDouble();
                hataKontrol(c);
                b.add(c);
                i++;

            }
            catch (ArithmeticException ex) {
                System.out.println(ex.toString().split(": ")[1]);
            }


        }
    }
    public static void hataKontrol(double a){
            if(a<0){
                throw new ArithmeticException("Kucuk Deger Hatasi");
            } else if (a>100) {
                throw new ArithmeticException("Buyuk Deger Hatasi");
            }

        }

    public static void main(String[] args) {
        ArrayList<Double> notlar = new ArrayList<>();
        notEkle(notlar);
        for (double i : notlar)
            System.out.print(i + "  ");
    }
}
