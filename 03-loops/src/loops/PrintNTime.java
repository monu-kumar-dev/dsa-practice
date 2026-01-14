// Ques: Print ___Monu______ ‘n’ times. Take ‘n’ input from user

package loops;

import java.util.Scanner;

public class PrintNTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Much Time You want to print: ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("__Monu__");
        }
        sc.close();
    }
}
