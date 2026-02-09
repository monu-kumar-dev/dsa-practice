// Q. Find Time and Space Complexity.

package Time_space;

public class Q1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i += 2) {
            System.out.println("Hello");
        }
    }
}

// roughly loop runs n/2 times

// Tc => O(n)
// Sc => O(1)