package Calculator;

/**
 * Created by andredadalinux on 20/07/17.
 */
public class Calculate {

    private int numOne;
    private int numTwo;

    public Calculate(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public void AddMe(int numOne, int numTwo) {
        System.out.println("Add numbers");
        int answer = numOne + numTwo;
        System.out.println(answer);
    }
}
