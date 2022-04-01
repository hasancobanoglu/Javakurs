package day24_ArryList;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oğuzhan");
        System.out.println(isimler);
        isimler.set(1,"Seckin");
        System.out.println(isimler);

        //daha önceden listede var olalarida arşiv gibi tutmak istersel
        List<String> logListesi=new ArrayList<>();
        logListesi.add(isimler.set(2,"Cosmos"));
        System.out.println(logListesi);
        System.out.println(isimler);
    }
}
