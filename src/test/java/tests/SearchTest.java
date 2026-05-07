package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTest extends BaseTest {

    @Test
    public void searchProductTest() {

        HomePage homePage =
                new HomePage(driver);

        homePage.searchProduct("iPhone");

        System.out.println("Search Test Passed");
    }
}