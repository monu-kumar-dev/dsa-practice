// Ques: Print all even numbers from 1 to 100 Continue Statement'
package loops;

public class Even2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                continue; // odd numbers skip
            }

            System.out.print(i + " ");
        }
    }
}
