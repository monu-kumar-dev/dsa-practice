// Ques: Multiply odd indexed elements by 2 and add 10 to even indexed elements
// Ex:-> [10, 20, 30, 40, 50, 60] = [20, 40, 40, 80, 60, 120]

package array;

public class OddEvenIndex {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] *= 2; // odd index
            } else {
                arr[i] += 10; // even index
            }
        }

        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + "," + " "); // last me comma aa ja raha
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : "")); // avoid last comma
        }

    }
}
