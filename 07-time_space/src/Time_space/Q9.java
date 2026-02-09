package Time_space;

public class Q9 {
    public static void main(String[] args) {
        int n = 10;

        int i = n;
        while(i != 0) {
            System.out.println("Hello");
            i /= 2;
        }
       
    }
}

//  2^k          2^k/2         2^k/4          2^k/8   ........      2^1
// i = n        i = n/2        i = n/4        i = n/8  .........   i = 1
//   1            1            1                1    .........       1

// Solution:--->

// 2^k = n
// taking log both side
// log(2^k) = log(n)
// k log2 = logn
// k = logn/log2
// k = log2n

/*
 * Time Complexity:
 * Total iterations = log2n
 * TC = O(logn)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */