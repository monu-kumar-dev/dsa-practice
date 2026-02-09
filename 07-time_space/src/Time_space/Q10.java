package Time_space;

public class Q10 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) { // n times
            for (int j = 0; j < n; j++) { // n times
                for (int k = 0; k < n; k++) { // n times
                    System.out.println("Hello");
                }
            }
        }
    }
}

// First loop → n times
// Second loop → n times (for each i)
// Third loop → n times (for each j)

/*
 * Time Complexity:
 * Total iterations = n*n*n
 * TC = O(n^3)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */