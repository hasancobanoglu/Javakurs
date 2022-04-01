package day18_nestedForLoop;

import java.util.Scanner;

public class C03_NestedFoorLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("10'dan kucuk pozitif bir tamsayi girin");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
        //Yukardaki tek yıldız ucgen çizer bunuda eklersek tersden çizer
        for (int i = 1; i <= sayi-1; i++) {
            System.out.println(" ");
            for (int j = 1; j <=sayi- i; j++) {
                System.out.print("* ");
            }
        }
    }
}

