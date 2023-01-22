package Kalitim;

public class Calisan {  //Ana class miras alınan class
    private String isim;
    private double maas;
    private String departman;
    public Calisan(String isim,double maas,String departman){
        this.departman=departman;
        this.isim=isim;
        this.maas=maas;
    }
    public void calıs(){
        System.out.println("Çalısan çalışıyor...");
    }
    public void bilgileri_goster(){
        System.out.println("İsim:"+isim+"\nDepartman:"+departman+"\nMaas:"+maas);
    }
    public void departman_degis(String departman){
        this.departman=departman;
        System.out.println("Departman değişti...");
    }

}
