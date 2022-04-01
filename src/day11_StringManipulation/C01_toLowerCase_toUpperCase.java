package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[]args){
        String str="Java Güzeldir";
        System.out.println(str.toLowerCase().charAt(5));
        String isim="TechProeDucatIon";
        System.out.println("isim.toLowerCase() = " + isim.toLowerCase());
        System.out.println("isim.toUpperCase() = " + isim.toUpperCase());
        //toLowerCase(Locale locale) girilen string değişkende tüm harfleri local dile çevirmeolur
        System.out.println("str.toUpperCase(Locale.forLanguageTag(\"tr\") = " + str.toUpperCase(Locale.forLanguageTag("tr")));


    }
}
