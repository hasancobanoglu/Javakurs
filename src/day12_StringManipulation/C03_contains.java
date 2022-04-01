package day12_StringManipulation;
import java.util.Scanner;
public class C03_contains {
    public static void main(String args[]) {

        //Scanner scan=new Scanner(System.in);
        //String mail=scan.nextLine();
        //Her defasında scanner objesi ile veri almaya gerek yok input olarak bir
        //Stringi biz verebiliriz
        String email="mulkiyeayboy@hotmail.com";
        String arananMetin="@gmail.com";
        if(!email.contains(arananMetin)){
            System.out.println("arananMetin = " + arananMetin);
        }


    }
}
