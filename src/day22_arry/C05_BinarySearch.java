package day22_arry;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6,1,9, 45, 25, 9, 0};
        int istenenSayi = 14;//istenen elamanın varlığı true falsee methodal
        istenenElemanVarmi(arr, istenenSayi);
        //,eğer javada binary search ile yaparsak
        //once sort sonra binary serach yapmalıyız

    }

    private static void istenenElemanVarmi(int[] arr, int istenenSayi) {
        boolean sonuc=false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenenSayi){
               sonuc=true;
               break;
            }
        }
        System.out.println(sonuc);
    }

}