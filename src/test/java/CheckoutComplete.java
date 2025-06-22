import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutComplete extends BaseTest {
    private final SelenideElement completeHeader = $("#checkout_complete_container > h2");
    private final SelenideElement backHome = $("#back-to-products");

    public void checkCompl(){
        completeHeader.shouldHave(Condition.exactText("Thank you for your order!"));
    }

    public void backHome (){
        backHome.click();
    }
}
