package hc_test;

import java.util.Scanner;

public class ifTernary {
    public static void main(String[] args) {
        System.out.println("Kilonuzu giriniz");
        Scanner scan=new Scanner(System.in);
        double kilo= scan.nextInt();
        System.out.println("Boyunuzu giriniz");
        double boy=scan.nextDouble() ;
        boy=boy/100;//cm yi m çevirdik
        System.out.println("Kilonuz: "+kilo);
        System.out.println("Boyunuz:"+boy);
        double endeks=(kilo)/(boy*boy);
        System.out.println("Kitle : "+endeks);
        if(endeks <18.5)
        {
            System.out.print(String.format("ZAYIF vki: %f", endeks));
        }
        else if(endeks > 18.5 && endeks <25)
        {
            System.out.print(String.format("NORMAL vki %f", endeks));
        }
        else if(endeks >= 25 && endeks <30)
        {
            System.out.print(String.format("KİLOLU vki: %f", endeks));
        }
        else if(endeks >= 30 && endeks <35)
        {
            System.out.print(String.format("OBEZ vki: %f", endeks));
        }
        else
        {
            System.out.print(String.format("CİDDİ OBEZ vki: %f", endeks));
        }


    }

}
