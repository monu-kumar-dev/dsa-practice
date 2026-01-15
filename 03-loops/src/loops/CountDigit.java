// Ques: Count digits of a number

package loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Total digits: 1");
            sc.close();
            return;
        }

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.print("Total digits: " + count);
        sc.close();
    }
}
