package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public void addToWishlist()
            throws InterruptedException {

        WebElement wishlist =
                driver.findElement(wishlistButton);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].scrollIntoView(true);",
                wishlist
        );

        Thread.sleep(2000);

        js.executeScript(
                "arguments[0].click();",
                wishlist
        );
    }
}