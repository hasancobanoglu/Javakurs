package day23_MultiDimensionalArry;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        //Kullanıcıya kac elementlik bir array olusturacağımı sor arrayi olustur
        //kullanıcıdan al arrye ata
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç boyutlu dizi istiyorsunuz:");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];//Burası boş arayin olustuğu yer sanalda

        for (int i=0;i<uzunluk; i++){
            System.out.println("Array için "+(i+1 +".elamanı girini"));
            arr[i]=scan.nextInt();//girilen elamanları geçii araye alırız
        }
        System.out.println(Arrays.toString(arr));

    }
}
