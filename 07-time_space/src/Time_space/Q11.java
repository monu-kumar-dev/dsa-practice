package Time_space;

public class Q11 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) { // n times
            for (int j = 0; j < i * i; j++) {
                System.out.println("Hello");
            }
        }
    }
}


// i = 0     i = 1    i = 2      i = 3  .........   i = n-1
// j = not  i =0to0  j =0to3    j=0to8 .........    
//   0         1        4         9                  (n-1)^2

// Pattern:--->
// 0^2 + 1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + ........... + (n-1)^2

// formula: -->
// n(n+1)(2n+1) / 6

/*
 * Time Complexity:
 * Total iterations = n * n * n
 * TC = O(n^3)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */