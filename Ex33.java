import java.util.Arrays;

public class Ex33 {
    public static void main(String[] args) {

        int arr[] = { 5, 43, 24, 53, 12, 4 };

        System.out.println("Before sorting the element");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));
    }

}
