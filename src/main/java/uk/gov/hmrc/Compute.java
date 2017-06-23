package uk.gov.hmrc;

/**
 * Created by andre on 24/05/17.
 */
public class Compute {

    double a, b;

    public Compute(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double AddMe() {
        System.out.print("The sum of a + b is: ");
        return a + b;
    }

    public double SubMe() {
        System.out.print("The sub of a - b is: ");
        return a - b;
    }
}
