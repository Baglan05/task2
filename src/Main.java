import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int n = sec.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sec.nextInt();
        }
        System.out.println(func(n, arr));
    }
     /**

     * This method calculates the average of an array of integers.
     * It uses a loop to iterate through the array, summing up the elements.
     * The average is calculated by dividing the sum by the number of elements.
     * Time complexity: O(n), where n is the length of the input array.

     * @param n       The number of elements in the array.
     * @param arr     The array of integers to average.
     * @return        The average of the elements in the array, as a double.

     **/

    public static double func(int n, int[] arr){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        return (double) sum / n;
    }
}