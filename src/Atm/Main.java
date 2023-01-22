package Atm;

public class Main {
    public static void main(String[] args){
        Hesap hesap=new Hesap("kkyyasin","12345",5000);
        Atm atm=new Atm();
        atm.calıs(hesap);
    }
}
