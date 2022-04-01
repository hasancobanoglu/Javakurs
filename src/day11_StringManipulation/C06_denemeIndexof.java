package day11_StringManipulation;
import java.util.Scanner;
public class C06_denemeIndexof {
    public static void main(String[]args){
       //Programda, st1 String'i içindeki anadolu
        // karakter dizisinin her harfi ve bu harfin karakter dizisi içindeki indisi birer satıra yazdırılmıştır.
        Scanner scan=new Scanner(System.in);
        System.out.println("Birşeyler Girin");
        String oku=scan.nextLine();
        int i=0;
        System.out.println(oku);
        for(i=0; i<=oku.length()-1; i++)
            System.out.print(i);
    /*
        String str="Malatya";
        int i=0;
        System.out.println("String"+"   "+"İndexi");
        for(i=0; i<=str.length()-1; i++)
        System.out.println(str.charAt(i) +"            "  +i);
    */


    }
}
