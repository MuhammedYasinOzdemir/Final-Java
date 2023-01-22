package Soru1_171421005;
public class TestSekil {
    public static void main(String[] args){
        Sekil dikdortgen=new Dikdortgen("Dikdortgen",4,5);
        Sekil daire=new Daire("Daire",6);
        EskenarUcgen eskenarucgen=new EskenarUcgen("Eskenara ucgen",4,5);   //ek implement oduğu için yer değiştir çalışamdığuından dolayı kenddi clasıı ile olustururuz
        dikdortgen.alan();
        dikdortgen.cevre();
        daire.alan();
        daire.cevre();
        eskenarucgen.alan();
        eskenarucgen.cevre();
        eskenarucgen.yerdegistir(24,51);
    }
}