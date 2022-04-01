package day07_ifElseStatement;

public class C01_ifStatetmant {
    public static void main(String[]args){
        int a=2,b=3;
        if (a>100){
            System.out.println("a 100 den büyük");
        }
        if (a != b) {
            System.out.println("Sayılar eşit");
            System.out.println(a*b);
        }
        if (a*b>5){
            System.out.println("Çarpım büyük");
        }
    }

}
