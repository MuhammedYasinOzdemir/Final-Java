public abstract class Ev {
    public int binaYasi;
    public int katSayisi;
    
    public Ev (int yas,int katSayisi){
        binaYasi=yas;
        this.katSayisi = katSayisi;
    }
    public abstract int fiyatHesapla();
    
    public void yasBilgisi(){
        System.out.println("Evin Yaşı:"+binaYasi);
    }

    @Override
    public String toString() {
        return "Binanın Yaşı:"+binaYasi+"Kat Sayısı="+katSayisi;
    }
    
        
    
}