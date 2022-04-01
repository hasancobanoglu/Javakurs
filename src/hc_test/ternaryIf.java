package hc_test;

import java.util.Scanner;

public class ternaryIf {
    public static void main(String[] args) {
         /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz = ");
        String adSoyad = oku.nextLine();

        // Ahmet Yılmaz    substring(başlangıç index, e kadar - dahil değil)


        String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
        String Soyad = adSoyad.substring(adSoyad.indexOf(" ")+ 1);

        System.out.println("ad = " + ad);       //ad = kader
        System.out.println("Soyad = " + Soyad); //Soyad = Esen
    */

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Adınız: ");
        String ad = oku.nextLine();
        System.out.print(ad);
        //String sonuc= ad.length()==3?
         //       ((ad.charAt(0)==ad.charAt(1)&&ad.charAt(0)==ad.charAt(2))?"aynı " :"3harf gir";
        //System.out.println(sonuc);

  /*      if (ad.length() != 3) {
            System.out.print("lütfen 3 karakterli kelime giriniz");
        } else if (ad.charAt(0) == ad.charAt(1) && ad.charAt(0) == ad.charAt(2)) {
            System.out.println("aynı");
        }else {
            System.out.println("farklı");
        }
*/
    }}
