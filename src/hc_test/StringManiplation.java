package hc_test;

import java.util.Scanner;

public class StringManiplation {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // Scanner scan=new Scanner(System.in);
        // System.out.println("Adi Soyadi Giriiniz:");
        String adi="John";
        String soyadi="White";
        String kartno="1234234534561478";

        adi=adi.substring(0,1).toUpperCase()+adi.substring(1).replaceAll("\\w","*");

        soyadi=soyadi.substring(0,1).toUpperCase()+soyadi.substring(1).replaceAll("\\w","*");

        kartno=" **** **** **** "+kartno.substring(kartno.length()-4);

        System.out.println(adi+" "+soyadi+"\nCCN  :"+kartno);
        adi=adi.substring(0,1).toUpperCase();
        System.out.println(adi);
       adi= adi.substring(1).replaceAll("\\w","*");
        System.out.println(adi);
    }
}
