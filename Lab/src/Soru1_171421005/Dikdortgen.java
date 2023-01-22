package Soru1_171421005;
public class Dikdortgen extends Sekil{
    private int kisakenar;
    private int uzunkenar;

    public Dikdortgen(String isim, int kisakenar, int uzunkenar) {
        super(isim);
        this.kisakenar = kisakenar;
        this.uzunkenar = uzunkenar;
    }

    public Dikdortgen(int kisakenar, int uzunkenar) {
        this.kisakenar = kisakenar;
        this.uzunkenar = uzunkenar;
    }



    @Override
    void cevre() {
        System.out.println(getIsim()+" Cevre:"+(2*(getKisakenar())+getUzunkenar()));
    }

    @Override
    void alan() {
        System.out.println(getIsim()+" Alan:"+(getUzunkenar()*getKisakenar()));
    }
    public int getKisakenar() {
        return kisakenar;
    }

    public void setKisakenar(int kisakenar) {
        this.kisakenar = kisakenar;
    }

    public int getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(int uzunkenar) {
        this.uzunkenar = uzunkenar;
    }
}
