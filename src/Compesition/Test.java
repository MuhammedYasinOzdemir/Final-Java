package Compesition;

public class Test {
    public static void main(String[] args){
        Anakart anakart=new Anakart("Nvidia 3050ti","Nvidia",10,"Windows 11");
        Kasa kasa=new Kasa("Asusu ","Asusu","temperli cam");
        Resolution resolution=new Resolution(1920,1080);
        Monitor monitor=new Monitor("Asus","Asus","15.6",resolution);
        Bilgisayar pc=new Bilgisayar(monitor,kasa,anakart);
        pc.getMonitor().monitor_kapat();//iç içe kullanılmasısna denşr
        pc.getKasa().bilgisayar_ac();
    }
}
