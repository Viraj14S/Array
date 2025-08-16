import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of  Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the poistion");
        int pos = s.nextInt();
        if (pos <= n && pos <= 0) {

            for (int i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
        } else {

            System.out.println("Invalid position");
        }
        System.out.println("After deleting the element");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}