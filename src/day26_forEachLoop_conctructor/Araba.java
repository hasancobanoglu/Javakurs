package day26_forEachLoop_conctructor;

public class Araba {
    /*Javada her class olusturduğumuzda;
    Java o class dan iileride objeler uretmek gerekeciğini biilir
    ve bir özellikde belirtmesekte java her oluşturduğu clasa bir constructor koyar

    Javanın class olustururken classa koyduğu constroctura DEFAULT CONSTRUCTOR denir ve bu constructor görülmea

    Eğer biz bir görünür constroctur olsunistersek default constroctor ile aynı göreviyapan bir constructor olusturabiliriz veya
    istersek aynı kalıptan farklı desenlede objeler olusturmak için farklı özellikte constructor lar olusturabiliriz
    constructorları birbirinden farklıllaştıran tek ayricalik kullanılan parametre sasyisi va parametre data türüdür

    */

    public Araba(){
        System.out.println("parametresiz constroctur çalıştı");
    }
    //Bir kod bloğunun method veya constructor olmasından emin olmak istiyorsanız iki şeye dikkat etmelisiniz
    // 1-constructor ların ismi class ismiyle aynı olmak zorundadır, yani büyük harfle başlar
    //2-constructor ların retorn type olmaz,return type varsa methoddur
    //Özetle: Constructorin adi Class adi ile ayni omali ve retorn tpe olmamalı
    public Araba(String renk){
        System.out.println(renk+ " renkli araba üretildi");
    }
    public Araba(int yil){
        System.out.println(yil+" model araba üretidi");
    }
    public Araba(int yil,String renk){
        System.out.println(yil+"model "+renk+" renkli araba üretidi");
    }
}
