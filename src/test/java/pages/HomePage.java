package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    By myAccount =
            By.xpath("//span[text()='My Account']");

    By register =
            By.linkText("Register");

    By login =
            By.linkText("Login");

    By search =
            By.name("search");

    By searchButton =
            By.xpath("//button[@class='btn btn-default btn-lg']");

    public void clickRegister() {

        driver.findElement(myAccount).click();

        driver.findElement(register).click();
    }

    public void clickLogin() {

        driver.findElement(myAccount).click();

        driver.findElement(login).click();
    }

    public void searchProduct(String product) {

        driver.findElement(search)
                .sendKeys(product);

        driver.findElement(searchButton)
                .click();
    }
}