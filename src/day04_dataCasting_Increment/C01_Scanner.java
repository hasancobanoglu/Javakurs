package day04_dataCasting_Increment;
import java.util.Scanner;
public class C01_Scanner {

    public static void main(String[]args){
        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
        System.out.println("İsminizi Girin");
        Scanner scan= new Scanner(System.in);
        char ilkHarf=scan.next().charAt(0);
        System.out.println("Adinizin ilk harfi:"+ilkHarf);
       //charAt(index) method'u parametre olarak yazdigimiz index'deki char'i bize getirir
        // String'de index 0'dan baslar
        // E r s i n
    }


}
