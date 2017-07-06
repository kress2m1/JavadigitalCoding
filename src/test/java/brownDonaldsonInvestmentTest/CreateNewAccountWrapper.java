package brownDonaldsonInvestmentTest;

import org.junit.*;
import pages.CreateAccountPage;

/**
 * Created by andre on 12/06/17.
 * Run the test for the landing page from here
 */

public class CreateNewAccountWrapper {

    CreateAccountPage createAccountPage = new CreateAccountPage();

    @Before
    public void setUp() throws Exception {
        createAccountPage.openLandingPage("chrome");
    }

    @Test
    public void confirmLandingPageTitle() throws Exception {
        createAccountPage.verifyLandingPage();
        createAccountPage.goToNewSSLAccountCreationPage();
        createAccountPage.createNewSSLAccount();
//        Add an assert here later on to confirm
    }

    @After
    public void tearDown() throws Exception {
        createAccountPage.closeBrower();
    }
}
