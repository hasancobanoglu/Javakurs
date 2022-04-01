package day23_MultiDimensionalArry;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //verilen bir arrye yeni bir element ekleyen bir method oluşturun
       int arr[]={3,5,7};
       //arr[3]=8;  //diziye bir ekleme yapamayız buşekilde java buna itiraz etmez
        //ama runtime da bunu görür ve boyutuna bakar arayin dişinda ise hata verir
        // arr={1,3,5,6};//Böyle bir atama yada hata verir varolan bir araya aynı boyutta bile
        //olsa yeni bir değer artayamayız
        //ama  varolan arr ye new ile yeni bir aray atarız eski yok olur

        arr=new int[4];
        System.out.println(Arrays.toString(arr));

        int arrYeni[]=new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));
        arrYeni[0]=2;
        arrYeni[3]=5;
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        //Bir arayde içinde elemnların olduğu yeni bir değer atamak isterseniz bunu
        //{1,2,3} şeklinde değil new int[3] diyerek oluşturup
        //sonra ona değer atayarak yapabiliriz
      int  arrEnyeni[]={1,2,3,4,5};
      arr=arrEnyeni;
        System.out.println(Arrays.toString(arr));

    }
}
