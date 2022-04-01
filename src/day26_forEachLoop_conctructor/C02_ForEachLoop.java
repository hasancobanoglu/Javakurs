package day26_forEachLoop_conctructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        //10 elemanlı bir list olusturalım
        int arr[]={2,5,4,6,4,9,7,1,3,10};
        //böyle bir durumda önce aray olusturup onuda for each ile bir liste kolay bir şekilde oluştururz
        List<Integer> sayilar=new ArrayList<>();
        for (int each:arr){
            sayilar.add(each);
        }
        System.out.println(sayilar);

        //3 bölünemeyen sayilar için for each ile
        for (int each:sayilar
        ) {
            if (each%3!=0){
                System.out.print(each+" ");
        }
    }
}}


