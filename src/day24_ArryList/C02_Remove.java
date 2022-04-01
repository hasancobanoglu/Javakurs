package day24_ArryList;
import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oğuzhan");
        System.out.println(isimler);
        //1 yöntem: remove methodu direkt boolean bir değer dönderir  true yada false
        isimler.remove("Aykut");
        System.out.println(isimler);

        // istenilen bir stringi aray listeki veriyi silmekiçin boolen bir sonuc a
        //aktarıp o nu kontrol edip sonucu yazabiliriz
        boolean sonuc=isimler.remove("Yusuf");
        if (sonuc==true){
            System.out.println("siilindi");
        }else {
            System.out.println("silinmedi");
        }
        System.out.println(isimler);

        //2.Yöntem remove(index) yazdiğimizda sildim silmedim ihtimali kalmaz
        //olmayan bir index yazdığımızda exception verir
        System.out.println(isimler.remove(1));//index silinince sildiğini delil olarak getirir
        System.out.println(isimler);
    }
}
