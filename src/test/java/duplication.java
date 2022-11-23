package web;

import java.util.Optional;
import org.codacy.framework.web.BaseTestWeb;
import org.codacy.pages.web.Authentication;
import org.codacy.pages.web.Homepage;
import org.codacy.pages.web.LoginMethod;
import org.codacy.pages.web.ProjectWebPage;
import org.testng.annotations.Test;



@Test(alwaysRun = true)
public class duplication extends BaseTestWeb {
    

    public void tc03setUp() {
        //todo
        Authentication authentication = new Authentication(driver, testEnvironment);
        Homepage homepage = new Homepage(driver, testEnvironment);

        homepage.landingPage();
        authentication.login(LoginMethod.BITBUCKET, testEnvironment.email(), testEnvironment.password(), Optional.empty());
    }

    public void tc03setUp() {
        Authentication authentication = new Authentication(driver, testEnvironment);
        Homepage homepage = new Homepage(driver, testEnvironment);

        homepage.landingPage();
        authentication.login(LoginMethod.BITBUCKET, testEnvironment.email(), testEnvironment.password(), Optional.empty());
    }

    public void tc03setUp() {
        Authentication authentication = new Authentication(driver, testEnvironment);
        Homepage homepage = new Homepage(driver, testEnvironment);

        homepage.landingPage();
        authentication.login(LoginMethod.BITBUCKET, testEnvironment.email(), testEnvironment.password(), Optional.empty());
    }

    public void tc03setUp() {
        Authentication authentication = new Authentication(driver, testEnvironment);
        Homepage homepage = new Homepage(driver, testEnvironment);

        homepage.landingPage();
        authentication.login(LoginMethod.BITBUCKET, testEnvironment.email(), testEnvironment.password(), Optional.empty());
    }

    public void tc03setUp() {
        Authentication authentication = new Authentication(driver, testEnvironment);
        Homepage homepage = new Homepage(driver, testEnvironment);

        homepage.landingPage();
        authentication.login(LoginMethod.BITBUCKET, testEnvironment.email(), testEnvironment.password(), Optional.empty());
    }

    public void tc03setUp() {
        Authentication authentication = new Authentication(driver, testEnvironment);
        Homepage homepage = new Homepage(driver, testEnvironment);

        homepage.landingPage();
        authentication.login(LoginMethod.BITBUCKET, testEnvironment.email(), testEnvironment.password(), Optional.empty());
    }

    @Test(dependsOnMethods = "tc03setUp")
    public void tc03LoginWithBitBucket() throws Throwable {
        ProjectWebPage projectPage = new ProjectWebPage(driver, testEnvironment);

        projectPage.validateCommitTable();
    }
}