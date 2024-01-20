import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int x, y, total = 0;

        do {
            System.out.print("Insert Number:");
            x = imp.nextInt();
            if (x%4==0){
                total +=x;
            }
        }
        while(x%2==0);
        System.out.println("Final Number:" + total);
    }
}
