package basics;

public class VariableNaming {
    public static void main(String[] args) {
        // Rule 1: number se start nahi hota

        // int age; // ✅
        // int _count; // ✅
        // int $price; // ✅
        // int 1num; // ❌

        // 🔹 Rule 2: No spaces allowed

        // int totalMarks; // ✅
        // int total marks; // ❌

        // 🔹 Rule 3: Keywords not allowed

        // int value; // ✅
        // int class; // ❌ (keyword)

        // 🔹 Rule 4: Java naming convention (MOST IMPORTANT)

        // Variables → camelCase
        // int studentAge; // ✅
        // double totalMarks; // ✅

        // ❌ Avoid: -->

        // int StudentAge;
        // int student_age;

        // Example:---------->
        int age = 20;
        double salary = 25000.50;
        int totalMarks = 450;
        boolean isPassed = true;

        System.out.println(age);
        System.out.println(salary);
        System.out.println(totalMarks);
        System.out.println(isPassed);

    }
}
