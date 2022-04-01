package day05_operatorler;
import java.util.Scanner;
public class C03_Operator {
    public static void main(String[]args){
        int a=15%4;          //burda 15 4 bolumunden kalan veriilir yani 3
        System.out.println(a);
       //Kullanıcıdan alınan 4 basamaklı sayının basamakları toplamı yaz
        Scanner scan= new Scanner(System.in) ;
        System.out.println("4 basamaklı tam sayı gir:");//7532yi alalım
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplamı=0;
        // 1. adım r=0 rt=0 sayi=7532
        rakam=sayi%10; //2
        rakamlarToplamı +=rakam; //2
        sayi/=10; //753 kalır int old için
        //2. adım r=2 rt=2 sayi=753
        rakam=sayi%10; //3
        rakamlarToplamı +=rakam; //5
        sayi/=10; //sayi 75 kalır
        //3. adım r=3 rt=5 sayi=75
        rakam=sayi%10; //5
        rakamlarToplamı +=rakam; //10
        sayi/=10; //sayi7 kalır
        //4. adım r=4 rt=10 sayi=7
        rakam=sayi%10; //7
        rakamlarToplamı +=rakam; //17
        System.out.println(rakamlarToplamı);
    /*
    import java.util.Scanner;
    public class GirilenSayininRakamlariToplami {
    public static void main(String[] args) {
        int sonuc = 0;

        // Scanner nesnesi oluşturuluyor.
        Scanner veriAl = new Scanner(System.in);

        // Kullanıcıdan sayı alınıyor.
        int veri1 = veriAl.nextInt();

        while (veri1 > 0) {

            // Mod ile son rakamı sonuc değişkenine ekliyoruz.
            sonuc += (veri1 % 10);

            /** 10'a bölerek son rakamı virgül sonrasına atıyoruz.
             * int değerlerde virgülden sonrasını almadığı için otomatikman
             * son rakam siliniyor ve tekrar modu alınarak aynı işlem
             * uygulanıyor.
             */
        //veri1 = veri1 / 10;
    //}

    // sonuc değişkeni ekrana yazdırılıyor.
      //  System.out.println("Girdiğiniz sayının rakamları toplamı: " + sonuc);
//}
//}



    }
}
