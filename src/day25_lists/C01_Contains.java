package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
    harfler.add("D");
    harfler.add("M");
    harfler.add(1,"T");
    harfler.add(0,"T");

        System.out.println(harfler);
    //Dizide T harfi varmı nasıl bakacağız
        System.out.println(harfler.contains("T"));//Bu işlem bize true değerini verie varsa
        System.out.println(harfler.contains("F"));
        List<String> karekterler=new ArrayList<>();
        karekterler.add("M");
        karekterler.add("T");
        System.out.println(harfler.containsAll(karekterler));//Bir listenin tamamı karekterlerin tümü varmı harflerde varmı diye bakıyoruz
        karekterler.add("F");
        System.out.println(harfler.containsAll(karekterler));
    }

}
