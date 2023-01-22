package Sınıflae.Atm;

import java.util.Scanner;

public class Login {
    public boolean kontrol(Hesap hesap){
        Scanner scn=new Scanner(System.in);
        System.out.print("Kullancı Adı:");
        String k=scn.nextLine();
        System.out.print("Paralo:");
        String p=scn.nextLine();
        if(hesap.getKadi().equals(k) && hesap.getPassaword().equals(p))
            return true;
        else
            return false;
    }
}
