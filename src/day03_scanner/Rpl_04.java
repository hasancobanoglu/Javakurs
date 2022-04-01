package day03_scanner;

import java.util.Scanner;

public class Rpl_04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Günde Kaç adet çay içiyorsun:");
        int  cay=scan.nextInt();
        System.out.println("Günde Kaç adet şeker kullanıyorsun:");
        int  seker=scan.nextInt();
        int yil=365;
        double birSkr=1.7;
        double toplam=(seker*birSkr);
        System.out.println("Yılda "+(yil*toplam/100)+" kg şeker kullanıyor.");
    }
}
