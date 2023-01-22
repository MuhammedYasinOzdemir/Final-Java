package Sinav;

import java.util.Random;

public class Kisi implements ITrafikKontrol{
    Random rnd=new Random();



    @Override
    public boolean ehliyet() {
        return rnd.nextBoolean();
    }

    @Override
    public boolean ruhsat() {
        return rnd.nextBoolean();
    }

    @Override
    public boolean kimlik() {
        return rnd.nextBoolean();
    }

    @Override
    public boolean kontrol() throws Exception{
       if(kimlik() && ruhsat() && ehliyet()){
           System.out.println("Kontrol gecildi");
           return true;}
       else
           throw new Exception("Kontrolu gecemediniz");
    }
}
