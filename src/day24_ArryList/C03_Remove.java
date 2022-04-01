package day24_ArryList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);
        sayilar.add(2,7);
        System.out.println(sayilar);
        sayilar.remove(3);

        //Sayılardan oluşan bir listede element silme methodu çalışmaz
        //sayi değeri girdiğimizde Javas otomatik olarak sayiyi index oalrak kabl edere
        System.out.println(sayilar);
        //int sayi =5;
        //sayilar.remove(sayi); hata verir çünkü bu primitive
        Integer sayi=5;//Burda Integer bir objedir wrapper clası kullandık sayı obje oldu ve remove çalışatı
        sayilar.remove(sayi);
        System.out.println(sayilar);
    }
}
