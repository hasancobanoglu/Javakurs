package day33_varags_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java çok güzel");
        StringBuilder sb3=new StringBuilder(10);//int sayı vererek olusturunca capasity çıktburda
        //
        System.out.println("sb1 length"+sb1.length());
        System.out.println("sb1 capasity"+sb1.capacity());

        System.out.println("sb2 length"+sb2.length());
        System.out.println("sb2 capasityy"+sb2.capacity());

        System.out.println("sb3 length"+sb3.length());
        System.out.println("sb2 capasityy"+sb3.capacity());
        //1 ile 3 arsaında fark var 1 capasity16 3 capasity 10

        //append methodu ile ekleme yapabiliriz bunun capasitesi 16 16 olana kadar gelir ve aşarsa otomatik yaklaşık 2 katını alır ve devam eder
        sb1.append("java").append(" ").append("çok").append(" ").append("güzel");
        System.out.println("sb1 length"+sb1.length());
        System.out.println("sb1 capasity"+sb1.capacity());
        sb1.append(3);
        System.out.println(sb1);



    }
}
