import java.util.Scanner;
public class C04_Wrapper {
    public static void main(String[]args){
        //primitiv data ile non primitiv arasındaki farklar
        System.out.println("Adınızı Giriniz");
        Scanner oku= new Scanner(System.in);
        String ad=oku.nextLine();
        System.out.println(ad.toUpperCase());


    }
}
