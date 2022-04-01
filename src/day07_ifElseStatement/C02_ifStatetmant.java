package day07_ifElseStatement;

public class C02_ifStatetmant {
    public static void main(String[]args){
        int a=10,b=20;
        if(a<b && b<100){
            System.out.println("İsteğiniz gerçeklesiyor....");
            System.out.println("Body içindeki kodlar çalışır \n Yani if şart doğru");
        }
        if (a>0) System.out.println("Süslü parantez olmazsa sadece bir satır çalışır");
        if (b<0) System.out.println("Süslü parantez olmazsa if doğruysa çalışır değilse çalışmaz");

        System.out.println("2.Satır da çalıstı");
    }
}
