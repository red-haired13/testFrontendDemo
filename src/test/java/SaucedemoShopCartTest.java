import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SaucedemoShopCartTest extends BaseTest {

    @Test
    @DisplayName(value = "Добавление товара в корзину(1 товар)")
    public void addCartTest(){
        loginPage.openPage();
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.login();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCart();
        productsPage.searchShopCon();
    }
    @Test
    @DisplayName(value = "Добавление товаров в корзину(2 товара)")
    public void addCartTestTwice(){
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCartTwo();
        productsPage.searchShopTwice();
    }

    @Test
    @DisplayName(value = "Удаление товаров из корзины(2 товара) на странице товаров")
    public void removeCartTestTwice(){
        loginPage.openPage();
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickAddToCartTwo();
        productsPage.searchShopTwice();
        productsPage.clickRemoveCartTwo();
        productsPage.existShopCon();
    }
}
