package day07_ifElseStatement;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Gün gir:");
        String gunIsmi= scan.next().toLowerCase();
        if(gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi")){
            System.out.println("Haftasonu");
        } else if(gunIsmi.equals("pazartesi")||gunIsmi.equals("salı")){
            System.out.println("Haftaici");
        }else System.out.println("Gecerli gün gir");
    }
}
