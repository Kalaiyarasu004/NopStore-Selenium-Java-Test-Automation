package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    By email =
            By.id("input-email");

    By password =
            By.id("input-password");

    By loginBtn =
            By.xpath("//input[@value='Login']");

    public void loginUser(
            String mail,
            String pass) {

        driver.findElement(email)
                .sendKeys(mail);

        driver.findElement(password)
                .sendKeys(pass);

        driver.findElement(loginBtn)
                .click();
    }
}