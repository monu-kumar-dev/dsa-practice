package Time_space;

public class Q12 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println("hello");
            }

        }
    }
}

// i = 1, j = 2,3,4,5...n  (n-1)
// i = 2, j = 3,4,5,...n   (n-2)
// i = 3, j = 4,5,6...n    (n-3)
// .
// .
// .
// i = n-1, j = n           (1)

// Pattern:--->
// (n-1)+(n-2)+(n-3)+(n-4)+ ....... + 3 + 2 + 1

// formula: -->
// Sum of first n natural numbers = n(n+1)/2

/*
 * Time Complexity:
 * Total iterations = (n^2+n)/2
 * TC = O(n^2)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */
