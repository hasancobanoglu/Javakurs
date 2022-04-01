package day05_operatorler;

public class C01_PreincrementPostincrement {
    public static void main(String[]args){
        int sayi=10;
        sayi++;
        System.out.println(sayi);
        sayi++;
        System.out.println("predenonce:"+sayi);
        System.out.println("preincrement satırında:"+ ++sayi);
        System.out.println("preincrement sonra"+ sayi);

        System.out.println("post satırında"+ sayi++);
        System.out.println("post son"+ sayi);


    }

}
