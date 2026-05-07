package tests;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTest extends BaseTest {

    @DataProvider(name = "productData")

    public Object[][] getProductData() {

        return new Object[][]{

                {"iPhone"},
                {"Smart Watch"}

        };
    }

    @Test(dataProvider = "productData")

    public void verifyProductSearch(String productName)
            throws InterruptedException {

        HomePage homePage =
                new HomePage(driver);

        homePage.searchProduct(productName);

        Thread.sleep(3000);

        System.out.println(
                "Product searched successfully : "
                        + productName
        );
    }
}