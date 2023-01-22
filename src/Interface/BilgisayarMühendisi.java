package Interface;

import Compesition.Bilgisayar;

public class BilgisayarMühendisi implements IMuhendis,ICalis{//birdem fazla implement edebiliyoz
    @Override
    public void calis() {
        System.out.println("Çalışıyor");
    }

    private boolean askerlik;
    private boolean adlisicil;

    public BilgisayarMühendisi(boolean askerlik, boolean adlisicil) {
        this.askerlik = askerlik;
        this.adlisicil = adlisicil;
    }

    public boolean isAskerlik() {
        return askerlik;
    }

    public void setAskerlik(boolean askerlik) {
        this.askerlik = askerlik;
    }

    public boolean isAdlisicil() {
        return adlisicil;
    }

    public void setAdlisicil(boolean adlisicil) {
        this.adlisicil = adlisicil;
    }

    @Override
    public void askerlikSorgula() {
        if(askerlik){
            System.out.println("Askerliğimi yaptım");
        }
        else{
            System.out.println("Askerliğimi yapmadım");
        }
    }

    @Override
    public void adliSicilSorgula() {
        if(adlisicil){
            System.out.println("Adli sicilim bulunyor...");
        }
        else {
            System.out.println("Adli sicilim bulunmuyor");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        if(array.length==0)
            System.out.println("Herhangi işte çalışmıyor");
        else{
        System.out.println("Bilgisayar mühendisliğind eiş tecrübem");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }}

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalama="+derece;
    }
    public void referans_getir(String[] array){//ek method tanımaldık
        if(array.length==0)
            System.out.println("Referans bulunmuyor");
        else{
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }
    }

}
