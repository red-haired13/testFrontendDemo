import com.codeborne.selenide.SelenideElement;
import org.example.ConfProperties;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BaseTest {
    private final SelenideElement usernameField = $("#user-name");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login-button");
    private final SelenideElement errorMessage = $("#login_button_container");

    public void openPage(){
        open(ConfProperties.getProperty("URL"));
    }

    public void logoutPage() {
        closeWebDriver();
    }

    public void setUsername(String username) {
        // Ввод имени пользователя
        usernameField.setValue(username);
    }

    public void setPassword(String password) {
        // Ввод пароля
        passwordField.setValue(password);
    }

    public void login() {
        // Нажатие кнопки входа
        loginButton.click();
    }

    public void messageErrorLogin() {
        errorMessage.shouldHave(text("Epic sadface: Username and password do not match any user in this service"));
    }

    public void lockErrorLogin() {
        errorMessage.shouldHave(text("Epic sadface: Sorry, this user has been locked out."));
    }

    public void loginAll() {
        usernameField.setValue(ConfProperties.getProperty("username"));
        passwordField.setValue(ConfProperties.getProperty("password"));
        loginButton.click();
    }

    public void visibleUserName() {
        usernameField.should(exist);
    }
}
