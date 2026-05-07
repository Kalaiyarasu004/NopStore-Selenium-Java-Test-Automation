package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }

    By iphone =
            By.linkText("iPhone");

    By addToCart =
            By.id("button-cart");

    public void openProduct() {

        driver.findElement(iphone)
                .click();
    }

    public void addProductToCart() {

        driver.findElement(addToCart)
                .click();
    }
}