package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
    }

    By checkoutButton =
            By.linkText("Checkout");

    By continueButton =
            By.id("button-payment-address");

    public void openCheckout() {

        driver.findElement(checkoutButton)
                .click();
    }

    public void clickContinue() {

        driver.findElement(continueButton)
                .click();
    }

    public String getWarningMessage() {

        return driver.findElement(
                By.cssSelector(".text-danger")
        ).getText();
    }
}