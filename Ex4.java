//WAJP TO IDENTIFY THE EVEN INDEX ELEMENT

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("The Even index number are:");
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        s.close();
    }
}
