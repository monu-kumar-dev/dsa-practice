package basics;

public class CharDataType {
    public static void main(String[] args) {
        char ch = 's';
        System.out.println(ch);
        char sp = '+';
        System.out.println(sp);

        // ASCII VALUE
        char ch2 = 'A';
        char ch3 = 'a';
        int asci = (int) ch2;
        int asci2 = (int) ch3;
        System.out.println("ASCII OF A: " + asci);
        System.out.println("ASCII OF a: " + asci2);

        char ch4 = '0';
        int asci3 = (int) ch4;
        System.out.println("Ascii value of 0: " + asci3);

        // Short for Ascii Value :-->
        char ch5 = 'y';
        // System.out.println("Ascii value of y: " + ch5 + 0); // Ascii value of y: y0
        System.out.print("Ascii value of y: ");
        System.out.println(ch5 + 0);

        // Integer to Char:--->
        int x = 81;
        char ch7 = (char) x;
        System.out.println("56 -> " + ch7);
    }
}
