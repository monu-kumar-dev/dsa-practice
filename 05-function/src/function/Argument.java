package function;

public class Argument {
    public static void sum(int a, int b, int c) { // formal parameter
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        sum(2, 3, 4); // Actual parameter / Argument
    }
}
