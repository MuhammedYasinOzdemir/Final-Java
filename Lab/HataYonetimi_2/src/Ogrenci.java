import java.util.ArrayList;

    public class Ogrenci {

        private ArrayList<Integer> notlar = new ArrayList<>();

        void notEkle (int yeniNot) throws KucukDegerHatasi, BuyukDegerHatasi{

            if (yeniNot < 0) {
                throw new KucukDegerHatasi(yeniNot);

            } else if (yeniNot > 100) {
                throw  new BuyukDegerHatasi(yeniNot);

            } else{
                notlar.add(yeniNot);
            }
        }

        void notYazdir() {
            for (Integer not : notlar) {
                System.out.println(not);
            }


        }
    }
