package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest()
            throws InterruptedException {

        HomePage homePage =
                new HomePage(driver);

        homePage.searchProduct("iPhone");

        Thread.sleep(5000);

        ProductPage productPage =
                new ProductPage(driver);

        productPage.openProduct();

        Thread.sleep(10000);

        productPage.addProductToCart();

        System.out.println(
                "Product Added To Cart Successfully"
        );
    }
}