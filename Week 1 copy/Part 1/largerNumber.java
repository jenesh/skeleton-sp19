/** Defining a class with a method that return larger number */
public class largerNumber {
    public static int LargerNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    public static void main(String [] args) {
        System.out.print(LargerNumber(-5, 24));
    }
}

/*
1. Functions must be declared as  apart of the class
2. Function that is part of a class is called a method
3. All functions are methods
4. To define function use public static
5. All parameters must have a declared type as well as the return value
6. Functions only return one value
*/