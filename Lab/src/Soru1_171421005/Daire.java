package Soru1_171421005;
public class Daire extends Sekil {
    private int yaricap;



    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    void cevre() {
        System.out.println(getIsim()+" Cevre:"+(2*PI*getYaricap()));
    }

    @Override
    void alan() {
        System.out.println(getIsim()+" Alan:"+(PI*getYaricap()*getYaricap()));
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }
}
