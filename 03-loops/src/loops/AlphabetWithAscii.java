// Ques: Print all alphabets with their corresponding ASCII values.

package loops;

public class AlphabetWithAscii {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " -> " + (int) c + ", ");
        }

        System.out.println("\n");

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " -> " + (int) c + ", ");
        }

    }
}
