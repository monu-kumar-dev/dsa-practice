// Ques: Print numbers from ‘n’ to 1.

package loops;

import java.util.Scanner;

public class Decrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
