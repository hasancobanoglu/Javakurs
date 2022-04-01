package day05_operatorler;
import java.util.Scanner;
public class yildiz {

           public static void main(String args[])
        {
            System.out.println("Alt alta kaç sıra olsun ? ");
            Scanner inp = new Scanner(System.in);
            int sira = inp.nextInt();

            for (int i=1; i<=sira; i ++)
            {
                for (int j=0; j<i; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }



        }
    }

