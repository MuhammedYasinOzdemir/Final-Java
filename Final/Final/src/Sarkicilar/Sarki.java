package Sarkicilar;

public class Sarki {
    private String isim;
    private String sanatci;
    private int puan;

    public Sarki(String isim, String sanatci, int puan) {
        this.isim = isim;
        this.sanatci = sanatci;
        this.puan = puan;
    }

    @Override
    public String toString() {
        return "Sarki İsmi:"+isim+"\nSanatçı :"+sanatci+"\nPuan:"+puan;
    }

}
