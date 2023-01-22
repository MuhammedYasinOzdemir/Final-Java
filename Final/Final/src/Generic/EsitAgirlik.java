package Generic;

public class EsitAgirlik extends Aday{
    @Override
    int puanHesapla() {
        return turkce*4+mat*4+sosyal*2+fen*2;
    }

    public EsitAgirlik(int turkce, int mat, int fen, int sosyal) {
        super(turkce, mat, fen, sosyal);
    }
}
