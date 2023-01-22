package Generic;

public abstract class Aday {
    public int turkce;
    public int mat;
    public int fen;
    public int sosyal;

    public Aday(int turkce, int mat, int fen, int sosyal) {
        this.turkce = turkce;
        this.mat = mat;
        this.fen = fen;
        this.sosyal = sosyal;
    }
    abstract int puanHesapla();
    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }

    public int getSosyal() {
        return sosyal;
    }

    public void setSosyal(int sosyal) {
        this.sosyal = sosyal;
    }
}
