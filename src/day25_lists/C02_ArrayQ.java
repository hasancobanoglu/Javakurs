package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayQ {
    public static void main(String[] args) {
       //verilen bir arayden istenen elementi silip
        //kalanları yeni bir aray oalrak yazdıran method;
        //1. adim istenmeyen elementi sayacak(kaç tane var)
        // 2. adim yeni array olustur
        //3. adim eski array'den uygun elementleri yeniye taşi
        // 4. adim bunu yazdir.

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyenEleman=3;
        istenmeyenElementiSiler(arr,istenmeyenEleman);

    }

    private static void istenmeyenElementiSiler(int[] arr, int istenmeyenEleman) {
        int sayac=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]==istenmeyenEleman){
                sayac++;
            }
        }
        //yeni aray
        int arrYeni[]=new int[arr.length-sayac];
        //
        int index=0;

    }
}
