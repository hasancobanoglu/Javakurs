package day23_MultiDimensionalArry;

import java.util.Arrays;
import java.util.Scanner;

public class C07_MDArraysQ5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Cümle gir");
        String cumle=scan.nextLine();
        String arr[]=cumle.split(" ");//split ile kelimedeki boşlukları alarak kelimeleri böldük
        System.out.println(Arrays.toString(arr));
        System.out.println("Kelime sayısı"+arr.length);

    }
}
