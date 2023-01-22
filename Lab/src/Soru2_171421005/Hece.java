
package Soru2_171421005;
import java.util.ArrayList;

public class Hece extends Metin{
    //Muhammed Yasin Özdemir
    //171421005
    private ArrayList<Harf> harfler=new ArrayList<>();
    void harfEkle(Harf h){
        harfler.add(h);
    }

    void harfSil(Harf h){
       if(getHarfler().contains(h))
           getHarfler().remove(h);
    }

    @Override
    public void sil() {
        harfler.clear();
    }

    public void goster(){
        for(int i=0;i<harfler.size();i++){
            System.out.print(harfler.get(i).getDeger());}
    }

    public double boyutHesapla() {
        return getHarfler().size();
    }

    public ArrayList<Harf> getHarfler() {
        return harfler;
    }

    public void setHarfler(ArrayList<Harf> harfler) {
        this.harfler = harfler;
    }

}
