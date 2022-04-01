package day18_nestedForLoop;
import java.util.Scanner;
public class C08_F0rLoopVsWhile {
    public static void main(String args[]){
        int sayi = (int)(Math.random() * 101); //0 ile 100 arasında sayı üretir
        Scanner input = new Scanner(System.in);
        int tahmin = -1; //0 ile 100 arasında olmaması için -1
        int deneme=0;
        while(sayi != tahmin){ // sayı tahmine eşit olmadığı sürece true dönecek
            // aksi halde Sayı  eşit olduğunda false dönecek ve döngüye girmiyecek
            deneme++;
            System.out.print("***Tahmini Sayınızı Giriniz****");
            tahmin = input.nextInt(); // Sayıyı alıyoruz

            if(tahmin == sayi){
                System.out.print("Doğru :) ");
            }else if(tahmin > sayi){
                System.out.println("Azaltarak Deneyin");
            }else{
                System.out.println("Artırarak Deneyin");
            }

        }
        System.out.println(deneme+" .Denemede Buldunuz");


    }
}

