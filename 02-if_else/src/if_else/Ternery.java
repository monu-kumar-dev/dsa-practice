// Ternary operator returns a value and cannot directly contain println statements.

package if_else;

import java.util.Scanner;

public class Ternery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        System.out.println((num % 2 == 0) ? "Even" : "Odd");
        sc.close();
    }
}
