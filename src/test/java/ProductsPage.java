import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementCondition;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductsPage extends BaseTest {
    //private final SelenideElement containerProduct = $("#inventory_container > div > div:nth-child(1)");
    private final SelenideElement addToCard = $("#add-to-cart-sauce-labs-backpack");
    private final SelenideElement addToCardTwo = $("#add-to-cart-sauce-labs-bike-light");
    private final SelenideElement removeToCart = $("#remove-sauce-labs-backpack");
    private final SelenideElement removeToCartTwo = $("#remove-sauce-labs-bike-light");
    private final SelenideElement shopCartCon = $("#shopping_cart_container > a");
    private final SelenideElement shopCartItem = $(".shopping_cart_badge");
    private final SelenideElement shopTitle = $("#header_container > div.header_secondary_container > span");


    public void clickAddToCart() {
        addToCard.click();
    }

    public void clickAddToCartTwo() {
        addToCard.click();
        addToCardTwo.click();
    }


    public void clickRemoveCartTwo() {
        removeToCart.click();
        removeToCartTwo.click();
    }

    public void clickShopCon() {

        shopCartCon.click();
    }

    public void searchShopCon() {

        shopCartItem.shouldHave(text("1"));
    }

    public void searchShopTwice() {

        shopCartItem.shouldHave(text("2"));
    }

    public void existShopCon() {
        shopCartItem.shouldNot(exist);

    }

    public void backProductsPage() {

        shopTitle.shouldHave(Condition.exactText("Products"));
    }
}
