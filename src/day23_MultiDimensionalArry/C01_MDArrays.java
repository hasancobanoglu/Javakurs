package day23_MultiDimensionalArry;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);//7
        System.out.println((arr[1][1]));//10
        //il inner arryin tüm ellemanları
        System.out.println(arr[0]);//
        System.out.println(Arrays.toString(arr[0]));
        
        //MDA da tüm elamanları görmek istersek Arrays.deepToString methodunu kullanmalı
        System.out.println("arr = " + Arrays.deepToString(arr));
    }
}
