package function;

public class MaxOfTwo {
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        int maximumOfTwo = max(21, 23);
        System.out.println(maximumOfTwo);
    }
}
