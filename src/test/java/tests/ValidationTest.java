package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class ValidationTest extends BaseTest {

    @Test
    public void verifyRegistrationValidation()
            throws InterruptedException {

        HomePage homePage =
                new HomePage(driver);

        homePage.clickRegister();

        Thread.sleep(3000);

        RegisterPage registerPage =
                new RegisterPage(driver);

        registerPage.clickContinueButton();

        Thread.sleep(3000);

        System.out.println(
                "First Name Validation : "
                        + registerPage.getFirstNameWarning()
        );

        System.out.println(
                "Last Name Validation : "
                        + registerPage.getLastNameWarning()
        );

        System.out.println(
                "Email Validation : "
                        + registerPage.getEmailWarning()
        );
    }
}