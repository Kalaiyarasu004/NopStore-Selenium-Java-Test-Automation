package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    By firstName =
            By.id("input-firstname");

    By lastName =
            By.id("input-lastname");

    By email =
            By.id("input-email");

    By telephone =
            By.id("input-telephone");

    By password =
            By.id("input-password");

    By confirmPassword =
            By.id("input-confirm");

    By checkbox =
            By.name("agree");

    By continueBtn =
            By.xpath("//input[@value='Continue']");

    public void registerUser(
            String fn,
            String ln,
            String mail,
            String pass) {

        driver.findElement(firstName)
                .sendKeys(fn);

        driver.findElement(lastName)
                .sendKeys(ln);

        driver.findElement(email)
                .sendKeys(mail);

        driver.findElement(telephone)
                .sendKeys("9876543210");

        driver.findElement(password)
                .sendKeys(pass);

        driver.findElement(confirmPassword)
                .sendKeys(pass);

        driver.findElement(checkbox)
                .click();

        driver.findElement(continueBtn)
                .click();
    }

    public void clickContinueButton() {

        driver.findElement(continueBtn)
                .click();
    }

    public String getFirstNameWarning() {

        return driver.findElement(
                By.xpath("//input[@id='input-firstname']/following-sibling::div")
        ).getText();
    }

    public String getLastNameWarning() {

        return driver.findElement(
                By.xpath("//input[@id='input-lastname']/following-sibling::div")
        ).getText();
    }

    public String getEmailWarning() {

        return driver.findElement(
                By.xpath("//input[@id='input-email']/following-sibling::div")
        ).getText();
    }

    public String getDuplicateEmailWarning() {

        return driver.findElement(
                By.cssSelector(".alert-danger")
        ).getText();
    }
}