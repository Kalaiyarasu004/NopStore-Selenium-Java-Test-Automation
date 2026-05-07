package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {

    WebDriver driver;

    public WishlistPage(WebDriver driver) {

        this.driver = driver;
    }

    By iphone =
            By.linkText("iPhone");

    By wishlistButton =
            By.xpath("//button[@data-original-title='Add to Wish List']");

    public void openProduct() {

        driver.findElement(iphone)
                .click();
    }

    public void addToWishlist() {

        driver.findElement(wishlistButton)
                .click();
    }
}