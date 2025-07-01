import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SaucedemoLoginTest extends BaseTest {
    @ParameterizedTest
    @ValueSource(strings = {"standard_user", "performance_glitch_user", "visual_user"})
    @DisplayName(value = "Проверка логина(правильный ввод)")
    public void saucedemoLoginTest(String username) {
        loginPage.setUsername(username);
        loginPage.setPassword("secret_sauce");
        loginPage.login();

    }

    @Test
    @DisplayName(value = "Проверка логина(неправильный ввод пароля)")
    public void saucedemoLoginIncorrectTest() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret");
        loginPage.login();
        loginPage.messageErrorLogin();
    }

    @Test
    @DisplayName(value = "Проверка логина(УЗ заблокирована)")
    public void saucedemoLoginLockTest() {
        loginPage.setUsername("locked_out_user");
        loginPage.setPassword("secret_sauce");
        loginPage.login();
        loginPage.lockErrorLogin();
    }

    @Test
    @DisplayName(value = "Проверка выхода из УЗ")
    public void saucedemoLogoutTest() {
        loginPage.loginAll();
        ProductsPage productsPage = new ProductsPage();
        productsPage.clickMenuBtn();
        productsPage.visibleMenu();
        productsPage.clickLogoutBtn();
        loginPage.visibleUserName();
    }
}
