package day26_forEachLoop_conctructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,11};
        //elementleri for loop ile yazdıralım
        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n**********for each loop**********");
        //for each loop için hedef bir collection vermeliyiz
        for (int each : arr){
            System.out.print(each+" ");
        }
    }
}
