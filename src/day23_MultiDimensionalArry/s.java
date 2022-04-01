package day23_MultiDimensionalArry;

import java.util.Scanner;

public class s {
    public static void main(String[] args) {
/*Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.

A=5

B=3

Ipucu: Dikdortgenin Cevresi : 2*(A+B);

Dikdortgenin Alani : A * B ;

Ornek Cikti:

Dikdortgenin Cevresi : 16

Dikdortgenin Alani : 15
?/


        int  A=5;
        int B=3;
        System.out.println("Dikdörtgenin Cevresi : " +(2*(A+B)));
        System.out.println("Dikdörtgenin Alani : " +(A*B));

        int a=22;
        int b=20;
        int c=30;
        int d=28;
        int e=50;

        System.out.println("Sayilarin Ortalamasi :"+(a+b+c+d+e)/5);

Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

int a= 3;

int b= 5;

Ornek Cikti:

a=5

b=3

        int a=3;
        int b =5;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

        Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

        System.out.println("Bir Sayi Giriniz:");
        Scanner scan=new Scanner(System.in);
        double sayi=scan.nextDouble();
        double sonuc=((sayi*sayi*sayi)/2);
        System.out.println(sonuc);

        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

                Ornek Cikti :
                Alan: 9
                Cevre: 12
   */
                System.out.println("Karenin bir kenar uzunluğunu Giriniz:");
    Scanner scan=new Scanner(System.in);
    int kenar =scan.nextInt();
    System.out.println("Alan:"+(kenar*kenar));
    System.out.println("Çevre:"+(4*kenar));


    }
}

