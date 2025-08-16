
//BUBBLE SORT
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of  Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
                if (count == 0) {
                    break;
                }
            }

        }

        System.out.println("Array after the sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        s.close();
    }

}
