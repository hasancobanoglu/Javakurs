package day18_nestedForLoop;

import java.util.Scanner;

public class C04_NestedHc {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       // System.out.println("10'dan kucuk pozitif bir tamsayi girin");
        char input='F';

        for (char i = 'A'; i <= input; i++) {
            System.out.println(" ");
            for (char j = 'A'; j <=i; j++) {
                System.out.print(j+" ");
            }
          //System.out.println("");

        }
    }
}
