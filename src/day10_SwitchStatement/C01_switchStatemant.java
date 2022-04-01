package day10_SwitchStatement;
import java.util.Scanner;
public class C01_switchStatemant {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaçıncı Ay girilecek");
        int ayNo=scan.nextInt();
        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                    System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");//Son işlemde break olmalı yoksa hataya kadar gider ve son olan defaultta çalışır
                break;
            default:
                System.out.println("Geçerli ay giriniz");

        }

            //switch içine yazılan variableın değerine göre hareket eder
        //ilgili case bulur ve break görene kadar kodu çalıştırır
        //break yoksa aşağıya doğru breake kadar çalıştırır

    }
    }
