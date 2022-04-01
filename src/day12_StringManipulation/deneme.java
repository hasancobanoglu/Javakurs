package day12_StringManipulation;

public class deneme {
    public static void main(String[] args) {
       String kelime="Mehmet";
        for(int i=kelime.length()-1;i>=0;i--) //i'yi kelime uzunluğu kadar tanımlıyoruz.
        {
            System.out.print(kelime.toUpperCase().charAt(i));
        }
    }
}
