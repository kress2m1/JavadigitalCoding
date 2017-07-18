package SuiteRunner;

import brownDonaldsonInvestmentTest.CreateNewAccountWrapper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import registeredUserAccountTest.UserAccountHomePageWrapper;

/**
 * Created by andredadalinux on 23/06/17.
 *
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserAccountHomePageWrapper.class
})
public class SuiteRunnerTest {

    /**
     * Inside here, the @BeforeClass and @AfterClass
     * can be added here where they need to be run once
     * as part of the test suite
     */

    @BeforeClass
    public static void runOnce() {
        System.out.println("CONNECTING TO THE DATABASE BEFORE THE TEST RUN STARTS...\n");
    }

    @AfterClass
    public static void endOnce() {
        System.out.println("DISCONNECTING FROM THE DATABASE AFTER TEST RUN ENDS...");
    }
}
