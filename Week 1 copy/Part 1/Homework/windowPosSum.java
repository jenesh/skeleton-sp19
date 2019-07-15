/** Takes in array and adds n number of items to the right of it, up until the last item */
public class windowPosSum {
    public static int[] arrSum(int[] arr, int n) {
        /** Code Works but when printing function from main
            it does not give back the array instead a some weird
            number and letters. When changing return to 
            arr[0]...arr[arr.length - 1] it prints out the correct
            output. 
        */
        // for (int i = 0; i < arr.length; i++) {
        //     if (i == arr.length -1) {
        //             System.out.println(arr[i]);
        //             break;
        //         }
        //         if (arr[i] < 0) {
        //             System.out.println(arr[i]);
        //             continue;
        //         }
        //         if (i + n > arr.length - 1) {
        //             n = arr.length - i - 1;
        //         }
        //         for (int j = 1; j <= n; j++) {
        //             arr[i] += arr[i + j];
        //         }
        //  }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, 5, 4};
        int n = 3;
        // System.out.print(Arrays.toString(arrSum(arr, n)));
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                System.out.println(arr[i]);
                break;
            }
            if (arr[i] < 0) {
                System.out.println(arr[i]);
                continue;
            }
            if (i + n > arr.length - 1) {
                n = arr.length - i - 1;
            }
            for (int j = 1; j <= n; j++) {
                arr[i] += arr[i + j];
            }
            System.out.println(arr[i]);
            // {4, 8, -3, 13, 9, 4}
        }
    }
}