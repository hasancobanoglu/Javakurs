package day04_dataCasting_Increment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class hc_arrylist {
    public static void main(String[] args) {
        ///---> Generic ArrayList Tanımlamasını Gerçekleştirdik <---\\\
        List<Integer> myList = new ArrayList<>();
        ///---> ArrayList Üzerine Eleman Ekleyerek Metotlarımızı Test Edelim. <---\\\
        myList.add(5);
        myList.add(myList.get(0) * 3);
        myList.add(myList.get(1) * 2 + 50);
        myList.add(-myList.get(2));
        myList.add(myList.get(2) * myList.get(0));
        myList.add(-490+ myList.get(1)*5);
        ///---> ArrayList Üzerindeki Elemanlarımızı Yazdıralım <---\\\
        System.out.print("----------------------\n-> Oluşturulan ArrayList Elemanları: ");
        for(int i: myList)
            System.out.print("["+i+"]");
        System.out.println("\n----------------------");
        ///---> Metot Denemeleri <---\\\
        Collections.sort(myList); //--> Oluşturduğumuz Listeyi Küçükten Büyüğe Sıraladık.
        System.out.print("-> Sıralanan ArrayList Elemanları: ");
        for(int i: myList)
            System.out.print("["+i+"]");
        System.out.println("\n----------------------\n-> ArrayList Üzerinde Bulunan Eleman Sayısı (Count): "+myList.stream().count()+"\n----------------------");
        myList.remove(2); //--> 2. İndiste Yer Alan Değeri Sildik.
        myList.remove(4); //--> 5. İndiste Yer Alan Değeri Sildik.
        System.out.print("-> Elemanlar Silindikten Sonra ArrayList Düzeni: ");
        for(int i: myList)
            System.out.print("["+i+"]");
        System.out.println("\n----------------------\n-> Kalan Eleman Sayısı (Size): "+myList.size());
        myList.clear(); //--> Liste Üzerindeki Elemanları Temizliyoruz.
        System.out.println("----------------------\n-> Clear Metodundan Sonraki Eleman Sayımız: "+myList.size()+"\n----------------------");
    }
}
