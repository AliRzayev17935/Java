import java.util.Scanner;

public class Ucbucaq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c , d, sahe;
        System.out.print("1-ci Kateti Daxil Edin:");
        a = input.nextDouble();
        System.out.print("2-ci Kateti Daxil Edin:");
        b = input.nextDouble();
        c = Math.sqrt(a*a + b*b);
        sahe = (a*b) / 2;
        System.out.println("Hipatenuz:" + c);
        System.out.println("Ucbucagin sahesi:" + sahe);
    }
}
