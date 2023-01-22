import java.util.Objects;

public class ComparatoEquals {
    public static class Kisi implements Comparable<Kisi> {
        private int id;
        private String isim;

        public Kisi(int id, String isim) {
            this.id = id;
            this.isim = isim;
        }

        @Override
        public int compareTo(Kisi kisi){
            if(kisi.id>this.id)
                return 1;
            else if (kisi.id<this.id) {
                return -1;
            }
            else
                return 0;
        }
        @Override
        public boolean equals(Object o){
            if(o==this)
                return true;
            else{
                return Objects.equals(this.isim,o);
            }

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }
    }
}
