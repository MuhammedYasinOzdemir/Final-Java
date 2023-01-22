package Polymorphism;

public class Beyblade_Fabrikası {
    public Beyblade beybladeUret(String b) {//drogan vs beybled sınıfın alt sınıfı olduğu için Beyble donustipi olabilr
        //Buna polimrps denir
        if (b.toLowerCase().equals("dragon")) {
            return new Dragon("Takao", 802, 500, "Mavi ejderya", "Kutsal canvarla konusma");
        } else if (b.toLowerCase().equals("dranza")) {
            return new Dranza("Kai", 600, 400, "Kırmızı anka kusu");
        } else if (b.toLowerCase().equals("drayga")) {
            return new Dranza("Rei", 400, 600, "Beyaz kaplan");
        }
        else if (b.toLowerCase().equals("draciel")) {
            return new Dranza("Max",600,1000,"Kırmızı anka kusu");
        }
        else
            return null;//hiç birşey donmuyorum anlamında
    }
}

