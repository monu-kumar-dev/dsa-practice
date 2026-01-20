package array;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] x = { 2, 65, 43, 21 };
        System.out.println("Before function call: " + x[2]);
        change(x);
        System.out.println("After function call: " + x[2]);
    }

    public static void change(int[] a) {
        a[2] = 20;
    }
}
