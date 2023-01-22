package Kalitim.Calisana;

import java.util.ArrayList;
import java.util.Scanner;

public class Yonetici2 extends Calisan2{
    private int sorumlu_kisi;
    private ArrayList<Yazilimci> calisanlar=new ArrayList<>();

    public Yonetici2(String isim, double maas, String departman, int sorumlu_kisi) {
        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;

    }
    public void calisanlari_goster(){
        for(int i=0;i<calisanlar.size();i++){
            System.out.println((i+1)+".");
            calisanlar.get(i).bilgileri_goster();
            System.out.println();
        }
    }
    public void calisan_ekle(){
        Scanner scn=new Scanner(System.in);
        System.out.print("İsim:");
        String isim= scn.nextLine();
        System.out.print("Departman:");
        String departman=scn.nextLine();
        System.out.print("Maas:");
        double maas=scn.nextDouble();
        ArrayList<String> a=new ArrayList<>();
        Yazilimci c=new Yazilimci(isim,maas,departman,a);

        calisanlar.add(c);
        sorumlu_kisi+=1;
        System.out.println("Çalışan eklendi...");
    }
    public void calisan_sil(){
        calisanlari_goster();
        Scanner scn =new Scanner(System.in);
        System.out.println("İsim giriniz silmek istediğniz");
        String isim=scn.nextLine();
        int c=0;
        for (int i=0;i<calisanlar.size();i++){
            if(calisanlar.get(i).getIsim().equals(isim)){
                calisanlar.remove(i);
                c=1;
                sorumlu_kisi-=1;
                System.out.println("Çalışan silindi basarıyla");
                break;
            }
        }
        if (c==0)
            System.out.println("Çalışan bulunamadı...");
    }
    public void calisan_bilgi_degistir(){
        calisanlari_goster();
        Scanner scn=new Scanner(System.in);
        System.out.print("İsim giriniz:");
        String isim=scn.nextLine();
        for (int i=0;i<calisanlar.size();i++){
            if(calisanlar.get(i).getIsim().equals(isim))
            {
                while (true) {
                    System.out.print("""
                                    1-Departman değiştir
                                    2-Dil ekle
                                    3-Maas değiştir
                                    4-Çıkış
                                    
                            secim:""");
                    String a = scn.nextLine();
                    if (a.equals("1")) {
                        System.out.print("Yeni departman:");
                        String b = scn.nextLine();
                        calisanlar.get(i).departman_degis(b);
                        System.out.println("Departman değişti...");
                    } else if (a.equals("2")) {
                        calisanlar.get(i).dil_ekle();
                    } else if (a.equals("3")) {
                        System.out.print("Eski maas:"+calisanlar.get(i).getMaas()+"\nYeni maas:");
                        double maas=scn.nextDouble();
                        calisanlar.get(i).setMaas(maas);
                        System.out.println("Maas degisti.");
                    } else if (a.equals("4")) {
                            break;
                    } else {
                        System.out.println("Hatalı kodlama..");
                    }

                }
            }
        }
    }
    public void is_ver(){
        calisanlari_goster();
        Scanner scn=new Scanner(System.in);
        System.out.print("İsim giriniz:");
        String isim=scn.nextLine();
        for (int i=0;i<calisanlar.size();i++){
            if(calisanlar.get(i).getIsim().equals(isim))
            {

                    System.out.print("""
                                    1-format at
                                    2-bakım yap
                                    
                            secim:""");
                    String a = scn.nextLine();
                    if (a.equals("1")) {
                        System.out.print("İsletim sistemi:");
                        String isletim_sistemi=scn.nextLine();
                       calisanlar.get(i).format_at(isletim_sistemi);
                    } else if (a.equals("2")) {
                       calisanlar.get(i).bakim_yap();
                    } else {
                        System.out.println("Hatalı kodlama..");
                    }

                }
            }
    }

    public int getSorumlu_kisi() {
        return sorumlu_kisi;
    }

    public void setSorumlu_kisi(int sorumlu_kisi) {
        this.sorumlu_kisi = sorumlu_kisi;
    }

    public ArrayList<Yazilimci> getCalisanlar() {
        return calisanlar;
    }

    public void setCalisanlar(ArrayList<Yazilimci> calisanlar) {
        this.calisanlar = calisanlar;
    }
}
