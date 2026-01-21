//  Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
// a = [1, 2, 3]
// b = [1, 2, 3, 4]

package array;

import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        int[] a = { 11, 7, 31, 13, 21, 3, 7, 3, 1 };
        int[] b = { 11, 3, 7, 31, 7 };

        Arrays.sort(a);
        Arrays.sort(b);

        boolean subset = true;

        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                subset = false;
                break;
            }
        }

        if (j != b.length) {
            subset = false;
        }

        System.out.println(subset ? "Yes" : "NO");

    }
}
