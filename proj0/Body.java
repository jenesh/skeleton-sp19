public class Body {
    public double xxPos = 1.0;
    public double yyPos = 2.0;
    public double xxVel = 3.0;
    public double yyVel = 4.0;
    public double mass = 5.0;
    public String imgFileName = "jupiter.gif";

    public Body(double xP, double yP, double xV, double yV, double m, String img) {
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    public Body(Body b) {
        Body(b);
    }

    public double calcDistance(Body pos2) {
        double xx = Math.pow((this.xxPos - pos2.xxPos), 2);
        double yy = Math.pow((this.yyPos - pos2.yyPos), 2);
        double sum = xx + yy;
        sum = Math.sqrt(sum);

        return sum;
    }
}