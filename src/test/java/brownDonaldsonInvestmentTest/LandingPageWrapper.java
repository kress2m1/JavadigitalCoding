package brownDonaldsonInvestmentTest;

import org.junit.*;
import brownDonaldsonInvestment.LandingPage;
import registeredUserAccount.UserAccountHomePage;

/**
 * Created by andre on 12/06/17.
 * Run the test for the landing page from here
 */

public class LandingPageWrapper {

    LandingPage landingPage = new LandingPage();

    @Before
    public void setUp() throws Exception {
        landingPage.openLandingPage("chrome");
    }

    @Test
    public void confirmLandingPageTitle() throws Exception {
        landingPage.verifyLandingPage();
        landingPage.goToNewSSLAccountCreationPage();
        landingPage.createNewSSLAccount();
    }

    @After
    public void tearDown() throws Exception {
        landingPage.closeBrower();
    }
}
