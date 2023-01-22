package Abstract;

public class Daire extends Sekil {
    double yaricap;

    public Daire(String isim, double yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() +" alan : "+(Math.PI*yaricap*yaricap));
    }
}
