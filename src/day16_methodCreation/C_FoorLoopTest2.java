package day16_methodCreation;
import java.util.Scanner;
public class C_FoorLoopTest2 {
    public static void main(String[] args) {
        /*
    Kullanicidan iki sayi isteyin.
    Girilen sayilar ve aralarindaki tum tamsayilari
    toplayip, sonucu yazdiran bir program yaziniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz :");
        int a=scan.nextInt();
        System.out.println("İkinci Sayıyı Giriniz :");
        int b=scan.nextInt();
        topla(a,b);
    }

    private static void topla(int a, int b) {
        int toplam =0;
        for(int i=a;i<=b;i++){
            toplam+=i;
            System.out.print(i+" ");
        }
        System.out.println("\nSayıların toplamı:"+toplam);
        System.out.println("İki Toplam:"+( a+b));
    }


}
