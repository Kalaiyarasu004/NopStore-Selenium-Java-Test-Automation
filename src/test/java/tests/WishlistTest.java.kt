package tests

import base.BaseTest
import org.testng.annotations.Test
import pages.HomePage
import pages.WishlistPage

class WishlistTest : BaseTest() {
    @Test
    @kotlin.Throws(InterruptedException::class)
    fun addProductToWishlist() {
        val homePage =
            HomePage(driver)

        homePage.searchProduct("iPhone")

        Thread.sleep(3000)

        val wishlistPage =
            WishlistPage(driver)

        wishlistPage.openProduct()

        Thread.sleep(3000)

        wishlistPage.addToWishlist()

        Thread.sleep(3000)

        println(
            "Product Added To Wishlist Successfully"
        )
    }
}