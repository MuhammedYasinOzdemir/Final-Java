package Atm;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scn=new Scanner(System.in);
        System.out.print("Kullanıcı adı:");
        String k_adi=scn.nextLine();
        System.out.print("Parola:");
        String passaword=scn.nextLine();
        if (k_adi.equals(hesap.getKullaniciadi()) && passaword.equals(hesap.getParalo()))
            return true;
        else
            return false;
    }
}
