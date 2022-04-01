package day07_ifElseStatement;
import java.util.Scanner;


public class C03_TekCiftSayi {

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir tane Tam Sayı Girin :");
        int sayi=oku.nextInt();
        if (sayi %2==0) {
            System.out.println(sayi+" Sayısı Çift Sayıdır");
        }
        if(sayi%2!=0) {
            System.out.println(sayi + " Sayısı Tek Sayıdır");
        }
        /*else {
            System.out.println(sayi+" Sayısı Tek Sayıdır");
        }

         */
    }
}