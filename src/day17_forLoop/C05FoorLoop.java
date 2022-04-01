package day17_forLoop;

public class C05FoorLoop {
    // Soru 3)  100’den baslayarak 50’ye(dahil) kadar olan sayilari
    //			aralarinda virgul olarak ayni satirda yazdirin
    public static void main(String[] args) {

        for (int i = 100; i >= 50; i--) {
            if (i > 50) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }


        }
    }}
