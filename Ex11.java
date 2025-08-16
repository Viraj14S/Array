
//WAJP TO IDENTIFY THE NUMBER OF +VE ELEMENT AND NO OF -VE ELEMENTS
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int positve = 0;
        int negative = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positve++;
            } else {
                negative++;
            }
        }
        System.out.println("The number of positive elements are " + positve);
        System.out.println("The number of negative elements are " + negative);
        s.close();
    }
}
