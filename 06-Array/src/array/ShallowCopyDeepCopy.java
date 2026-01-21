package array;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        // shallow copy: Array me shallow copy ka matlab hota hai sirf array ka
        // reference copy hona, actual array ka data copy nahi hota.

        // 🔹 Simple Words

        // Dono variables same array ko point karte hain
        // Memory same hoti hai
        // Ek me change → dusre me bhi change

        int[] arr1 = { 10, 20, 30 };

        int[] arr2 = arr1; // Shallow Copy

        arr2[0] = 99;

        System.out.println(arr1[0]); // 99

        // Deep copy: Deep copy in array ka matlab hai naya array banana aur har element
        // ko alag-alag copy karna.

        // 🔹 Simple Words

        // New array
        // New memory
        // Arrays independent hote hain
        // Ek me change → dusre pe koi effect nahi

        int[] arr4 = { 10, 20, 30 };

        int[] arr5 = new int[arr4.length];

        for (int i = 0; i < arr4.length; i++) {
            arr5[i] = arr4[i]; // Deep Copy
        }

        arr5[0] = 99;

        System.out.println(arr4[0]); // 10
    }
}
