// Ques: Take two numbers input and calculate their HCF or GCD.

// ✅ Euclid’s Algorithm (HCF / GCD nikalne ka sabse easy method)
// 🔑 Idea (one line)

// Do numbers ka HCF nikalne ke liye, remainder zero hone tak divide karte raho.
// Last non-zero divisor = HCF

package function;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int hcf;

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        hcf = a;

        System.out.println("HCF is: " + hcf);
        sc.close();
    }
}
