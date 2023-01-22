package Sınıflae.Atm;

public class Hesap {
    private String kadi;
    private String  passaword;
    private Double bakiye;

    public Hesap(String kadi, String passaword, Double bakiye) {
        this.kadi = kadi;
        this.passaword = passaword;
        this.bakiye = bakiye;
    }
    public void paraCek(double miktar){
        if(bakiye>miktar){
            bakiye-=miktar;
            System.out.println("Para çekildi...");
        }
        else{
            System.out.println("Yetersiz bakiye...");
        }
    }
    public void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.println("Para yatirildi");
    }
    public String getKadi() {
        return kadi;
    }

    public void setKadi(String kadi) {
        this.kadi = kadi;
    }

    public String getPassaword() {
        return passaword;
    }

    public void setPassaword(String passaword) {
        this.passaword = passaword;
    }

    public Double getBakiye() {
        return bakiye;
    }

    public void setBakiye(Double bakiye) {
        this.bakiye = bakiye;
    }
}
