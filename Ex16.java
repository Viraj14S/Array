
//WAJP TO CHECK IF ARRAY IS PALINDROME OR NOT
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int str = 0;
        int arrr[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arrr[str++] = arr[i];
        }
        boolean palindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (arrr[i] != arr[i]) {
                palindrome = false;
            }
        }

        if (palindrome) {
            System.out.println("The Given an array is a Palindrome");
        } else {
            System.out.println("The Given an array is not Palindrome");
        }
        s.close();
    }
}
