public class Daire extends Ev{
    public int aidat;
    
    public Daire (int yas,int kat,int aidat){
        super(yas,kat);
        this.aidat=aidat;
    }

    @Override
    public int fiyatHesapla() {
        int fiyat=500000;
        if(aidat>500){
            fiyat=fiyat + 300000 +(12*aidat);
        }
        else{
            fiyat=fiyat+12*aidat;
        }
        return fiyat;
            
    }
    
}