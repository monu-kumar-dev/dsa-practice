// Ques: Print the given pattern
// Enter n: 4
// a b c d 
// a b c 
// a b 
// a 

package patterns;

import java.util.Scanner;

public class AlbhabetTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            char ch = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
