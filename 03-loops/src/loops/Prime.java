// WAP to print if number is prime or not.
// Optimize:--> 
// ex:-> 24:-> 1 * 24, 2 * 12, 3 * 8, 4 * 6, repeat(6 * 4, 8 * 3, 12 * 2, 24 * 1)

package loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num to check Prime: ");
        int num = sc.nextInt();

        if (num < 2) {
            sc.close();
            System.out.println("Not Prime");
            return;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.print("Not Prime");
                    sc.close();
                    return;
                }
            }
        }
        System.out.print("Prime");
        sc.close();
    }
}
