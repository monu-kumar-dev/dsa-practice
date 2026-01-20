package array;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
        double[] arr = new double[8];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0
        }

        char[] arr2 = new char[8];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
            // char[] → default value = '\u0000' (null character)
            // 👉 That’s why nothing visible will be printed for char array (blank output)
        }
    }
}
