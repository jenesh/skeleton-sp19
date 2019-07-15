/** Finding what time the rabbit will catch up to a turtle with a head start */
public class TurtlevsRabbit {
    public static void main(String [] args) {
        double tPos = 100;
        double rPos = 0;
        double tSpeed = 10;
        double rSpeed = 20;
        double totalTime = 0;
        double catchUpTime = 0;
        /** Loops until rPos & tPos are equal */
        while (rPos < tPos) {
            /** Split time */
            catchUpTime = (tPos - rPos) / rSpeed;
            /** Updating total time */
            totalTime = catchUpTime + totalTime;
            /** Updating position every iteration */
            tPos = tPos + catchUpTime * tSpeed;
            rPos = rPos + catchUpTime * rSpeed;
        }
        System.out.print(catchUpTime);
    }
}