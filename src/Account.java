public class Account {
    private String hesapno;
    private double bakiye=0;
    private String email;
    private String isim;
    private int tel_no;


    public Account(String isim,String hesapno,double bakiye,String email,int tel_no){//overlodagin yapıldı
        this.hesapno=hesapno;//değerler eşitlernşr bu şeklde
        this.bakiye=bakiye;
        this.email=email;
        this.tel_no=tel_no;
        this.isim=isim;
    }
    public Account(){//constructor Class ismiyle aynı olmalı tanımlandığında sınıf calışır
        this("Bilgi yok","Bilgi yok",0,"Bilgi yok",0);
        System.out.println("Paremetresiz constructır");
    }
    public Account(String isim,String hesapno,double bakiye){
        this(isim,hesapno,bakiye,"Bilgi yok",0);//buda bilgilerin yarıssını girilmesini sağar
    }
    public void bilgileri_goster(){
        System.out.println(isim+" "+hesapno+" "+bakiye+" "+email+" "+tel_no);
    }




    public void para_yatır(int miktar){
        bakiye+=miktar;
        System.out.println("Para yatırıldı...");
    }
    public void Para_cek(int miktar){
        if (bakiye-miktar<0)
        {
            System.out.println("Yetersiz bakiye");
        }
        else {
            bakiye-=miktar;
            System.out.println("Para çekilidi");
        }
    }

    public double getBakiye() {
        return bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public int getTel_no() {
        return tel_no;
    }

    public String getHesapno() {
        return hesapno;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    public void setTel_no(int tel_no) {
        this.tel_no = tel_no;
    }
}
