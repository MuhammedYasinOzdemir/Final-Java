import java.util.ArrayList;

public class Araba2 {

        private String renk;//Baska yerden erişememeyi saglarız
        private int tekerlek;
        private    double motor;
        private String model;
    public void bilgileri_goster(){//Methodda tanımlanabilir
        System.out.println("Model:"+model+"\nMotor:"+motor+"\nTekerlek Sayısı:"+tekerlek+"\nRenk:"+renk);


    }
    public void setTekerlek(int tekerlek) {
        if (tekerlek>0)
            this.tekerlek = tekerlek;//degerin konttrollu sekilde değiştirilmessi yarar
        else
            System.out.println("Tekerlek sıfırdan kucuk olamaz...");
    }

    public void setMotor(double motor) {

        this.motor = motor;//this anahtar kelimesi objeyi temsil etmek için kullanılır motor yerine baska değişken girilseydithise gerek yoktu
    }

    public int getTekerlek() {
        return tekerlek;
    }

    public double getMotor() {
        return motor;
    }

    public String getRenk() {
        return renk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }
}
