package Polymorphism;

public class Beyblade {
    private String beybladci;
    private double donus_hizi;
    private double saldiri_gucu;

    public Beyblade(String beybladci, double donus_hizi, double saldiri_gucu) {
        this.beybladci = beybladci;
        this.donus_hizi = donus_hizi;
        this.saldiri_gucu = saldiri_gucu;

    }
    public void saldir(){
        System.out.println(getBeybladci()+" " +saldiri_gucu+ " ve "+donus_hizi+" ile saldiriyor");
    }
    public void kutsoalcanavarOrtaaycikar(){
        System.out.println("Beyblain kutsal canavari bulunmuyır");
    }
    public void bilgileri_goster(){
        System.out.println("Beybladci:"+beybladci);
        System.out.println("Saldırı gücü:"+saldiri_gucu);
        System.out.println("Donus hızı:"+donus_hizi);
    }
    public String getBeybladci() {
        return beybladci;
    }

    public void setBeybladci(String beybladci) {
        this.beybladci = beybladci;
    }

    public double getDonus_hizi() {
        return donus_hizi;
    }

    public void setDonus_hizi(double donus_hizi) {
        this.donus_hizi = donus_hizi;
    }

    public double getSaldiri_gucu() {
        return saldiri_gucu;
    }

    public void setSaldiri_gucu(double saldiri_gucu) {
        this.saldiri_gucu = saldiri_gucu;
    }
}
