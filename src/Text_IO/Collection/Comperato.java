package Text_IO.Collection;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Comperato {
    //karşılaştırma da kullanırlır equalsdan farkı equals eşitse trure deüilse false
    //Bu ise harfe göre veya sayıya göre yapabilir
    //Comperable<E> implemnt etmeli
    //sort sıralamssı buna göre sıralar

    public static class Player implements Comparable<Player>{//implement edilmeli,
        String isim;



        int id;

        public Player(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            hascodeAndequalsmetedokullanma.Player player = (hascodeAndequalsmetedokullanma.Player) o;
            return id == player.id && Objects.equals(isim, player.isim);
        }
        public int compareTo(Player o) {//id ye göre karşılastırır
            if(this.id>o.id)
                return 1;
            else if (this.id<o.id) {
                return -1;
            }
            return 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(isim, id);
        }

        @Override
        public String toString() {
            return "Player{" +
                    "isim='" + isim + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
    public static void main(String [] args){
        ArrayList<Comperato.Player> playerler=new ArrayList<>();
        Random rnd=new Random();
        for(int i=0;i<10;i++)
            playerler.add(new Comperato.Player("Yasin",rnd.nextInt(20)));
        for(int i=0;i<10;i++)
            System.out.println(playerler.get(i).toString());
        System.out.println("********************** Comparable ************************\n");
        Collections.sort(playerler);//list interfacesini sıralar
        for(int i=0;i<10;i++)
            System.out.println(playerler.get(i).toString());
    }
}
