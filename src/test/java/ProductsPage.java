import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;


public class ProductsPage extends BaseTest {
    private final SelenideElement addToCard = $("#add-to-cart-sauce-labs-backpack");
    private final SelenideElement addToCardTwo = $("#add-to-cart-sauce-labs-bike-light");
    private final SelenideElement removeToCart = $("#remove-sauce-labs-backpack");
    private final SelenideElement removeToCartTwo = $("#remove-sauce-labs-bike-light");
    private final SelenideElement shopCartCon = $("#shopping_cart_container > a");
    private final SelenideElement shopCartItem = $(".shopping_cart_badge");
    private final SelenideElement shopTitle = $("#header_container > div.header_secondary_container > span");
    private final SelenideElement menuBtn = $("#react-burger-menu-btn");
    private final SelenideElement menuBtnCon = $("#menu_button_container > div > div.bm-menu-wrap > div.bm-menu > nav");
    private final SelenideElement closeMenuBtn = $("#react-burger-cross-btn");
    private final SelenideElement logoutBtn = $("#logout_sidebar_link");


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

    public void clickMenuBtn() {
        menuBtn.click();
    }

    public void clickLogoutBtn() {
        logoutBtn.click();
    }

    public void clickCloseMenuBtn(){
        closeMenuBtn.click();
    }

    public void visibleMenu() {
        menuBtnCon.should(exist);
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
