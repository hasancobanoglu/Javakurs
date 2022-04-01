package day20_scopeArry;

public class HC01_Arry {
    public static void main(String[] args) {
        //ilk aray olusturup direkt atama yapma
        int []arr1={10,20,30,40,50};
        //önce bos bir arry yaptık sonra atama yaptık
        int [] arr2= new int[5];
        arr2[0]=1;
        arr2[1]=2;
        arr2[2]=3;
        arr2[3]=4;
        arr2[4]=5;
        //Yukarda tek tek arry doldurduk burda 5 tane int turunden data va
        //Bunu nasıl gösteririz
        System.out.println("Arryyin 1.Elamanı:"+arr2[0]);//birinci elamanı indexini gorecegiz
        System.out.println("Arryyin 3.Elamanı:"+arr2[3]);//3 elamanı indexini gorecegiz
        //Arry in içindeki elemanları forla gösterme
        for (int i=0;i<5;i++){
            System.out.println(i+".elemanı:"+arr1[i]);
        }
        //Arry in uzunluğunu bilmeyebiliriz bu durumda
        // ilgili arry in length nı alarak dinam,k hale getiririz
        for (int i=0; i<arr1.length;i++){
            System.out.print(i+".Elemanı:"+arr1[i]+" ");
        }
    }
}
