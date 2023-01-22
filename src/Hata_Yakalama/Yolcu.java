package Hata_Yakalama;

public class Yolcu {
    class vizeException extends Exception{
        @Override
        public void printStackTrace() {
            System.out.println("Vize yoktur...");
        }
    }
    class adliException extends Exception{
        @Override
        public void printStackTrace() {
            System.out.println("Adli sicil kaydı vardır...");
        }
    }
    class biletException extends Exception{
        @Override
        public void printStackTrace() {
            System.out.println("Bilet yoktur...");
        }
    }
    private boolean vize;
    private boolean bilet;
    private boolean adli_sicil;


    public Yolcu(boolean vize, boolean bilet, boolean adli_sicil) {
        this.vize = vize;
        this.bilet = bilet;
        this.adli_sicil = adli_sicil;
    }

    public void vizeKontrol() throws Exception {
        if(!vize)
            throw new vizeException();
    }
    public void biletKontrol() throws Exception {
        if(!bilet)
            throw new biletException();
    }
    public void adliKontrol() throws Exception {
        if(!vize)
            throw new adliException();
    }
    public boolean isVize() {
        return vize;
    }

    public void setVize(boolean vize) {
        this.vize = vize;
    }

    public boolean isBilet() {
        return bilet;
    }

    public void setBilet(boolean bilet) {
        this.bilet = bilet;
    }

    public boolean isAdli_sicil() {
        return adli_sicil;
    }

    public void setAdli_sicil(boolean adli_sicil) {
        this.adli_sicil = adli_sicil;
    }
}
