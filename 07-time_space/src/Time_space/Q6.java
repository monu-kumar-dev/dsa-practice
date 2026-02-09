package Time_space;

public class Q6 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) { // n times
            for (int j = 0; j <= i; j++) { // 1 + 2 + 3 +.......+(n-1)
                System.out.println("Hello");
            }
        }
    }
}

// i = 0         i = 1        i = 2         i = n-1
// j = 1 time    j = 2 time   j = 3 time    j = n time

// 1 + 2 + 3 + ............... + n time
/*
 * Time Complexity:
 * Total iterations = n(n + 1) / 2
 * TC = O(n^2)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */