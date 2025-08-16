//WAJP TO PRINT THE PRIME FROM AN ARRAY

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of  Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The Prime number from ans Array are:");
        for (int i = 0; i < n; i++) {
            if (isprime(arr[i])) {
                System.out.println(arr[i]);
            }
        }
        s.close();
    }

    public static boolean isprime(int n) {
        if (n == 1 || n <= 0) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
