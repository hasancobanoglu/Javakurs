package day16_methodCreation;

public class C02_Depo {
    public static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;
        if (ilkHarf >= 'A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
            ilkHarfSonuc=false;
        }
        return ilkHarfSonuc;
    }
    public static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc=false;
        char sonHarf=sifre.charAt(sifre.length()-1);
        if (sonHarf>='a' && sonHarf<='z'){
            sonHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
            sonHarfSonuc=false;
        }
        return sonHarfSonuc;
    }
    public static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=true;
        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
            boslukKontrolSonuc=false;
        }
        return boslukKontrolSonuc;
    }
    public static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
            uzunlukKontrolSonuc=false;
        }

          return uzunlukKontrolSonuc;

    }
}
