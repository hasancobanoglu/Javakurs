package day17_forLoop;
import java.util.Scanner;
public class C08_FoorLoop {
    public static void main(String[] args) {
        /*
		 Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
		 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
			- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
			- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
			- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
        int num = scan.nextInt();
        if (num>100||num<=0||num==100){
            System.out.println("Sayı istenilen aralıkta değil");
        }else{
            for (int i=1;i<num;i++){
                if(i%3==0&&i%5==0){
                    System.out.print(i+"Java Güzeldir\t");
                }else if(i%5==0){
                    System.out.print(i+"Güzeldir\t");
                }else if(i%3==0){
                    System.out.print(i+"Java\t");
            }else{
                    System.out.print(i+"\t");
        }

        scan.close();
    }
}}}
