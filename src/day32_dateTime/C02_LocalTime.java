package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalDateTime trhsat=LocalDateTime.now();
        int sayi=0;
        for (int i =0; i<100000; i++){
            sayi+=i;
        }
        System.out.println(time);//yukardaki ile aynı çunkü ilk olusanı alır devam eder
        //ama zamanı n farkını bulmak içian yeniden r-tanımlamalı
        LocalTime tmLoopSonrasi = LocalTime.now();
     //iki zamanı karşılastırmak içinse
     double nanno1=time.getNano();
     double nano2=tmLoopSonrasi.getNano();
        System.out.println("islem "+(nanno1-nano2)+"nanasaniye bitti");

//ileri ve geriye gidebiliriz
        System.out.println(time.plusMinutes(1000));


    }
}
