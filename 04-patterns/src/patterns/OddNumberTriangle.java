// Ques: Print the given pattern
// Enter n: 4
// 1 
// 1 3 
// 1 3 5 
// 1 3 5 7 

package patterns;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count += 2;
            }
            System.out.println();
        }
        sc.close();

    }
}
