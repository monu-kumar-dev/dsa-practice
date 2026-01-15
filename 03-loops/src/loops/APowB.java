// Ques: ‘a’ raise to the power ‘b’

package loops;

import java.util.Scanner;

public class APowB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter power (b): ");
        int b = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        System.out.println("a ^ b -> " + result);
        sc.close();
    }
}
