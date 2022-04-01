package day16_methodCreation;
import java.util.Scanner;
public class C04_ForLoop {
    public static void main(String[] args) {

        //for (int i = 0; i < 5; i++) {
       //  System.out.print(i);
       // Verilen Stringi tersden yazdır
        Scanner scan = new Scanner(System.in);
        System.out.println("Ters çevirilecek stringi girin");
        String girilen=scan.nextLine().toUpperCase();

        cevir(girilen);
    }

    private static void cevir(String girilen) {

        for(int i=girilen.length()-1;i>=0;i--){
            System.out.print(girilen.substring(i,i+1));
        }

    }
}
