package day06_Concatenation_Operator.day09_ternary_switch;
import java.util.Scanner;
public class C01_NestedIfElse {
    public static void main(String[]args){
        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        // bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        // çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen dört basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();

        if(sayi<1000 ||sayi>9999){          //4 basamaklı değilse istenmeyen durumumn tespiti
            System.out.println("4 basamaklı sayı gir:");

        }else if(sayi%5==0){                     //4 basamaklı ve sayi 5 tam bölünuyor
                if(sayi%10==0){//4basamaklı ve 5 ile bölnebilen ve son rakamı 0 olan
                    System.out.println("5e bölünen çift sayı");
                }else{
                    System.out.println("5 e bölünen tek sayi");
                }

        }else{//4 basamaklı ve sayi 5 tam bölünemiyor
            System.out.println("Tekrar dene");
        }


    }
}
