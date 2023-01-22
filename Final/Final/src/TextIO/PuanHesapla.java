package TextIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PuanHesapla {
    public static void main(String[] args){
        try(FileReader fos=new FileReader("dosya.txt")){
            Scanner scn=new Scanner(fos);
            while (scn.hasNextLine()){
                String[] kisi=scn.nextLine().split(",");
                String  message=Hesapla(kisi[0],Double.parseDouble(kisi[1]),Double.parseDouble(kisi[2]),Double.parseDouble(kisi[3].trim()));
                System.out.println(message);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String Hesapla(String isim,double vize,double proje,double finall){
        double not=(vize*0.35)+(proje*0.15)+(finall*0.5);
        String cikti=isim+" bu dersten " +not+" ile ";
        if(not>90)
            cikti+="AA";
        else if (not>75)
            cikti+="BA";
        else if (not>60)
            cikti+="BB";
        else if (not>55)
            cikti+="CB";
        else if (not>40)
            cikti+="CC";
        else if (not>30)
            cikti+="DC";
        else if (not>15)
            cikti+="DD";
        else
            cikti+="FF";
        cikti+= " aldi";
        return cikti;
    }
}
