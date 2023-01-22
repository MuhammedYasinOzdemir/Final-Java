package Text_IO;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
//Muhammed Yasin Özdemir
//171421005
public class WebVeriCekme {
    public static String[] strip(char[] b,char c){ //method girlen karektere göre ayırır
        String[] d=new String[5];
        int kontrol=0;
        d[kontrol]="";
        for(int i=0;i<b.length;i++){
            if (b[i]==c) {
                kontrol += 1;
                d[kontrol] = "";
            }
            d[kontrol]+=b[i];
        }
        return d;
    }
    public static String kes(char[] b,int bas,int son){   //belli aralık girilerek string verir
        String newString="";
        for(int i=bas;i<son;i++)
            newString+=b[i];
        return newString;
    }
    public static void main(String[] args){
        ArrayList<String> isimler=new ArrayList<>();
        ArrayList<String > yonetmenler=new ArrayList<>();
        ArrayList<String>  basroller=new ArrayList<>();
        ArrayList<String>  rating=new ArrayList<>();
        ArrayList<String>  yillar=new ArrayList<>();
        URL url= null;
        System.out.println("Filmler alınıyor...");
        try {
            url = new URL("https://www.imdb.com/chart/top/?ref_=nv_mv_250");    //veri çektiğimiz site girilir
            Thread.sleep(300);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()))){
            Scanner scn=new Scanner(bufferedReader);
            String s="";
            System.out.println("Filmler yazılıyor...\n");
            Thread.sleep(200);
            while (scn.hasNextLine()) {
                s = scn.nextLine();
                if (s.strip().endsWith("</a>")) {
                    if (s.strip().startsWith("title")) {
                        String isim=s.split("\"")[2];
                        isimler.add(kes(isim.toCharArray(),2,isim.length()-4));   //İsimler alınıyor...
                        String basrol=(strip(strip(s.split("\"")[1].toCharArray(),'(')[1].toCharArray(),',')[1]+strip(strip(s.split("\"")[1].toCharArray(),'(')[1].toCharArray(),',')[2]);
                        basroller.add(kes(basrol.toCharArray(),1,basrol.length())); //Basroller alınıyor...
                        yonetmenler.add(strip(s.split("\"")[1].toCharArray(),'(')[0]);  //Yonetmenler ekleniyor
                    }
                }
                if(s.strip().startsWith("<strong title")){
                    String imdb=strip(s.toCharArray(),'>')[1];
                    rating.add(kes(imdb.toCharArray(),1,imdb.length()-8));  //İMDb puanı ekleniyor
                }
                if(s.strip().startsWith("<span class=\"secondaryInfo\"")){
                    String yil=s.split(">")[1].split("<")[0];
                    yillar.add(kes(yil.toCharArray(),1,yil.length()-1));    //İMDb puanı ekleniyor
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("********************* Filmler *********************\n");
        for(int i=0;i<isimler.size();i++){
            System.out.println("\t"+(i+1)+". "+isimler.get(i));
            System.out.println("\t\tBasroller : "+basroller.get(i));
            System.out.println("\t\tYönetmen : "+yonetmenler.get(i));
            System.out.println("\t\tYıl : "+ yillar.get(i));
            System.out.println("\t\tİMDb Puanı : "+rating.get(i)+"\n\n**************************************************\n");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\nDosyaya filmler yazılıyor...");

        File file=new File("filmler.txt");
        try (FileWriter writer=new FileWriter(file)){
            Thread.sleep(700);
            writer.write("********************* Filmler *********************\n\n");
            for(int i=0;i<isimler.size();i++) {
                writer.write("\t" + (i + 1) + ". " + isimler.get(i)+"\n");
                writer.write("\t\tBasroller : " + basroller.get(i)+"\n");
                writer.write("\t\tYönetmen : " + yonetmenler.get(i)+"\n");
                writer.write("\t\tYıl : " + yillar.get(i)+"\n");
                writer.write("\t\tİMDb Puanı : " + rating.get(i) + "\n\n**************************************************\n\n");
            }
            System.out.println("Dosyaya filmler yazıldı.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }}
