package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutValidationTest
        extends BaseTest {

    @Test
    public void verifyCheckoutValidation()
            throws InterruptedException {

        CheckoutPage checkoutPage =
                new CheckoutPage(driver);

        checkoutPage.openCheckout();

        Thread.sleep(3000);

        checkoutPage.clickContinue();

        Thread.sleep(3000);

        System.out.println(
                checkoutPage.getWarningMessage()
        );
    }
}