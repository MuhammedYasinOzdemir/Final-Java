import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //ArrayList<Integer> liste = new ArrayList<Integer>();
        ArrayList<String> liste = new ArrayList<String>();
        Scanner al = new Scanner(System.in);
        for (int i=0; i<12; i++) {
            System.out.println((i+1) + ". ay ismini giriniz: ");
            String ay=al.nextLine();
            liste.add(ay);

        }
        System.out.println(liste.get(5));
        System.out.println("Eleman Sayısı : "+liste.size());
        for (int i = 0; i < liste.size(); i++)
        {
            System.out.println("Eleman : "+liste.get(i));
        }
    }
}