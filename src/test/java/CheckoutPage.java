import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage extends BaseTest {
    private final SelenideElement chekoutTitle = $("#header_container > div.header_secondary_container > span");
    private final SelenideElement cancelBtn = $("#cancel");
    private final SelenideElement firstNameField = $("#first-name");
    private final SelenideElement lastNameField = $("#last-name");
    private final SelenideElement zipCodeField = $("#postal-code");
    private final SelenideElement continueBtn = $("#continue");
    private final SelenideElement errorMessageFirstN = $("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3");
    private final SelenideElement errorMessageLastN = $("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3");
    private final SelenideElement errorMessageZipCode = $("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3");

    public void checkoutTitle() {
        chekoutTitle.shouldHave(Condition.exactText("Checkout: Your Information"));
    }

    public void clickCancelBtn() {
        cancelBtn.click();
    }

    public void clickContinue() {
        continueBtn.click();
    }

    public void setAddress() {
        firstNameField.setValue("Ivan");
        lastNameField.setValue("Ivanov");
        zipCodeField.setValue("198216");

    }

    public void setFirstNameField() {
        firstNameField.setValue("Ivan");
    }

    public void setLastNameField() {
        lastNameField.setValue("Ivanov");
    }

    public void setZipCodeField() {
        zipCodeField.setValue("198216");
    }

    public void messageErrorName() {
        errorMessageFirstN.shouldHave((Condition.exactText("Error: First Name is required")));
    }

    public void messageErrorLastN() {
        errorMessageLastN.shouldHave((Condition.exactText("Error: Last Name is required")));
    }

    public void messageErrorZip() {
        errorMessageZipCode.shouldHave((Condition.exactText("Error: Postal Code is required")));
    }

}
