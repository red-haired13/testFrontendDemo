import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SaucedemoCheckoutTest extends BaseTest {
    @Test
    @DisplayName(value = "Возврат на форму Корзины")
    public void checkoutBackPageTest(){
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickCancelBtn();
        cartPage.backCartPage();
    }
    @Test
    @DisplayName(value = "Заполнение формы на отправку(успешный сценарий)")
    public void checkoutCartFillingTest(){
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
        checkoutOverPage.checkTitle();
    }
    @Test
    @DisplayName(value = "Ошибка не заполнено имя клиента -пустые поля")
    public void checkoutCartErrorTest(){
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickContinue();
        checkoutPage.messageErrorName();
    }

    @Test
    @DisplayName(value = "Ошибка не заполнено имя клиента - не заполнено только имя")
    public void checkoutCartErrorNameTest(){
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.setLastNameField();
        checkoutPage.setZipCodeField();
        checkoutPage.clickContinue();
        checkoutPage.messageErrorName();
    }

    @Test
    @DisplayName(value = "Ошибка не заполнено имя клиента - не заполнено имя и фамилия")
    public void checkoutCartErrorNSTest(){
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.setZipCodeField();
        checkoutPage.clickContinue();
        checkoutPage.messageErrorName();
    }

    @Test
    @DisplayName(value = "Ошибка не заполнена фамилия клиента - не заполнено фамилия и индекс")
    public void checkoutCartErrorLastNTest(){
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.setFirstNameField();
        checkoutPage.clickContinue();
        checkoutPage.messageErrorLastN();
    }

    @Test
    @DisplayName(value = "Ошибка не заполнена фамилия клиента - не заполнена только фамилия ")
    public void checkoutCartErrorLastNameTest(){
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.setFirstNameField();
        checkoutPage.setZipCodeField();
        checkoutPage.clickContinue();
        checkoutPage.messageErrorLastN();
    }

    @Test
    @DisplayName(value = "Ошибка не заполнен индекс")
    public void checkoutCartErrorZipTest(){
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.clickShopCon();
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutBtn();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.setFirstNameField();
        checkoutPage.setLastNameField();
        checkoutPage.clickContinue();
        checkoutPage.messageErrorZip();
    }

}
