import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, a, pi, S;
        pi = 3.14;
        System.out.print("Radiusu Daxil Edin:");
        r = input.nextDouble();
        System.out.print("Bucagi Daxil Edin:");
        a = input.nextDouble();
        S = (pi * (r*r) * a) / 360;
        System.out.print("Verilmis Bucaq Altinda Qalan Hissenin Sahesi:" + S);
    }
}
