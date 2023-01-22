package Kalitim.Calisana;

public class Calisan2 {
    private String isim;
    private double maas;
    private String departman;

    public Calisan2(String isim, double maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    public void bilgileri_goster(){
        System.out.println("İsim:"+isim+"\nDepartman:"+departman+"\nMaas:"+maas);
    }
    public void departman_degis(String departman){
        this.departman=departman;
        System.out.println("Departman değişti...");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
