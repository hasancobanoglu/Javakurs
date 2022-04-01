package day17_forLoop;
import java.util.Scanner;

public class C06_FoorLoop {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        //         1’den baslayarak girilen sayiya kadar(sayi dahil) 3’un kati olan sayilari yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Yüzden Küçük Sayı Gir");
        int sayi = scan.nextInt();
        if (sayi < 0 || sayi > 100 || sayi == 0) {
            System.out.println("İstenilen aralıkta değil");
        } else {
            for (int i = 1; i <= sayi; i++) {
                if(i%3==0)
                    if(i<sayi){
                        System.out.print(i + ",");//sayının sonundaki virgülü kaldırma
                    }else {
                        System.out.println(i);
                    }
            }
        }
    }}




