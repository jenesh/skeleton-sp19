/** Same program as MaxFromArray.java but using for loop instead of while loop */
public class MaxWithForLoop {
    public static int max(int[] arr) {
        int max = arr[0];
        /** Replacing while loop with a for loop with everything else the same pretty much */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = new int[]{10,2,3,6,7};
        System.out.print(max(array));
    }
}
