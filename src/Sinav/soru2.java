package Sinav;

import java.util.Random;

public class soru2 {
    public static void main(String[] args){
    Random rnd=new Random();

    int[] array=new int[20];
    int max,temp;
    max=temp=0;
    for(int i=0;i<array.length;i++) {
        array[i] = rnd.nextInt(100);
        System.out.print(array[i]+"  ");
    }
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length-1;j++){
            if (array[j+1]>array[j]) {
                temp=array[j+1];
                array[j+1]=array[j];
                array[j]=temp;
            }
        }

    }
        System.out.println("\n");
    for(int i=0;i<array.length;i++)
        System.out.print(array[i]+"  ");

    }
}
