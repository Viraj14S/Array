//WAJP TO IDENTIFY THE PAIRS OF ELEMENTS WHICH IS EQUAL TO THE GIVEN ELEMENT FROM AN ARRAY

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the element of an Array");
        int element = s.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (element == arr[i] + arr[j]) {
                    System.out.println("The " + arr[i] + " and " + arr[j] + " is the pair of element " + element);
                }
            }
        }
        s.close();
    }
}
