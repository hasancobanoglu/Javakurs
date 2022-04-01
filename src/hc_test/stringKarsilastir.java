package hc_test;

public class stringKarsilastir {
    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        String ayni = "";
        int say=0;
        for (int i = 0; i <= str.length() - 1; i++) {
          if(str.charAt(i)==str.charAt(i)-1){
              say++;
          }


        }System.out.println(say);
    }
}
/*
        Girilen metinde eğer sesli harfler sessiz harflerden fazla ise tüm metni
        küçük harfle aksi halde tüm metni büyük harfle yazan programın java kodu (2.6)

for (int i = 0; i <=255;i++){
    //        char karakter = (char) i;
    //        System.out.println(i +" -> " + karakter);
    //    }

      for (int i = 0; i <= str.length() - 1; i++) {
            System.out.println(str.substring(i));

        }
    }
     if(cumle.charAt(i)==harf){
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumlede " + harf +" karakteri " + sayac + " adettir");
 */