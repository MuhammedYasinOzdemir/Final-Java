
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Ogrenci o = new Ogrenci();
        Scanner s = new Scanner(System.in);

        int count = 0;
        int sinir = 3;
        int yeniNot;

        do {
            try {
                System.out.println("Bir not giriniz:");

                yeniNot = s.nextInt();
                o.notEkle(yeniNot);
                count++;

//            } catch (KucukDegerHatasi ex) {
//                System.out.println(ex.getMessage());
//            } catch (BuyukDegerHatasi ex) {
//                System.out.println(ex.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        } while (count < sinir);

    }
}
