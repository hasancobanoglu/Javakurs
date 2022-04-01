package day11_StringManipulation;
import java.util.Locale;
import java.util.Scanner;
public class C03_length {
    public static void main(String[]args){
        //Kullanıcıdan ismini aalıp İsmin ilk harfini ve son harfinni yazdırma
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi Giriniz");
        String isim= scan.nextLine();
        //charat() fonksiyonu istenen harfi almayı sağlar ki 3 harfi istersek 0123 harfi charAt(3) yazarız
        //stringin son harfi ise charAt(-1) dir
        System.out.println("İlkharf :"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("Sonharf :"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        //null ve "" hiçlik mantığı null hata verir
        String str1="";
        System.out.println("str1.length() = " + str1.length());//0 olur

        String str2=null;
        System.out.println("str2.length() = " + str2.length());//çalışınca null exception hatası verir

        String str3;
        //str3 ile str2 değer atanmamıştır

        // str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugu bilir
        // ve geriye kalan kodun calismasina engel olmaz
        // ancak str3' e bir deger atamasi olmayinca java altini kirmizi cizer
        // ve bu durum duzeltilinceye kadar kodun geriye kalaninin calismasinada izin vermez

    }
}
