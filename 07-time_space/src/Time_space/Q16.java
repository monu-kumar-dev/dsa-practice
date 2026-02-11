package Time_space;

public class Q16 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i * i <= n; i++) {
            System.out.println("hlo");
        }
    }
}

// Loop:--->
// i = 1, 2, 3, 4, ..... √n

// solution:--->
// i * i = n
// i^2 = n
// i = √n


/*
 * Time Complexity:
 * TC = O(√n)
 *
 * Space Complexity:
 * Only constant variables used -> O(1)
 */