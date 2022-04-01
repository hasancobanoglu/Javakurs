package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        System.out.println("sayi1..:"+sayi1);
       // System.out.println("sayi2..:"+sayi2);//Bunları yazdıramıyoruz çünkü static değil
        //sayi2 ulaşmak için ne yapmalı ozaman obje olustururuz
        StaticKeyword obj1=new StaticKeyword();
        System.out.println("sayi2:" + obj1.sayi2);//Şuan kabul edildi ve atama olmadığından değer 0
        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1.:"+sayi1);
        System.out.println("obj1 sayi2: "+obj1.sayi2);
        System.out.println("obj1 sayi1: "+obj1.sayi1);

        StaticKeyword obj2=new StaticKeyword();
        System.out.println("obj2 sayi2: "+obj2.sayi2);
        System.out.println("obj2 sayi1: "+obj2.sayi1);

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi1+" "+ obj2.sayi2);
    }
}
