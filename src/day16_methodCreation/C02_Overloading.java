package day16_methodCreation;

public class C02_Overloading {
    public static void main(String[] args) {
        //Java’ da method overloading aynı isime sahip birden fazla metodun kullanılmasıdır ;
        // ancak parametre tipleri veya sayıları farklı olmak kaydıyla.
        String str= "Bu da gecer ya Huu";
        System.out.println(str.indexOf("d")); // 3
        System.out.println(str.indexOf("a",5)); // 13
        System.out.println(str.indexOf('a',5));


        // bir class'da ayni isimde birden fazla method olmasina overloading denilir
        // ya parametre sayisi farkli olmali
        // veya parametre sayisi ayni ise argumentlerin data turleri farkli olmali

    }
}
