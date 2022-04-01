package day10_SwitchStatement;
import java.util.Locale;
import java.util.Scanner;
public class C04_charAt {
    public static void main(String[]args){
        //Stringde herhangi bir karektei almak istediğimizde oharfin indexini kullsnarak
        //str.charAT(istenenIndex)yazabiliriz
        String str="Java Çok Güzel";
        System.out.println(str.charAt(0));//Stringde index 0 dan başlar ilk başlangıç Sıfırdan
        //G yi yazdıralım
        System.out.println("str.charAt(9) = " + str.charAt(9));
        System.out.println("str.toUpperCase().charAt(2)+str.charAt(3) = " + str.toUpperCase().charAt(2)+str.charAt(3));
    //Son harfi yazdırma bu max index den  -1 çıkarsa son harfa gideriz tersden baktık
    //Stringde 14 harf var son harfin indexi 14-1 son harfi yazdıracaksak 14-1 yaparız
        System.out.println("str.charAt(14-1) = " + str.charAt(14-1));
        //Eğer stringin uzunluğunu index olarak girersek java çalışınca hata verir indexin dişinda diye


    }
    
}
