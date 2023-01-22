package MayinTarlasi;

import javax.swing.*;
import java.util.Random;

public class Tarla {
    private int satir;
    private int sutun;
    private int zorluk;
    private int mayin_sayisi;
    private String[][] tarla;

    public Tarla(int satir, int sutun, int zorluk) {
        this.satir = satir;
        this.sutun = sutun;
        this.zorluk = zorluk;
    }
    public void TarlaDoldur(){
        tarla=new String[satir][sutun];
        int i=0;
        mayin_sayisi=satir*sutun/zorluk;
        Random rnd=new Random();
        for ( i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                    tarla[i][j]="_";
            }
        }
        while (i<mayin_sayisi){
            int satirr=rnd.nextInt(satir);
            int sutunr=rnd.nextInt(sutun);
            if(!tarla[satirr][sutunr].equals("*")){
                tarla[satirr][sutunr]="*";
                i++;
            }
        }

    }
    public void TarlaGoster(){
        for ( int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                System.out.print(tarla[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public String[][] getTarla() {
        return tarla;
    }
}
