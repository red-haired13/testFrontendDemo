import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SaucedemoCheckCompleteTest extends BaseTest {
    @Test
    @DisplayName(value = "Проверка завершения покупки")
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
        checkoutOverPage.clickFinish();
        CheckoutComplete checkoutComplete = new CheckoutComplete();
        checkoutComplete.checkCompl();

    }

    @Test
    @DisplayName(value = "Возврат на страницу Products после покупки")
    public void checkoutBackHomeTest() {
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
        checkoutOverPage.clickFinish();
        CheckoutComplete checkoutComplete = new CheckoutComplete();
        checkoutComplete.backHome();

    }
}
