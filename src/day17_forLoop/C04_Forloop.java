package day17_forLoop;

public class C04_Forloop {
    public static void main(String[] args) {
        // 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin

      for(int i=10;i<=30;i++){
          System.out.print(i+",");
      }
        System.out.println(" ");
      System.out.println("***********ikinci for***********");
      int baslangic=10;
      int son=30;
        for (int i=baslangic;i<=son-1;i++){
        System.out.print(i+",");
}        System.out.print(son);

        System.out.println(" ");
        System.out.println(" 3.Yöntem");
        for(int i=baslangic;i<=son;i++){
            if(i<son){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }

        }




       /* for (int i = 10; i <=29 ; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(30);


        int baslangic=15;
        int bitis=20;
        for (int i = baslangic; i <=bitis ; i++) {
            if (i<bitis){ System.out.print(i + ", ");
            }  else{
                System.out.println(i);
            }
        }
    }
    */
    }
}
