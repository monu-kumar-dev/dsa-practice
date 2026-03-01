package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {

        int a[] = { 3, 4, 2, 2, 4 };
        int b[] = { 3, 2, 2, 7 };
        // Output: 2 2 3

        Arrays.sort(a); // 2,2,3,4,4
        Arrays.sort(b);// 2,2,3,7

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        for (int m = 0; m < result.size(); m++) {
            System.out.print(result.get(m) + " ");
        }

    }
}