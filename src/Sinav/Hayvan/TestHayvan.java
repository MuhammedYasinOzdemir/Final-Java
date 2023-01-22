package Sinav.Hayvan;

public class TestHayvan {
    public static void konustur(Hayvan hayvan){
        if(hayvan instanceof Kedi){
          Kedi kedi=(Kedi)hayvan;
         kedi.konustur();}
        else if(hayvan instanceof Kopek) {
            Kopek kopek = (Kopek) hayvan;
            kopek.konustur();
        }
        else
            hayvan.konustur();
    }
    public static void main(String[] args){
        Hayvan hayvan1=new Kedi("tekir");
        Hayvan hayvan2=new Kopek("pusat");
        konustur(hayvan1);
        konustur(hayvan2);
        if (hayvan2 instanceof Kopek){
            Kopek kopek=(Kopek) hayvan2;
            kopek.kos(5);//kopek in iki tane kos metedu var
            kopek.kos();
        }
    }
}
