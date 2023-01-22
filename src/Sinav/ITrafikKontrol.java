package Sinav;

public interface ITrafikKontrol {
    boolean ehliyet();
    boolean ruhsat();
    boolean kimlik();
   boolean kontrol() throws Exception;
}
