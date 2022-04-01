package day16_methodCreation;
import java.util.Scanner;
public class C_ForLoopTest {
    public static void main(String[] args) {
       /*Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin(ben scanner yapmamak için direk 51 verdim o sayıyı)
        1’den baslayarak
        girilen sayiya kadar tum sayilari yazdirin. Ancak;
        - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.

       * */


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Sayı gir :");
        int sayi=scan.nextInt();
        for (int i=1;i<=sayi;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Java Güzeldir ");
            }else if (i%3==0){
                System.out.println("Java");
            }else if (i%5==0){
                System.out.println("Güzeldir");
            }else{
                System.out.println(i);
            }

        }
    }
}
