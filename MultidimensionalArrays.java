public class MultidimensionalArrays {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int values = 1;
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                arr[i][j] = values;
                values ++;
            }
        }
        for (int[] brr: arr) {
            for (int value: brr) {
                System.out.println("The value is : " + value);
            }
        }
    }
}
