package Soru2_171421005;

import java.util.ArrayList;


public class Metin extends Veri{
    //Muhammed Yasin Özdemir
    //171421005
    private String tip;
    private String deger;
    private ArrayList<Hece> heceler=new ArrayList<>();

    @Override
    double boyutHesapla() {
        int t=0;
        for(int i=0;i<getHeceler().size();i++)
            t+=getHeceler().get(i).boyutHesapla();
        return t;
    }

    public void sil(){
        heceler.clear();
    }

    public void heceEkle(Hece hece){
        heceler.add(hece);
    }

   public void heceSil(Hece hece) {
       if (heceler.contains(hece)) {
           heceler.remove(hece);
       }
   }

    public void goster(){
        for (int i=0;i<getHeceler().size();i++){
            getHeceler().get(i).goster();}
    }

    public ArrayList<Hece> getHeceler() {
        return heceler;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        this.deger = deger;
    }

    public void setHeceler(ArrayList<Hece> heceler) {
        this.heceler = heceler;
    }

}

