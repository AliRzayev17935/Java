import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int x, y, z;
        System.out.print("Bir Reqem Daxil Edin:");
        x = imp.nextInt();
        for (int i = 1; i<=x; i++){
            if (i%3==0 && i%4==0){
                System.out.println(i);
            }
        }
    }
}
