package day07_ifElseStatement;
import java.util.Scanner;
public class C10_Odev {
    public static void main(String[]args){
        System.out.println("Üçken Çeşidi bulma:");
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Kenar:");
        int a=scan.nextInt();
        System.out.println("2. Kenar:");
        int b=scan.nextInt();
        System.out.println("3.Kenar:");
        int c=scan.nextInt();
        if(a==b && b==c){
            System.out.println("üçgen eşkenar üçgendir");
        }else if(a==b||b==c||a==c){
            System.out.println("ikizkenar");
        }else {
            System.out.println("Çeşitkenar");
        }

    }
}
