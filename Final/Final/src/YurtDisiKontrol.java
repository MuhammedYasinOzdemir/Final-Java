import java.util.Random;

public class YurtDisiKontrol {
    public static boolean vizedurum;
    private static boolean harcdurum;
    private static boolean yasakdurum;
    public static void vizeKontrol ()throws Exception{
        if(!vizedurum)
            throw new Exception("Vize yoktur");
    }
    public static void HarcKontrol ()throws Exception{
        if(!harcdurum)
            throw new Exception("Harç yetersiz");
    }
    public static void yasakKontrol ()throws Exception{
        if(yasakdurum)
            throw new Exception("Siyasi yasagınız bulunuyor");
    }
    public static void main(String[] args){
        int temp;
        Random rnd=new Random();
        for(int i=0;i<20;i++){
            temp=0;
            try{
                yasakdurum=rnd.nextBoolean();
                harcdurum=rnd.nextBoolean();
                vizedurum=rnd.nextBoolean();
                yasakKontrol();
                HarcKontrol();
                vizeKontrol();
                temp=1;
            }
            catch (Exception e)
            {
                System.out.println(e.toString().split(":")[1].trim());
            }
            finally {
                if(temp==0){
                    System.out.println((i+1) +" - Yolcu yurt dısına çıkamaz");
                }
                else
                    System.out.println((i+1) +" - Yolcu yurt dısına çıkabilir");
                System.out.println();
            }
        }
    }
}
