package day20_scopeArry;
import java.util.Scanner;
public class HC02_Arry {
    public static void main(String[] args) {
        //%lik bir arry olusturduk ve buna kullanıcıdan veri alaağız
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[5];
        //for ile arry veri gireceğiz
        System.out.println("Arry değerleri yazılıyor");

        for (int i=0;i<arr.length;i++){//aryin uzunlugu kadar kullanıcıdan veri alıyoruz dinamik
            arr[i]=scan.nextInt();
        }
        System.out.println("Arry değerleri Gösteriliyor");
        ortalama(arr);//method olusturduk ve göstermeyi yaptık
    }

    public static void ortalama(int[] arr) {//gosterme mETHOD İLE yaptık
        int toplam=0;
        for (int i =0;i<arr.length;i++){
            toplam+=arr[i];
        }
        System.out.println("Ortalama " +toplam/arr.length);

    }
}
