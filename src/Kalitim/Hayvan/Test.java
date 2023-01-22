package Kalitim.Hayvan;

public class Test {
    public static void main(String [] args){
        Hayvan h1=new Hayvan("hayvan",55,155,5);
        Kopek kopek=new Kopek("Findik",45,90,4,32);
        kopek.harekete_gec(55);
        kopek.kos(45);  //super
        kopek.kos2(30); //overiding
        h1.harekete_gec(56);
    }
}
