package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class DuplicateEmailTest extends BaseTest {

    @Test
    public void verifyDuplicateEmailValidation()
            throws InterruptedException {

        HomePage homePage =
                new HomePage(driver);

        homePage.clickRegister();

        Thread.sleep(3000);

        RegisterPage registerPage =
                new RegisterPage(driver);

        registerPage.registerUser(
                "John",
                "Doe",
                "john123@gmail.com",
                "Test@123"
        );

        Thread.sleep(3000);

        System.out.println(
                registerPage.getDuplicateEmailWarning()
        );
    }
}