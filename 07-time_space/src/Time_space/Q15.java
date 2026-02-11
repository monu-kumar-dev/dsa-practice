package Time_space;

public class Q15 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i *= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.println("Hlo");

            }

        }
    }
}

// Loop:--->

// i = 1, j = 1 --- 1 kaam
// i = 2, j = 2 ---- 2 kaam
// i = 4, j = 4 ---- 4 kaam
// i = 8, j = 8 ---- 8 kaam
// i = 16, j = 16 --- 16 kaam

// Solution:--->
// 1 + 2 + 4 + 8 + 16 + --------- + n
// This is a geometric series.

// Sum = 2n - 1

/*
 * Time Complexity:
 * TC = O(n)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */