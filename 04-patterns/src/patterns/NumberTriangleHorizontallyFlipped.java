// Ques: Print the given pattern
// Enter n: 4
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 

package patterns;

import java.util.Scanner;

public class NumberTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
