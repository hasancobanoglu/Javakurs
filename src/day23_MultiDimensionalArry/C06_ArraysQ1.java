package day23_MultiDimensionalArry;

import java.util.Arrays;

public class C06_ArraysQ1 {
    public static void main(String[] args) {

            int arr[][]={{1,2,3},{4,5,6}};
        int carpım=1;


        for (int i=0;i<arr.length; i++){
           for (int j=0;j<arr[i].length;j++){

               //burda önemli olan ikinci for nerden başlayacağı
                // oda İ nin arrayinden başlayacak ve burda ıknci onemde aoutr arrayin 2 arayi var
                //içerdeki childeların ise 1 cini 3 elementi 2.nin 2 elementi

                carpım*=Integer.valueOf(arr[i][j]);
            }
        } System.out.println(carpım);

    }

}
