package function;

import java.util.Scanner;

public class PermutationAndCombination {
    public static int fact(int a) {
        int mul = 1;
        for (int i = 1; i <= a; i++) {
            mul *= i;
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("r cannot be greater than n");
            sc.close();
            return;
        }

        int nCr = fact(n) / (fact(r) * fact(n - r));
        int nPr = fact(n) / fact(n - r);

        System.out.println("Permutation is: " + nPr);
        System.out.println("combination is: " + nCr);

        sc.close();
    }
}
