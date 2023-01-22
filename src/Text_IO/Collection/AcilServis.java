package Text_IO.Collection;

import org.jetbrains.annotations.NotNull;

import javax.swing.text.StyledEditorKit;
import java.util.*;

public class AcilServis {
    //Öncelik kırmızı>sarı>yeşil

    public static void main(String [] args){
        String[] turler={"Kırmızı","Sarı","Yeşil"};
        ArrayList<Hasta> hastalar =new ArrayList<>();
        String[] isimler={"Mehmet","Eren","Selin","Zeynep","Mustafa","Selim","Ahmet","Gamze","Çiğdem","Sümeyye","Eyüp"};
        Random rnd=new Random();
        for(int i=0;i<20;i++){
            hastalar.add(new Hasta(isimler[rnd.nextInt(isimler.length)],turler[rnd.nextInt(turler.length)]));
            System.out.println(hastalar.get(i));
        }

        System.out.println("\n**********************************************\n");
        Collections.sort(hastalar);
        for(int i=0;i<hastalar.size();i++){
            System.out.println(hastalar.get(i));
        }
    }
}
