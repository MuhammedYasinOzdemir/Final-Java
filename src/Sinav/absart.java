package Sinav;

public abstract class absart {
    private String marka;
    private int teker;
    private double agirlik;
    private double hiz;

    public absart(String marka, int teker, double agirlik) {
        this.marka = marka;
        this.teker = teker;
        this.agirlik = agirlik;
    }
    abstract void bilgileriGoster();
    abstract void sur();

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getTeker() {
        return teker;
    }

    public void setTeker(int teker) {
        this.teker = teker;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public double getHiz() {
        return hiz;
    }

    public void setHiz(double hiz) {
        this.hiz = hiz;
    }
}
