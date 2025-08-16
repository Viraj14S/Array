
//WAJP TO SEARCH AN ELEMENT IN AN ARRAY
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element to be searched in Array");
        int element = s.nextInt();

        boolean elementfound = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                elementfound = true;
            }
        }

        if (elementfound)
            System.out.println("Element found");

        else
            System.out.println("Element not found");

        s.close();
    }
}
