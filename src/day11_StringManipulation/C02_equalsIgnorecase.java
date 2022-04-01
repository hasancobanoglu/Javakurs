package day11_StringManipulation;
import java.util.Scanner;
public class C02_equalsIgnorecase {
    public static void main(String[]args){
      Scanner scan=new Scanner(System.in);
        System.out.println("Derse Katılmak İstermisiniz \n Evet veya Hayır yaz");
        String oku=scan.nextLine();
        if (oku.equalsIgnoreCase("Evet")){
            System.out.println("oku = " + oku+"Derse Katılabilirsiniz");
        }else if (oku.equalsIgnoreCase("Hayır")){
            System.out.println("oku = " + oku+"Sonraki derse bekleriz");
        }else {
            System.out.println("yazzzzzzz");
        /* String str1="Ali Can";
        String str2="Ali"+" Can";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str1 == str2 ile karşılaştırma :" + (str1==str2));
        System.out.println("str1 ve str2 equals()ile karşilastırma :" + str1.equals(str2));
        
        String str3=str1+"";
        System.out.println("str3 = " + str3);
        System.out.println("(str3==str2 = " + (str3==str2));
        System.out.println("str3.equals(str2) = " + str3.equals(str2));
        
//String 'de == herzaman doğru sonuç vermez
        //Bunun için emin olduğumuz equals() methoduyla eşitliğe bakmalıyız
        String str5="hasan";
        String str6="HASAN";
        System.out.println("str5 = " + str5.equals(str6));//false verir çünkü aynı değil
        System.out.println("str5 = " + str5.toUpperCase().equals(str6));//true verir çünkü uppercase ile dönüştürüp baktık
*/
    }
}}

