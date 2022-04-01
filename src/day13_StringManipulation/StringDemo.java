package day13_StringManipulation;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        /*
        String str = "This is tutorials point";
        String substr = "";

        // prints the substring after index 8 till index 17
        substr = str.substring(8, 17);
        System.out.println("substring = " + substr);

        // prints the substring after index 0 till index 8
        substr = str.substring(0, 8);
        System.out.println("substring = " + substr);

   */
       /* String str = "Java Programlama";
        System.out.println("a harfi ilk olarak : " + str.indexOf('a') + " sırada bulundu");
        System.out.println("a harfi 2. indexden sonra " + str.indexOf('a', 2) + " sırada bulundu");
        System.out.println("gram altstringi " + str.indexOf("gram") + " sırada bulundu");
*/

       /* String st1="Programlama";
        int i;

        for(i=0; i<=st1.length()-1; i++) {
            System.out.print(" ");
            System.out.print(st1.charAt(i));

         */
       /* Scanner input = new Scanner(System.in);
        System.out.print("Birşeyler girin:");
        String metin=input.nextLine();
        System.out.println((metin.substring(1)) + metin.charAt(0)+metin.substring(2)+metin.charAt(1));
        */
       /* String str = "sarikanarya";
        System.out.println(str);
        System.out.println(str.charAt(4));
        System.out.println(str.length());
        System.out.println(str.charAt(0));

        System.out.println(str.charAt(str.length()-1));
*/
        /*String str = "Ayhan Beyhan";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.replace("h", ""));
        System.out.println(str.replace("han", "ol"));
        System.out.println(str.length());
*/
       /* String str = "Java ah java";
        System.out.println(str.contains("J"));
        System.out.println(str.contains("x"));
        System.out.println(str.contains("ja"));
*/
       /* String str1 = "Ali";

        String str2 = "ali";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equals(str1));

        System.out.println(str2.equalsIgnoreCase(str1));
*/
        String str = "seyhan yavuz";
        System.out.println(str.replace("s", "S"));

       // System.out.println(str.replace("y", "Y"));



    }





}