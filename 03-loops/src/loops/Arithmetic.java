// Ques: Display this AP - 2,5,8,11.. upto ‘n’
// Ex:--> n = 3  // 2, 5, 8
// Ex:--> n = 4  // 2, 5, 8, 11
package loops;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        for (int i = 2; i <= 3 * n - 1; i += 3) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
