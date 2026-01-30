// Ques : Given an array of size n+1 consisting of integers from 1 to n.
// One of the elements is duplicate in the array. Find that duplicate element.

package Time_space;

import java.util.ArrayList;

public class Duplicate_Boolean_For {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 3 };
        System.out.println(findDuplicates(arr));
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (visited[arr[i]] == true) {
                result.add(arr[i]); // store duplicate
            } else {
                visited[arr[i]] = true;
            }
        }
        return result;
    }
}
