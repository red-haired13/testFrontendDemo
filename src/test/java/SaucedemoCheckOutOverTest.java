import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SaucedemoCheckOutOverTest extends BaseTest {
    @Test
    @DisplayName(value = "Проверка товара на странице покупки")
    public void checkoutOverTest() {
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.setAddress();
        checkoutPage.clickContinue();
        CheckoutOverPage checkoutOverPage = new CheckoutOverPage();
        checkoutOverPage.checkSumCon();
    }

    @Test
    @DisplayName(value = "Проверка возврата на страницу Products")
    public void checkoutCheckBackTest() {
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.setAddress();
        checkoutPage.clickContinue();
        CheckoutOverPage checkoutOverPage = new CheckoutOverPage();
        checkoutOverPage.clickCancel();
        productsPage.backProductsPage();
    }
}
