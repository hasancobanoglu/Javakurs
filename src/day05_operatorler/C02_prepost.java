package day05_operatorler;

public class C02_prepost {
    public static void main(String[]args){
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
       sayi2=sayi1++;//önce atama olacak sonra artıracak ve say1 11 olur
        System.out.println(sayi1 +","+sayi2+","+sayi3);

        sayi3=++sayi1;//önce artırma sonra atama olur
        System.out.println(sayi1 +","+sayi2+","+sayi3);

        System.out.println(sayi3++);//once yazdıracak  sonra artıracak
        System.out.println(--sayi2);//once azalt sonra yazdır 9

    }
}
