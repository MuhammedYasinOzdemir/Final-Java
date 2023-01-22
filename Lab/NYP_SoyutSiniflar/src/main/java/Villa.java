public class Villa extends Ev{
    public boolean havuzVarMi;
    
    public Villa (int katSayisi, int binaYasi, boolean havuz){
        super(binaYasi,katSayisi);
        this.havuzVarMi=havuz;
    }

    @Override
    public int fiyatHesapla() {
       int fiyat = 1000000;
       if(havuzVarMi){
           fiyat+=500000;
       }
       return fiyat;
    }
    
}
