package day06_Concatenation_Operator.day09_ternary_switch;

public class C04_test {

    public static void main(String[] args) {
        int sayi = -10;
        if (sayi >= 0) {
            if(sayi%2==0){
                System.out.println("sayi pozitiv cift sayi");
            }else{
                System.out.println("sayi pozotif tek sayi");
            }
            //System.out.println("bbbbbb");

        } else if (sayi<=-100){
                System.out.println("Sayi -100 kucuk negatif sayi");
            }else{
                System.out.println("Sayi -100 buyuk negatif sayi");
            }
        }
    }
