package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {
        //Verilen iki sayıyı toplayan method
        int sayi1=10;
        int sayi2=5;
        SayiTopla(sayi1,sayi2);//Buda ayrı class dan geliyor C02.Depodan geliyor
        SayiCarp(sayi1,sayi2);
        //Method ismini yazıp () açıyoruz ve buna gelecek değerleri sayi1 ve sayi2 yazıyoruz
        //ve sonra üzerine gelip method creationu seçince aşağıdaki gibi bir fonksiyon olusturuyor
        // ve buna int iki değer geliyor ve işlem yapıyor void olduğundan değer dönmüyor yazdırıyoruz

    // verilen iki sayiyi toplayip yazdiran bir method olusturalim

    int sayi=10;
    int say2 =20;

    ikSayiTopla(sayi, say2);

    // iki double sayinin toplamini yazdiran bir method olusturalim

    double sayi3=15.2;
    double sayi4=10.3;

    ikSayiTopla(sayi3 , sayi4);

    // eger variable olusturmadan direk sayilari yazarak method call yaparsam

    ikSayiTopla(15,25); // int toplam verir
    ikSayiTopla(10.1,12.3); // double toplam verir

    // bir integer ile bir double toplamini yazdiran bir method olusturalim

    int sayi5=3;
    double sayi6=3.2;
    ikSayiTopla(sayi5,sayi6);
}

    private static void SayiTopla(int sayi1, int sayi2) {
        System.out.println("topla..:" +(sayi1+sayi2));
    }

    private static void ikSayiTopla(double sayi3, double sayi4) {

        System.out.println("iki double toplami : " + (sayi3 + sayi4) );
    }

    private static void ikSayiTopla(int say, int say2) {

        System.out.println("iki integer toplami : " + (say+ say2));
    }
    private static void SayiCarp(int sayi1, int sayi2) {
        System.out.println("Çarpım:"+(sayi1*sayi2));
    }
}
