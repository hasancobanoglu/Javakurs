package day12_StringManipulation;
import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        //kullanıcıdan isim -soyisim bilgisini al
        //bütün harfleri * yap
        Scanner scan= new Scanner(System.in);
        System.out.println("********Lütfen İsim Soyİsim gir**********");
        String isim=scan.nextLine();
        System.out.println(isim.replaceAll("\\S","*"));
    }
}
