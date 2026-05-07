package tests;

import base.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

@Listeners(listeners.TestListener.class)

public class RegisterTest extends BaseTest {

    @Test
    public void userRegistrationTest()
            throws InterruptedException {

        HomePage homePage =
                new HomePage(driver);

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);

        homePage.clickRegister();

        Thread.sleep(5000);

        System.out.println(driver.getCurrentUrl());

        RegisterPage registerPage =
                new RegisterPage(driver);

        registerPage.registerUser(
                "John",
                "Doe",
                "kalaiyrsu436@gmail.com",
                "Kalai@1445"
        );
    }
}