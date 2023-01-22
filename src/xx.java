import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class xx {



    public static String cuty(char[] b, int bas, int son) { //belli aralık girilerek string verir
        String newString = "";
        for (int i = bas; i < son; i++)
            newString += b[i];
        return newString;
    }

    public static void main(String[] args) {
        ArrayList<String> Kisaltma = new ArrayList<>();
        ArrayList<String> TamAd = new ArrayList<>();
        ArrayList<String> fiyat= new ArrayList<>();

        URL url = null;
        try {
            url = new URL(  "https://1000kitap.com/kitaplar/en-iyiler/index.htmltest");
            Thread.sleep(300);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            Scanner scn = new Scanner(bufferedReader);
            String s = "";
            while (scn.hasNextLine()) {
                s = scn.nextLine();
                System.out.println(s);
                /*System.out.println(s);
                if (s.strip().startsWith("<td><em class"))
                    Kisaltma.add(cuty(s.strip().toCharArray(),15,s.strip().length()-12));
                if (s.strip().startsWith("<td>") && s.strip().endsWith("</td>") && !s.strip().endsWith("</em></td>") && !s.strip().endsWith("</a></td>"))
                    TamAd.add((cuty(s.strip().toCharArray(),4,s.strip().length()-5)));
                if(s.strip().startsWith("<th>"))
                    fiyat.add(cuty(s.strip().toCharArray(),4,s.strip().length()-5));*/
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*for (int i=0;i<Kisaltma.size();i++)
            System.out.println(Kisaltma.get(i)+"\t\t"+TamAd.get(i)+"\t\t\t"+fiyat.get(i)+"\n");*/

        }
    }



