package day07_ifElseStatement;
import java.util.Scanner;
public class C08_HaftaninGunleri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen haftanın günlerinin ilk harfiyle başlayan bir harf yazın ; ");
        String a = scanner.next().toUpperCase();

        if(a.equals("P")){
            System.out.println("Pazartesi, Perşembe, Pazar ");
        } else if(a.equals("S")){
            System.out.println("Salı ");
        } else if(a.equals("Ç")){
            System.out.println("Çarşamba ");
        } else if(a.equals("C")){
            System.out.println("Cuma, Cumartesi ");
        } else {
            System.out.println("Geçersiz Harf Girdiniz ");
        }

    }
}
