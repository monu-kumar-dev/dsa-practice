// Note:-------->

// Method	       Use
// println()	 Simple output
// printf()	     Formatted output (%.2f, %d, etc.)

package if_else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your cp: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Your sp: ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            System.out.printf("Profit: %.2f", (sp - cp));
        } else if (cp > sp) {
            System.out.printf("Loss: %.2f", (cp - sp));
        } else {
            System.out.println("No Profit No Loss");
        }
        sc.close();
    }
}
