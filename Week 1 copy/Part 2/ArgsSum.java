public class ArgsSum {
    public static void main(String[] args) {
        int length = args.length; // Length of command line arguments
        int i = 0;
        int sum = 0;

        while (i < length) {
            sum += Integer.parseInt(args[i]); // Integer.parseInt() => Converts string to integer
            i++;
        }
        System.out.print(sum);
    }
}