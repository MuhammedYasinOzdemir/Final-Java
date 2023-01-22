package Soru1_171421005;

public  abstract class Sekil {
    abstract void cevre();
    abstract void alan();
    static final double PI=Math.PI;
    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Sekil(String isim) {
        this.isim = isim;
    }

    public Sekil() {
        this("Bilgi yok");
    }
}
