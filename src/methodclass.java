public class methodclass {
    private String renk;
    private int tekerlek;
    private  double motor;
    private String model;

    public String getModel() {
        return model;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public double getMotor() {
        return motor;
    }

    public int getTekerlek() {
        return tekerlek;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setTekerlek(int tekerlek) {
        if (tekerlek<6)
           this.tekerlek = tekerlek;
        else
            System.out.println("tekerlek sayısı 6 dan fazala olamaz");
    }
}
