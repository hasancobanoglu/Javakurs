package hc_test;

public class hc_asal {
    public static void main(String[] args) {
        int dakika=3456789;
        int saat=dakika/60;
        System.out.println(saat);
        int gun=saat/24;
        System.out.println(gun);
        int yil=gun/365;
        System.out.println(yil);
        int yilkln=gun%365;
        System.out.println(yilkln);
        System.out.println(dakika+" dakika yaklaşık "+yil+" yil "+yilkln+" gündür");

    }
}
