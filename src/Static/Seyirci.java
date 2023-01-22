package Static;

public class Seyirci {
    private String isim;
    public static int  seyirciSayısı=0;//her class için ortak değişken oluşturur.
    public Seyirci(String isim) {
        this.isim = isim;
        seyirciSayısı++;//her obje oluştuğunda bir artar
    }
    public void oyunSeyret(){
        System.out.println(getIsim()+" oyun seyrediyor");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public static int getSeyirciSayısı(){//static olursa class ismindende çağrılabilri classa özgü metoddur
        //System.out.println(isim);//static olamayan değişken static methodda kullanılamaz
        return seyirciSayısı;//static olan metodda static omayan emthod veya değişken kullanılamaz
    }
}
