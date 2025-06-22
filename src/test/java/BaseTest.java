import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    public LoginPage loginPage;
    public ProductsPage productsPage;

    @BeforeAll
    public static void setUp() {
        Configuration.browser = "chrome";
    }

    @BeforeEach
    public void setupTest() {
        // Открытие страницы логина перед каждым тестом
        loginPage = new LoginPage();
        loginPage.openPage();
    }

    @AfterEach
    public void tearDownTest() {
        // Выход из системы после каждого теста
        loginPage = new LoginPage();
        loginPage.logoutPage();
    }
}