package uk.gov.hmrc;

import java.util.Scanner;

/**
 * Created by andre on 24/05/17.
 * The runner file for the Compute build is 'main'
 */
public class ComputeWrapper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first integer");
        double firstNumber = scanner.nextDouble();

        System.out.println("Please enter the second integer");
        double secondNumber = scanner.nextDouble();

        Compute compute = new Compute(firstNumber, secondNumber);

//        call the AddMe method
        double answer = compute.AddMe();
        System.out.println(answer);

//        Call the SubMe method
         answer = compute.SubMe();
        System.out.println(answer);

    }
}
