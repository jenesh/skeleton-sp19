public class Body {
    public double xxPos = 1.0;
    public double yyPos = 2.0;
    public double xxVel = 3.0;
    public double yyVel = 4.0;
    public double mass = 5.0;
    public String imgFileName = "jupiter.gif";
    public static double gravitationalPull = 6.67e-11;

    public Body(double xP, double yP, double xV, double yV, double m, String img) {
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    public Body(Body b) {
        
    }

    public double calcDistance(Body pos2) {
        double xx = Math.pow(( pos2.xxPos - this.xxPos), 2);
        double yy = Math.pow(( pos2.yyPos - this.yyPos), 2);
        double sum = xx + yy;
        sum = Math.sqrt(sum);

        return sum;
    }

    public double calcForceExertedBy(Body b2) {
        double force = (gravitationalPull * this.mass * b2.mass) / Math.pow(calcDistance(b2),2);
        return force;
    }

    public double calcForceExertedByX(Body b2) {
        double pairWiseForce = calcForceExertedBy(b2);
        double radius = calcDistance(b2);
        // double forceX1 = pairWiseForce * this.xxVel / radius;
        double forceX = pairWiseForce * b2.xxVel / radius;

        return forceX;
    }

    public double calcForceExertedByY(Body b2) {
        double pairWiseForce = calcForceExertedBy(b2);
        double radius = calcDistance(b2);
        // double forceY1 = pairWiseForce * this.yyVel / radius;
        double forceY = pairWiseForce * b2.yyVel / radius;
        // double netForceY = forceY1 + forceY2;
        return forceY;
    }

    Body[] allBodys = {this.Body, this};

    public double calcNetForceExertedByX(Body b2) {
        double forceX1 = calcForceExertedByX(this.)
        return netForceX
    }
}