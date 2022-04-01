package day33_varags_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //paramete olarak bir int
        //ve istediğimiz kadar String alan en uzun kelimenin harf sayisi ile int parametrenin
        //değerini çağırıp sonucunu yazadıran bir method olustur

        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";

        carpım(sayi,str1,str2);//değişkenleri yazıp methodadan cğırıyoruz


    }
//methoda veri gönderirken sıralama önemli varargs çok geniş düşündüğünden
    //buna dikkat etmeli dolayısıyla bir methodda varargs dan farklı bir parametre varsa once farklı olan örneğin burda int sayi vardı önce bunu yazdık
// sonra Varargs parametreleriini emsona yazdık
    private static void carpım(int sayi, String... str) {
        String enUzunStr="";
        for (String each:str
             ) {
            if(each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("enuzun kelime "+enUzunStr);
        System.out.println("Istenen değer...:"+sayi*enUzunStr.length());
    }
}
