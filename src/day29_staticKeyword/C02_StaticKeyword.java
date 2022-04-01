package day29_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        //başka class dakistatic class uyelerine ulaşmak için
        //class ismi.staticuye ismi yazılır
        System.out.println(C01_Static.okulTelefonu);
        //C01 deki staticleride değiştirebiliriz ama çalışama bitine kadar devam eder
        //tekrar başlatırsak bu ilkini alır
        C01_Static.okulTelefonu="123456789";
        System.out.println(C01_Static.okulTelefonu);
        //Başka class daki static olamyan class uyelerine
        //ancak o class dan bir obje olusturarak ulasabiliriz
        // ve obje ile yapılan atamalar sadece o obje için geçerli olur
        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();
        System.out.println(obj1.okulIsmi);
    }

}
