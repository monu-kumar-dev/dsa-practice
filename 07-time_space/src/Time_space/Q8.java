package Time_space;

public class Q8 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i < n; i *= 3) {
            System.out.println("Hello");
        }
    }
}

//  3^0          3^1          3^2           3^3   ........    3^K
// i = 1        i = 3        i = 9         i = 27  .........   i = n
//   1            1            1             1    .........     1

// Solution:--->

// 3^k = n
// taking log both side
// log(3^k) = log(n)
// k log3 = logn
// k = logn/log3
// k = log3n

/*
 * Time Complexity:
 * Total iterations = log3n
 * TC = O(logn)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */