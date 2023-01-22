package bp1_16_12_2021;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DateClassExample {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1.toString());
        Scanner scn = new Scanner(System.in);
        Random r1 = new Random();
        int sayi=r1.nextInt(50)+1;
        System.out.println("Sayi="+sayi);
        System.out.println("------------------");
        ArrayList a1 = new ArrayList();
        for(int i=0;i<3;i++){
            System.out.println("Deger Giriniz:");
            Object x= scn.next();
            a1.add(x);
        }
        System.out.println("------------------");
        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i));
    }
        
        }
    }

