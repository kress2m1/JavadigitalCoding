package Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andredadalinux on 20/07/17.
 */
public class CalcRun {

    Calculate calculate = new Calculate(7, 5);

    @Before
    public void doBeforeTest() {

    }

    @Test
    public void runAddMe() {
        calculate.AddMe(5, 4);
    }
}
