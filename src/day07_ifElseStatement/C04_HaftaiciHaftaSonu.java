package day07_ifElseStatement;
import java.util.Scanner;
public class C04_HaftaiciHaftaSonu {
    public static void main(String[]args){
        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
        *** String icin equals method’unu kullanin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Gün ismini Yaz:");
        String gunIsmi=scan.next().toLowerCase();//girilen küçük harfa çevriliyor
       if(gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi")){
           System.out.println("Haftasonu");
       }
        if(gunIsmi.equals("pazartesi")||gunIsmi.equals("sali")||gunIsmi.equals("çarsamba")); {
            System.out.println("Haftaİçi");
        }
    }
}
