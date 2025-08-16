
// WAJP TO IDENTIFY THE SMALLEST ELEMENT FROM AN ARRAY
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest element from the array is: " + smallest);

        s.close();
    }
}
