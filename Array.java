
import java.util.Scanner;

public class Array {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
        int brr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int j = 0; j < brr.length; j ++) {
            brr[j] = scanner.nextInt();
        }
        for(int i = 0; i < brr.length; i ++) {
            System.out.println(brr[i]);
        }
        scanner.close();
    }
}
