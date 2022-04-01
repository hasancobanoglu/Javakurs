package day06_Concatenation_Operator.day09_ternary_switch;

import java.util.Scanner;

public class Odev_2 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        // int a,b,islem;
        System.out.println("Lutfen İki Tam Sayı Giriiniz:");
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci Sahyi");
        int a=scan.nextInt();
        System.out.println("İkinci Sayi");
        int b=scan.nextInt();
        System.out.println("İşlem Seç");
        System.out.println("Toplama=1"+"\n" +"Çıkarma=2"+"\n"+"Bolme=3"+"\n"+"Çarpma=4");
        Scanner islem=new Scanner(System.in);
        int sec=scan.nextInt();
        String sonuc=(sec==1? "Toplam"+(a+b) :  "Çkar"+(a-b) );
        System.out.println(sonuc);

    }
}

