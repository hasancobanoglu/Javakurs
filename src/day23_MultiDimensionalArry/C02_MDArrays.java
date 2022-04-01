package day23_MultiDimensionalArry;

import java.util.Arrays;

public class C02_MDArrays {
    public static void main(String[] args) {
        //verilen mda elemenkerinin toplamını bulunuz
        int arr[][]={{3,1,7},{6,10,2}};
        int toplam=0;
        for (int i=0;i<arr.length; i++){
           System.out.println(Arrays.deepToString(arr));

           for (int j=0;j<arr[i].length;j++){//burda önemli olan ikinci for nerden başlayacağı
               // oda İ nin arrayinden başlayacak ve burda ıknci onemde aoutr arrayin 2 arayi var
               //içerdeki childeların ise 1 cini 3 elementi 2.nin 2 elementi
              toplam+=Integer.valueOf(arr[i][j]);
          }
        } System.out.println(toplam);
    }
}
