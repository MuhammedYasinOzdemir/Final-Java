package Text_IO.Collection;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class hascodeAndequalsmetedokullanma {
    public static class Player{
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
            Player player = (Player) o;
            return id == player.id && Objects.equals(isim, player.isim);
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
        ArrayList<Player> playerler=new ArrayList<>();
        Random rnd=new Random();
        for(int i=0;i<10;i++)
            playerler.add(new Player("Yasin",rnd.nextInt(20)));
        for(int i=0;i<10;i++)
            System.out.println(playerler.get(i).toString());
        System.out.println("**********************\n");
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
            {
                if(playerler.get(i).equals(playerler.get(j)))
                    System.out.println(playerler.get(i));
            }
    }
}
