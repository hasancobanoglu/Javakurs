package day20_scopeArry;

public class C01_Scope {
    //Bunlar instace yani Object Variableslar olup main methodun dışında tanımlanır bunu kullanabilmemiz için
    //obje oluşturmalıyız aşağıda main class ın içinde sayi=10 değerini attayamayız
    int sayi;
    String baransIsmi="Java";
    boolean okulAcikMi;

    public static void main(String[] args) {
        //sayi=10 sayi variable static olmadığı iin main methodu direk kullanılmaz
        //instance variable lara static methodlardan ulaşmak içinse obje olusturmalıyız

        C01_Scope obj1=new C01_Scope();//objeyi olusturuyoruz



    }
}
