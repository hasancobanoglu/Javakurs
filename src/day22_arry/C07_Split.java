package day22_arry;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {
        String str="Java gün geçtikce güzelleşiyor";
        //str.split(" ",4);
        System.out.println(str.split(""));
        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        String kelime[]=str.split("geçtikce");
        System.out.println(Arrays.toString(kelime));
        String harf[]=str.split("");
        System.out.println(Arrays.toString(harf));
    }
}
