package Time_space;

public class Q17 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i * i <= n; i *= 2) {
            System.out.println("hlo");
        }
    }
}

// i = 1, 2, 4, 8, 16, .................
// 2^0, 2^1, 2^2, 2^3, .............. 2^k. so, i = 2^k

// solution:--->
// i * i <= n
// i^2 = n
// i = √n
// we know i = 2^k
// 2^k = √n
// log both side
// k log2 = 1/2 logn
// k = 1/2 log2n
/*
 * Time Complexity:
 * TC = O(logn)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */