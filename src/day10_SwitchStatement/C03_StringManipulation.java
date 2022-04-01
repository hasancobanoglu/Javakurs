package day10_SwitchStatement;
import java.util.Scanner;
public class C03_StringManipulation {
    public static void main(String[]args){
        String str1="Java";
        String  str2="Candır";
        Scanner scan=new Scanner(System.in);
        System.out.println(str1+" "+str2);
        String cumle=str1.concat(str2);//Yapıştıırma yapar
        cumle=str1.concat(" ").concat(str2);//concatination için ikinci ihtimal burda
                                                   // string classından gelen concati kullandık
       //concat methodu içine string parametre ister
       //string dişinda bir değer yazmalk için onu stringe getirmeliyiz yani
       //cumle =str1.concat(""+%);
    }
}
