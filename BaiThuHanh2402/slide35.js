
package baithuchanh2402;
import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a > b);
        }
    }
}
