import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select, res = 0;
        System.out.print("Ilk Ededi Daxil Edin :");
        n1 = input.nextInt();
        System.out.print("Ikinci Ededi Daxil Edin :");
        n2 = input.nextInt();
        System.out.print(" 1- Toplama\n2- Çıxma\n3- Vurma\n4- Bölmə\nLazimli Emeliyyati secin:");
        select = input.nextInt();
        if (select == 1){
            res = n1+n2;
        }
        else if (select == 2){
            res = n1 - n2;
        }
        else if (select == 3){
            res = n1 * n2;
        }
        else if (select == 4){
            res = n1 / n2;
        }
        else {
            System.out.print("Daxil Edilen Reqem Duzgun Deyil");
        }
        System.out.print("Netice :" + res);
    }
}
