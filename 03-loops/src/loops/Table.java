// Ques: Print the table of 19 and 17

package loops;

public class Table {
    public static void main(String[] args) {

        System.out.println("Table of 19:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * 19 + " ");
        }

        System.out.println("\n\nTable of 17:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * 17 + " ");
        }
    }
}
