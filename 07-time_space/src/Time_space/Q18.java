package Time_space;

public class Q18 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 2; i <= n; i *= i) {
            System.out.println("hlo");
        }
    }
}

// i = 2, 4, 16, 256,65536 .................
// 2^1, 2^2, 2^4, 2^8, 2^16 .................

// Patterns:-->
// 2
// 2^2 = 4
// 2^4 = 16
// 2^8 = 256
// 2^16 = 65536

// So after k iterations:---->
// i = 2^(2^k)

// solution:--->
// i <= n
// 2^(2^k) = n
// Take log base 2:-->
// 2^k ≤ log₂(n)
// Take log again:-->
// k ≤ log₂(log₂(n))
/*
 * Time Complexity:
 * TC = O(log log n)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */