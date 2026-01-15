// Ques: Print sum of digits of a number

package loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Total digit's sum: 0");
            sc.close();
            return;
        }

        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }

        System.out.print("Total digit's sum: " + sum);
        sc.close();
    }
}
