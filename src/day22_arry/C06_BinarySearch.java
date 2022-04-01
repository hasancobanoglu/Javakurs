package day22_arry;

import javax.management.openmbean.ArrayType;
import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6,1,9, 45, 25, 9, 0};
        int istenenSayi = 1;
        //Arraydeki elamanın istenen indexini verir
        // mutlaka once sort yapılmalı sonra binary search

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,istenenSayi));
        //Bu varolan bir elaman için
        // 2verir çünkü arayi sort yaptı ve 3 ü sırada verdi
        System.out.println("Varolmayan eleman");
        //olmayan elamanı aratırsak - döner
        // Java bulamadigini gostermek icin - isareti koyar
        // sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir


    }
}
