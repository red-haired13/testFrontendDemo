import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverPage extends BaseTest {
    private final SelenideElement titleField = $("#header_container > div.header_secondary_container > span");
    private final SelenideElement checkSumCon = $("#checkout_summary_container > div > div.summary_info > div:nth-child(1)");
    private final SelenideElement cancelBtn = $("#cancel");
    private final SelenideElement finishBtn = $("#finish");

    public void checkTitle() {
        titleField.shouldHave(Condition.exactText("Checkout: Overview"));
    }

    public void checkSumCon (){
        checkSumCon.shouldHave(text("Payment Information:"));
    }

    public void clickCancel (){
        cancelBtn.click();
    }
    public void clickFinish(){
        finishBtn.click();
    }
}
