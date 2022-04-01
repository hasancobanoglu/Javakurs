package day18_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        int input=5;
        System.out.println("*******Çarpım Tablosu*********");
        for (int i=1; i<=input;i++){
            for (int j=1;j<=input;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println("");
        }

    }
}
