public class Account_class_test {
    public static void main(String [] args){
        Account a1=new Account();//paremetresiz consturcator calısır
        Account a2=new Account("Yasin","555550",2000,"cozdemir56.yz@gmail.com",05511667710);
        System.out.println(a2.getBakiye());
        a2.para_yatır(200);
        System.out.println(a2.getBakiye());
        a2.Para_cek(2500);
        System.out.println(a2.getBakiye());
        System.out.println(a1.getIsim());
        a1.bilgileri_goster();
        a2.bilgileri_goster();
        Account a3=new Account("Mehmet","4444",300000);
        a3.bilgileri_goster();
    }
}
