package day08_ifElseStatement;
import java.util.Scanner;
public class C02_NotuHarfeCevirme {
    public static void main(String[]args) {
        System.out.println("Not Gir");
        Scanner oku = new Scanner(System.in);
        double not = oku.nextDouble();
        if (not < 0 || not > 100) {
            System.out.println("Geçerli 0-100 arası sayı gir");
        } else if (not < 50) {
            System.out.println("D");
        } else if (not < 60) {
            System.out.println("C");
        } else if (not < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }}