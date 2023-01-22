public class Obje_referans {
    public static void main(String[] args){
        Account a1=new Account();//a1 bir referansdır objenin adresi a1 e eşitlenşr
        Account a2=a1;//referanslar eşitlenir
        if(a1==a2){
            System.out.println("Aynı objeyi gosteryorlar");
        }
        else
            System.out.println("Aynı objeyigostermiyorlar");
        new Account("Yasin","5550",2000).bilgileri_goster();//referanssız çalışır
    }
}
