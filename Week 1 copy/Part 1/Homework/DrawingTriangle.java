/** Draw a triangle using loops that works with size n */
public class DrawingTriangle {
    public static String MakeTriangle(int size) {
        int x = size;
        int current = 0;
        String string = "";
        /** 1st Loop sets the n-th string variable on a new line */
        while (x > current) {
            int row = 0;
            /** 2nd Loop adds n number of 'x' based on the row number */
            while (row <= current) {
                string = string + "x";
                row++;
            }
            /** Adds onto string variable a new line after n-th iteration of adding 'x' */
            string = string + "\n";
            current++;
        }
        return string;
    }
    public static void main(String [] args) {
        System.out.print(MakeTriangle(5));
    }
}