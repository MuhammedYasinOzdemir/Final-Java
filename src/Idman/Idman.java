package Idman;

public class Idman {
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi,int pushup_sayisi,int situp_sayisi,int squat_sayisi){
        this.burpee_sayisi=burpee_sayisi;
        this.pushup_sayisi=pushup_sayisi;
        this.situp_sayisi=situp_sayisi;
        this.squat_sayisi=squat_sayisi;
    }
    public void hareketYap(int sayi,String hareket){
        if(hareket.equals("Burpee")){
            burpeeYap(sayi);
        }
        else if (hareket.equals("Pushup")){
            pushupYap(sayi);
        }
        else if (hareket.equals("Situp")){
            situpYap(sayi);
        } else if (hareket.equals("Squat")) {
            squatYap(sayi);
        }
        else{
            System.out.println("Geçersiz hareket...");
        }
    }
    public void burpeeYap(int sayi){
        if (burpee_sayisi==0)
        {
            System.out.println("Yapacak burpee tamamladınız...");
        }
        if (burpee_sayisi-sayi<0){
            System.out.println("Yapacagınız burpee sayisi gectiniz.Tebrikler!");
            burpee_sayisi=0;
            System.out.println("Kalan burpee:"+burpee_sayisi);
        }
        else {
            burpee_sayisi-=sayi;
            System.out.println("Kalan burpee:"+burpee_sayisi);
        }
    }
    public void squatYap(int sayi){
        if (squat_sayisi==0)
        {
            System.out.println("Yapacak squat tamamladınız...");
        }
        if (squat_sayisi-sayi<0){
            System.out.println("Yapacagınız squat sayisi gectiniz.Tebrikler!");
            squat_sayisi=0;
            System.out.println("Kalan squat:"+squat_sayisi);
        }
        else {
            squat_sayisi-=sayi;
            System.out.println("Kalan squat:"+squat_sayisi);
        }
    }
    public void situpYap(int sayi){
        if (situp_sayisi==0)
        {
            System.out.println("Yapacak situp tamamladınız...");
        }
        if (situp_sayisi-sayi<0){
            System.out.println("Yapacagınız situp sayisi gectiniz.Tebrikler!");
            situp_sayisi=0;
            System.out.println("Kalan situp:"+situp_sayisi);
        }
        else {
            situp_sayisi-=sayi;
            System.out.println("Kalan situp:"+situp_sayisi);
        }
    }
    public void pushupYap(int sayi){
        if (pushup_sayisi==0)
        {
            System.out.println("Yapacak pushup tamamladınız...");
        }
        if (pushup_sayisi-sayi<0){
            System.out.println("Yapacagınız pushup sayisi gectiniz.Tebrikler!");
            pushup_sayisi=0;
            System.out.println("Kalan pushup:"+pushup_sayisi);
        }
        else {
            pushup_sayisi-=sayi;
            System.out.println("Kalan pushup:"+pushup_sayisi);
        }
    }
    public boolean hareket_durum(){
        return (pushup_sayisi==0) && (situp_sayisi==0) && (squat_sayisi==0) && (squat_sayisi==0);
    }




}
