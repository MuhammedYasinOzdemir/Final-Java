package Generic;

public class Sozel extends Aday{
    @Override
    int puanHesapla() {
        return turkce*5+mat*3+fen*1+sosyal*3;
    }

    public Sozel(int turkce, int mat, int fen, int sosyal) {
        super(turkce, mat, fen, sosyal);
    }
}
