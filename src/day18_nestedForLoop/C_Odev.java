package day18_nestedForLoop;
import java.util.Random;
import java.util.Scanner;
public class C_Odev {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
// kullanicidan bu sayiyi tahmin etmesini isteyin
// girilen her tahminde ""sayiyi buyult" veya " sayiyi kucult" diye yol gosterin
// kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random r = new Random(); //random sınıfı
        int a = r.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int sayi = 0;   //loopdan önce değişkenleri oluştur
        int i = 0;
        System.out.println(a);
        while (!(sayi == a)) {
            i++;
            System.out.print("Lutfen tahmininizi giriniz : ");
            sayi = scanner.nextInt();
            if (sayi < a) {
                System.out.println("Lutfen sayiyi buyultunuz");
            } else if (sayi > a) {
                System.out.println("Lutfen sayiyi kucultunuz");
            } else {
                System.out.println(":-) Bravo " + i + ". tahminde dogru tahmin ettiniz :-) ");
            }
        }
    }
}