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

// i = 0 i = 1 i = 2 i = 3 ......... i = n-1
// j = not i =0to0 j =0to3 j=0to8 .........
// 0 1 4 9 (n-1)^2

// Pattern:--->
// 0^2 + 1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + ........... + (n-1)^2

// formula: -->
// natural number square = n(n+1)(2n+1) / 6

// here last term is (n-1), so i am putting the n-1 in place of n.
// suppose last term is 10 then i put 10 in place of n but here last term is n-1

// now:-->
// (n-1)(n-1+1)(2*(n-1)+1) / 6
// (n-1)n(2n-2+1) / 6
// (n-1)n(2n-1) / 6
// (n−1)n(2n−1) / 6
// n(2n² − 3n + 1) / 6
// (2n³ − 3n² + n) / 6

/*
 * Time Complexity:
 * Total iterations = (2n³ − 3n² + n) / 6  
 * TC = O(n^3)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */