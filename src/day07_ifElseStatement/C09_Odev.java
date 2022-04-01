package day07_ifElseStatement;
import java.util.Scanner;
public class C09_Odev {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("1.Kenar:");
        int birKnr= scan.nextInt();
        System.out.println("2.Kenar:");
        int ikiKnr=scan.nextInt();
        System.out.println("3.Kenar:");
        int ucKnr=scan.nextInt();
        System.out.println("4.Kenar:");
        int dortKnr=scan.nextInt();

        if(birKnr==ikiKnr && ikiKnr==ucKnr)
            System.out.println("Kare");
        else if(birKnr==ucKnr && ikiKnr==dortKnr) {
            System.out.println("Diktorgen");
            }
        else{
            System.out.println("yamuk gibi bir şey");
        }

    }}

