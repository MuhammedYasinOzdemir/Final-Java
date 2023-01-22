package Polymorphism;
//Bir nesnenin birden fazla gibi davranması
public class Main {
    public static void konustur(Hayvan hayvan){//Bu metodla birçok refenas gondeririz nesneye gore hareket eder
        System.out.println(hayvan.konus());
    }
    public static void kontrol(Hayvan hayvan){
        if(hayvan instanceof Hayvan){//instanceof hangi referanstan kontrol etmeye yarar
            System.out.println("Hayvan sınıfından");//Hayvan sınıfının alt sınıflarını kontrol eder
        } if (hayvan instanceof Kedi) {//En ust sınıf Object sınıfıdır tostring mesela object sınıfından
            System.out.println("Kedi sınıfından");//Ama objectte cok oldugu için direk refenas gonderilemez istance ofla kontrol edilmeli once

        }
        else if(hayvan instanceof  Kopek){
            System.out.println("kOPEK sınıfından");
        } else if (hayvan instanceof At) {
            System.out.println("At sınıfından");
        }
        else
            System.out.println("Belrisiz");
    }
    public static  void kontrol2(Object a){

        if (a instanceof String){
            String b=(String) a;
            System.out.println(b);//casting yaparak turunu belirmeliyiz bir ust sınıfa erişirken
        } else if (a instanceof Double) {//Referans veri tipi gondermeliyiz
            Double c=(Double) a;
            System.out.println(c);
        }
    }
    public static void main(String[] args){
        Hayvan hayvan=new Hayvan("limon");
        Hayvan kedi=new Kedi("Tekir");//hayvan referansı kedi referenası gibi davrandı
        Hayvan kopek=new Kopek("kopek");//Buna polmorbisim denir cok biçimlililk
        Hayvan at=new At("Karabas");//Hayvan referansı At ,kopek gibi referansları kapsamaya yarar
        System.out.println(hayvan.konus());
        System.out.println(kedi.konus());//override ettiğimiz için Kedi clasında metod çalışır
        System.out.println(kopek.konus());//overide etmedğimiz için hayvan clasındaki çalışır
        System.out.println(at.konus());
        konustur(at);//Hayvan refeansı at gibi davranıyor.
        konustur(kedi);//Ve farklı class kullanmaya gerek kalmaz
        konustur(kopek);
        kontrol(at);
        kontrol(kopek);
        kontrol(kedi);
        kontrol2("merhaba");//boylece bir çok veri tipi gondermemiz yara
        kontrol2(5.4);
        kontrol2(5);//bunu yazma Integer sınıfında oldugu için

    }


}


class Hayvan{//public  olamaz dosya isimiyle aynı olmak zorunda olur
private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return "Hayvan konusuyor";
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
class Kedi extends Hayvan{//Hayvandan miras aldık

    public Kedi(String isim) {//bunu yazmalıyız mirasdan dolayı
        super(isim);
    }

    @Override
    public String konus() {//miras aldığımız metodu overide ederiz
        return this.getIsim()+" miyavlıyor";

}}
class Kopek extends Hayvan{//Hayvandan miras aldık

    public Kopek(String isim) {//bunu yazmalıyız mirasdan dolayı
        super(isim);
    }

    /*@Override
    public String konus() {//miras aldığımız metodu overide ederiz
        return this.getIsim()+" havliyor";

    }*/
}
class At extends Hayvan{//Hayvandan miras aldık

    public At(String isim) {//bunu yazmalıyız mirasdan dolayı
        super(isim);
    }

    @Override
    public String konus() {//miras aldığımız metodu overide ederiz
        return this.getIsim()+" kişniyor";

    }}