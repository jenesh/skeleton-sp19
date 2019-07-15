public class HelloNumbers {
    public static void main (String [] args) {
        // Print 0 - 9
        int x = 0;
        // while (x < 10) {
        //     System.out.print(x + " ");
        //     x++;
        // }
        
        // Print cumulative sum from 0-9
        int sum = 0;
        while (x < 10) {
            sum += x;
            System.out.print(sum + " ");
            x++;
        }
        // System.out.println(5 + "10");
    }
}

/*
1. System.out.print vs. System.out.println
2. Free of type errors and easier debugging
*/