import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class CartPage extends BaseTest {
    private final SelenideElement cartContent = $("#cart_contents_container");
    private final SelenideElement removeToCart = $("#remove-sauce-labs-backpack");
    private final SelenideElement continueBtn = $("#continue-shopping");
    private final SelenideElement checkoutBtn = $("#checkout");
    private final SelenideElement cartTitle = $("#header_container > div.header_secondary_container > span");

    public void clickRemoveCart() {
        removeToCart.click();
    }

    public void existCartCon() {
        cartContent.should(exist);

    }


    public void clickContinueBtn() {
        continueBtn.click();
    }

    public void clickCheckoutBtn() {
        checkoutBtn.click();
    }

    public void backCartPage() {
        cartTitle.shouldHave(Condition.exactText("Your Cart"));
    }
}
