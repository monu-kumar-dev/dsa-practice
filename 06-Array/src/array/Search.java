// Ques: Search in Array

package array;

public class Search {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 28, -97, 54 };
        int key = 28;

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = true;
                break;
            }
        }
        System.out.println((flag) ? "Key exist" : "Not Exist");

    }
}
