// Q. Find Time and Space Complexity.

package Time_space;

public class Q3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }

        for (int j = 0; j < n; j += 5) {
            System.out.println("No");
        }
    }
}

// first time loop = n
// Second time loop ~ n / 5
// total = O(n + n / 5 ) = O(n + n) = O(2n) = O(n)

// Tc => O(n)
// Sc => O(1)