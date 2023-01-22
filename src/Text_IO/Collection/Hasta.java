package Text_IO.Collection;

import org.jetbrains.annotations.NotNull;

    public  class Hasta implements Comparable<Hasta>{
        String isim;
        String acild;

        public Hasta(String isim, String acild) {
            this.isim = isim;
            this.acild = acild;
        }

        @Override
        public int compareTo(@NotNull Hasta o) {
            if(this.acild.equals("Kırmızı"))
                return 1;
            else if (this.acild.equals("Sarı")) {
                return 0;
            } else if (this.acild.equals("Yeşil")) {
                return -1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "Hasta{" +
                    "isim='" + isim + '\'' +
                    ", acild='" + acild + '\'' +
                    '}';
        }
    }

