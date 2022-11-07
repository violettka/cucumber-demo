package wolt.pages;

import org.openqa.selenium.By;
import java.util.List;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Class contains all Discovery page locators and methods.
 */
public class DiscoveryPage extends Page {

    //locators
    protected static By categoryName = By.cssSelector(".CategoryCardBody__Header-sc-1quwqfy-2");
    protected static By quickLink = By.cssSelector(".QuickLinks-module__itemWrapper____Ne1r");
    protected static By discoveryPageLayout = By.xpath("//div[@data-test-id='MainDiscoveryContent']");
    protected static By sendAGiftBtn = By.linkText("Send a gift");

    //methods
    public List<String> getRestaurantCategoriesTexts() {
        $(categoryName).shouldBe(visible);
        return $$(categoryName).texts();
    }

    public void clickOnMenu(String menuOption) {
        $(By.linkText(menuOption)).click();
    }

    public void clickOnGiftCardShop() {
        $(sendAGiftBtn).click();
    }

    public List<String> getLinkTexts() {
        $(quickLink).shouldBe(visible);
        return $$(quickLink).texts();
    }

    public void discoveryPageLayoutPresent() {
        $(discoveryPageLayout).should(exist);
    }
}
