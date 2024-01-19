import java.util.Scanner;

public class BoyKilo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, res;
        System.out.print("Boyunuzu Daxil Edin:");
        boy = input.nextDouble();
        System.out.print("Kilonuzu Daxil Edin:");
        kilo = input.nextDouble();
        res = kilo / (boy * boy);
        System.out.print("Beden Kutle Indeksiniz:" + res);
    }
}
