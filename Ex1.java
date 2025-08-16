import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the number in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Elements of Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}
