package Abstract;

public abstract class Sekil {//soyut sınıf yapıldı
    //soyut sınıfın objesi oluşurlamaz ama özellik method vs oluşutrulabilir.V eextends eden inherit mantığı gibi kulllanabilir.Ama Sekil sınıfının kendisi kullanamaz.
    //obje oluşmaması ile interface extends edilim kullanmasıyla inherite benzer
    private String isim;

    public String getIsim() {
        return isim;
    }
    abstract void alan_hesapla();//soyut method interface sınıfındaki imza ile aynı mantıktur.Extends eden class mecbur overide etmesiyani implemnds metod yazmalı
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Sekil(String isim) {
        this.isim = isim;
    }
}
