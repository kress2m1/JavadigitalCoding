package registeredUserAccountTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import registeredUserAccount.UserAccountHomePage;

/**
 * Created by andre on 15/06/17.
 *
 */
public class UserAccountHomePageWrapper {

    UserAccountHomePage userAccountHomePage = new UserAccountHomePage();

    @Before
    public void setUp() throws Exception {
        userAccountHomePage.startBrowserSession("chrome");
    }

    @Test
    public void logIntoSSLAccount() {
        String username = "WaleJamesMeMe";
        String password = "Skr2ll8mings";
        userAccountHomePage.logIntoAccount(username, password);
    }

    @After
    public void tearDown() throws Exception {
        userAccountHomePage.closeBrowserSession();
    }
}
