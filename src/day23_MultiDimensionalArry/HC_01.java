package day23_MultiDimensionalArry;

import com.sun.jdi.IntegerValue;

public class HC_01 {
    //İki boyutlu bir dizinin elemanlarını elde etmek için iç içe for döngüsü kullanabiliriz.

    public static void main(String[] args) {
        int[][] numaralar= { {1, 2, 3, 4}, {5, 6, 7} };
        int toplam=0;
        int carpim=1;

        for (int i = 0; i < numaralar.length; ++i) {
            for(int j = 0; j < numaralar[i].length; ++j) {
                System.out.print(numaralar[i][j]);
                toplam+=Integer.valueOf(numaralar[i][j]);
            }
            System.out.println(toplam);

        }
    }
}
