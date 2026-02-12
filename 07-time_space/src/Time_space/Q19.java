package Time_space;

public class Q19 {
    public static void main(String[] args) {
        int[] arr = { 10, 21, 32, 12, 16 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// 1️⃣ Outer loop (i):-->

// Runs → n times
// i = 0 → n-1

// 2️⃣ Middle loop (j):--->

// For each i,
// j runs from i to n-1
// So:--->
// When i = 0 → n times
// When i = 1 → n-1 times
// When i = 2 → n-2 times

// 3️⃣ Inner loop (k):--->

// For each pair (i, j),
// k runs from i to j

// That means it prints:-->
// j - i + 1 elements

// So total work becomes:--->
// 1 + 2 + 3 + ... + n
// for each i

// Overall total operations:-->
// n³ / 6 (approximation)

// so time complexity:--> 0(n^3)

// so space complexity:--> 0(1)