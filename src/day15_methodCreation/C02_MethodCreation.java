package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
         // Kullanıcıdan bir kelime isteyin. Eğer kelime 3 harften kısa ise "Kelime çok kısa" yazdırın
        // Eğer kelime 3,4 veya 5 harfli ise harf sayısını ve kelimenin tersten yazılışını yazdırın
        // Eğer 5 harften uzunsa "Kelime çok uzun" yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime = scan.next();
        String tersKelime = "";
        if (kelime.length() < 3) {
            System.out.println("Kelime çok kısa");
        } else if (kelime.length() <= 5) {
            if (kelime.length() == 3) {
                tersKelime = kelime.substring(2) + kelime.substring(1, 2) + kelime.substring(0, 1);

            } else if (kelime.length() == 4) {
                tersKelime = kelime.substring(3) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);

            } else {
                tersKelime = kelime.substring(4) + kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);

            }
            System.out.println("Kelimedeki harf sayısı : " + kelime.length());
            System.out.println("Kelimenin tersten yazılışı : " + tersKelime);


        } else {
            System.out.println("Kelime çok uzun");
        }

    }
}
