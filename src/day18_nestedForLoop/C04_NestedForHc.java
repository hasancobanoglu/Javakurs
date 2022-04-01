package day18_nestedForLoop;

public class C04_NestedForHc {
    public static void main(String[] args) {
        int input=5;
        for(int i=1;i<=input;i++){
            System.out.println("");
            for(int j=1;j<=i;j++)
            System.out.print(j+" ");
        }

    }
}
