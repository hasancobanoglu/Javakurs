package day20_scopeArry;

public class test {
    public static void main(String[] args) {
        char ch = 'a';

        while(ch<'d') {

            System.out.print(ch + " ");

            ch++;

        }
        for(char i='a'; i<'d'; i++) {

            System.out.print(i + " ");

        }

        int num = 1;

        do {

            System.out.print(num + " ");

            num++;

        }while(num<4);

        int num1 = 1;

        do {

            System.out.print(num1 + " ");

            num1++;

        }while(num1<1);
        int nu = 1;

        do {

            System.out.print(nu + " ");

            nu++;

        }while(nu<2);
    }

}
