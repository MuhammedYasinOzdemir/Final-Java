package Interface;

public class Mühendis implements IMuhendis{//ımplemnts ederek methodları alırız.Ve ımplements ettiğimiz interface de methodları kullanmak zorundayız.
    private boolean askerlik;
    private boolean adlisicil;

    public Mühendis(boolean askerlik, boolean adlisicil) {
        this.askerlik = askerlik;
        this.adlisicil = adlisicil;
    }

    public boolean isAskerlik() {
        return askerlik;
    }

    public void setAskerlik(boolean askerlik) {
        this.askerlik = askerlik;
    }

    public boolean isAdlisicil() {
        return adlisicil;
    }

    public void setAdlisicil(boolean adlisicil) {
        this.adlisicil = adlisicil;
    }

    @Override
    public void askerlikSorgula() {
        if(askerlik){
            System.out.println("Askerliğimi yaptım");
        }
        else{
            System.out.println("Askerliğimi yapmadım");
        }
    }

    @Override
    public void adliSicilSorgula() {
        if(adlisicil){
            System.out.println("Adli sicilim bulunyor...");
        }
        else {
            System.out.println("Adli sicilim bulunmuyor");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisliğind eiş tecrübem");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalama="+derece;
    }
}
