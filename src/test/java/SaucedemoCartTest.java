import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SaucedemoCartTest extends BaseTest {
    @Test
    @DisplayName(value = "Удаление товара со страницы Корзина")
    public void removeCartTest() {
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickRemoveCart();
        cartPage.existCartCon();
    }

    @Test
    @DisplayName(value = "Возврат на страницу товаров из корзины(кнопка)")
    public void backCartTest() {
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickContinueBtn();
        productsPage.backProductsPage();
    }

    @Test
    @DisplayName(value = "Возврат на страницу товаров из корзины(по кнопке в меню)")
    public void backMenuCartTest() {
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickContinueBtn();
        cartPage.clickMenuBtn();
        cartPage.visibleMenuCon();
        cartPage.clickmenuBackBtn();
        productsPage.backProductsPage();
    }

    @Test
    @DisplayName(value = "Переход на страницу заполнения формы отправки")
    public void checkoutCartTest() {
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.checkoutTitle();
    }
}
