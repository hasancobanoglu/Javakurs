package day06_Concatenation_Operator.day09_ternary_switch;
import java.util.Scanner;
public class Q16 {
    public static void main(String[]args){
    /* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
    int num1
    int num2
    int num3
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üç SAyı Giriniz:");
        System.out.println("Birinci Sayı:");
        int num1=scan.nextInt();
        System.out.println("İkinci Sayı:");
        int num2=scan.nextInt();
        System.out.println("Üçüncü Sayı:");
        int num3=scan.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("SAyılar:"+num1+""+num2+""+num3+"\n büyük sayi"+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("SAyılar:"+num1+""+num2+""+num3+"\n büyük sayi"+num2);
        }else{
            System.out.println("SAyılar:"+num1+""+num2+""+num3+"\n büyük sayi"+num3);
        }

    }
}
