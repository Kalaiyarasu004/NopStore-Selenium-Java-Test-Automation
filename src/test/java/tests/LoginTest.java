package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void userLoginTest() {

        HomePage homePage =
                new HomePage(driver);

        homePage.clickLogin();

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.loginUser(
                "john123@gmail.com",
                "Test@123"
        );

    }
}