import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        int riyaz, kimya, fizika, musiqi, azeri, tarix;
        double ortalama;
        String yorum;
        Scanner input = new Scanner(System.in);
        System.out.print("Riyazziyat:");
        riyaz = input.nextInt();
        System.out.print("Kimya:");
        kimya = input.nextInt();
        System.out.print("Fizika:");
        fizika = input.nextInt();
        System.out.print("Musiqi:");
        musiqi = input.nextInt();
        System.out.print("Azernbaycan Dili:");
        azeri = input.nextInt();
        System.out.print("Tarix:");
        tarix = input.nextInt();
        ortalama = (riyaz + kimya + fizika + musiqi +azeri+ tarix) / 6.0;
        System.out.print("Ortalama:");
        System.out.println(ortalama);
        yorum = (ortalama > 60) ? "Kecdin" : "Kesildin";
        System.out.print(yorum);
    }
}