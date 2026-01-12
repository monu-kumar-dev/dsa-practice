package basics;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 12;
        System.out.println(x++); // 12 (pahle use phhir badhao)
        System.out.println(x); // 13

        int x2 = 10;
        System.out.println(++x2); // 11 (pahle badhao phhir use)
        System.out.println(x2); // 11

        int x3 = 13;
        System.out.println(x3--); // 13 (pahle use phhir ghatao)
        System.out.println(x3); // 12

        int x4 = 16;
        System.out.println(--x4); // 15 (pahle ghatao phhir use)
        System.out.println(x4); // 15

        // Example:---.
        int y = 23;
        int z = y--;
        System.out.println(y + " " + z); // 22 23
    }
}
