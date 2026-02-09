package Time_space;

public class Q5 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) { // n times
            for (int j = 0; j < n; j++) { // n times
                System.out.println("Hello");
            }
        }
    }
}

/*
 * Time Complexity:
 * Outer loop -> n times
 * Inner loop -> n times
 * Total -> n * n = O(n^2)
 * 
 * Space Complexity:
 * Only constant variables used -> O(1)
 */