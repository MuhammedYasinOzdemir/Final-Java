package Sinav;


import java.util.ArrayList;
import java.util.Random;

//Arraylist
public class soru3  {

    static Random rnd=new Random();
    public static void main(String[] args) {
        ArrayList<String> sarkicilar = new ArrayList<>();
        ArrayList<Integer> sureler = new ArrayList<>();
        for(int i=0;i<20;i++)
            sarkiEkle(sureler,sarkicilar);
        for (int i=0;i< sarkicilar.size();i++)
            System.out.println(sarkicilar.get(i));
        RasgeleSarki(sureler,sarkicilar);
    }


    public static void sarkiEkle(ArrayList<Integer> a, ArrayList<String> b) {
        b.add(new String[]{"mama","deed","deee","pddepl"}[rnd.nextInt(4)]);
        a.add(rnd.nextInt(50,200));

    }


    public static void sarkiSil(ArrayList<Integer> a, ArrayList<String> b) {

    }


    public static void RasgeleSarki(ArrayList<Integer> a, ArrayList<String> b) {
        System.out.println(b.get(rnd.nextInt(b.size()))+a.get(rnd.nextInt(a.size())));
    }





}


