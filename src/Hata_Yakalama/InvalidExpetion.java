package Hata_Yakalama;

public class InvalidExpetion extends ArithmeticException{
    public InvalidExpetion(String s) {
        super(s);
    }

    @Override
    public void printStackTrace() {
        System.out.println("18 yastan kucukler giremez...");
    }
}
