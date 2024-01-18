import java.util.Scanner;

public class Taximetr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, yekun, std, cemi1, perKm;
        std = 10;
        perKm = 2.20;
        System.out.print("Gedilecek Kilometri Daxil Edin:");
        km = input.nextDouble();
        cemi1 = (km * perKm) + std;
        yekun = (cemi1<20) ? 20 : cemi1;
        System.out.print("Yekun Mebleg:" + yekun);
    }
}
