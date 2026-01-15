// WAP to print if number is composite or not.
// composite means more than two factor

package loops;

import java.util.Scanner;

public class Comosite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num to check composite: ");
        int num = sc.nextInt();

        int count = 0;
        if (num <= 1) {
            sc.close();
            System.out.println("Not Composite");
            return;
        } else {
            System.out.print("Factors are: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            System.out.println((count > 2) ? "\nComposite" : "\nNot Composite");

        }
        sc.close();
    }
}
