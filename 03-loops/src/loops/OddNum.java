// HW: Print all odd numbers divisible by 3 from 1 to 100

package loops;

public class OddNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
