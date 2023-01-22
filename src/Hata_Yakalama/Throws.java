package Hata_Yakalama;

import java.io.IOException;
import java.util.Scanner;

public class Throws {
    public static void kontrol(int yas) throws IOException {//fırlattğımız hatanın varlığını belirtiriz
        if (yas<18)//ya bu hatayı metodda veya throws kullanırsak metod dışında kullanabilriz
            throw new IOException("Mekana 18 yastan kucukler giremez.");
        else
            System.out.println("Mekana hosgeldiniz");
    }
    public static void main(String[] args) {//main de throws yaparsak apide hata verir
        Scanner scn = new Scanner(System.in);
        int yas = scn.nextInt();

        try {
            kontrol(yas);//hatayı burda kontrol ederiz
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
