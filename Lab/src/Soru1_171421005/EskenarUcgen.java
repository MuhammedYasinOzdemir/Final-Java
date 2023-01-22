package Soru1_171421005;
public class EskenarUcgen extends Sekil implements Hareketli {
    private int kenar;
    private int yukseklik;
    private int posX;
    private int posY;

    public EskenarUcgen(String isim, int kenar, int yukseklik) {
        super(isim);
        this.kenar = kenar;
        this.yukseklik = yukseklik;
    }

    public EskenarUcgen(int kenar, int yukseklik) {
        this.kenar = kenar;
        this.yukseklik = yukseklik;
    }

    @Override
    public void yerdegistir(int x,int y) {
        this.posY=y;
        this.posX=x;
        System.out.println(getIsim()+" ("+x+","+y+") konumuna gecildi");
    }

    @Override
    void cevre() {
        System.out.println(getIsim()+" Cevre:"+(3*getKenar()));
    }

    @Override
    void alan() {
        System.out.println(getIsim()+" Alan:"+(((getKenar()*getKenar())*Math.pow(3.0,0.5))/4));
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
