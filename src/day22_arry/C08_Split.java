package day22_arry;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {
        //Vrilen cümlede istenen harfin kaç defa kullanıldığını yazdıran metod
        String cumle="Nerede o 'hello world' yazdiramayan ogrenciler";
        String harf="e";
        harfKacKereKullanilmis(cumle,harf);

    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {
        int sayac=0;
        String harfler[]=cumle.split("");
        System.out.println(Arrays.toString(harfler));
        for(int i = 0; i < cumle.length(); i++) {
            if(harfler[i].equals(harf)) {
                sayac++;
            }
        }
        System.out.println("Harf:"+harf+" "+sayac+"tane");


    }
}
