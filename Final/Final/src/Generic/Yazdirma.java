package Generic;

public class Yazdirma<E> {//generic sınıf olusturma yontemi
    //E Veri tipini temsil eder türden bağımsız bir şekilde E gelen veri tipine göre yazdırma yapılır
    public void Yazdir(E[] dizi){
        for(E eleman:dizi)
            System.out.println(eleman);
    }
}
