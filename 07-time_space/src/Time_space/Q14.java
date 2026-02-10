package Time_space;

public class Q14 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i *= 2) {  // logn
            for (int j = 1; j <= n; j++) { // n
                System.out.println("Gfg");

            }

        }
    }
}

// Outer Loop:--->
// 2^0 2^1 2^2 2^3 ........ 2^K
// i = 1 i = 2 i = 4 i = 8 ......... i = n
// 1 1 1 1 ......... 1

// Solution:--->

// 2^k = n
// taking log both side
// log(2^k) = log(n)
// k log2 = logn
// k = logn/log2
// k = log2n

// Inner Loop:-->
// j = 1 j = 2 j = 3 ..... j = n
// 1 1 1 ..... 1
// n works

/*
 * Time Complexity:
 * Total iterations = n * logn
 * TC = O(nlogn)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */