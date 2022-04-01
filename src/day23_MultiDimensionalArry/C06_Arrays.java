package day23_MultiDimensionalArry;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //verilen bir arraya yaeni eleman ekleme

        int arr[]={3,5,7};
         int eklenecekElement= 4;
        arr=arrayeElamanEkle(arr,eklenecekElement);
        System.out.println(Arrays.toString(arr));
    }
//Arraylere normal yollardan ekleme olmaz çozumu yeni bir array oluşturulacak ve eski aray buraya taşınacak
    private static int[] arrayeElamanEkle(int[] arr, int eklenecekElement) {
        int yeniArray[]=new int [arr.length+1];

        for(int i=0;i<arr.length;i++){
        yeniArray[i]=arr[i];
        }
        yeniArray[yeniArray.length-1]=eklenecekElement;
        return yeniArray;
    }
}
