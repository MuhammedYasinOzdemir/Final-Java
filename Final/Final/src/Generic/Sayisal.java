package Generic;

public class Sayisal extends Aday{
    @Override
    int puanHesapla() {
        return mat*5+fen*3+turkce*3+sosyal*1;
    }

    public Sayisal(int turkce, int mat, int fen, int sosyal) {
        super(turkce, mat, fen, sosyal);
    }
}
