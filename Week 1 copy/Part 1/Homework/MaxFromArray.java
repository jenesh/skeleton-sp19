/** Finding max value in array with a method and returning it */
public class MaxFromArray {
    /** Assuming the numbers in the array are all > 0 */
    public static int max(int[] arr) {
        int max = 0;
        int index = 0;
        while (index < arr.length) {
            if (arr[index] > max) {
                max = arr[index];
            }
            index++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = new int[]{10,2,4,6,2};
        System.out.print(max(array));
    }
}