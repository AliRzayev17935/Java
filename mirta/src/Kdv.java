import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pul, kdv_tutari, yekun_qiymet;
        System.out.print("Mbelegi Daxil Edin:");
        pul = input.nextDouble();
        kdv_tutari = pul * 0.18;
        yekun_qiymet = pul + kdv_tutari;
        System.out.println("Kdv tutari:" + kdv_tutari);
        System.out.print("Yekun odenilecek mebleg:" + yekun_qiymet);
    }
}
