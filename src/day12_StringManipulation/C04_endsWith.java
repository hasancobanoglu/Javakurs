package day12_StringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {
        String email="mulkiyeayboy@gmail.com";
        String arananMetin="@gmail.com";
        if (!email.contains(arananMetin)){
            System.out.println("Gmail gir");
        }else if(email.endsWith(arananMetin)){
            System.out.println("Email kaydedildi");
        }else {
            System.out.println("kontrol edin");
        }
    }
}
