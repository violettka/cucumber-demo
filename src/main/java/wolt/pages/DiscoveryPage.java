package wolt.pages;

import com.codeborne.selenide.Condition;
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
    protected static By cityTextExist = By.cssSelector("#mainContent>nav>div>div.SubNavigationContainer__Start-sc-1fcwc14-1.hDmuOM>button>span>span");

    //methods
    public void clickOnMenu(String menuOption) {
        $(By.linkText(menuOption)).click();
    }

    public List<String> getRestaurantCategoriesTexts() {
        $(categoryName).shouldBe(visible);
        return $$(categoryName).texts();
    }

    public Homepage clickOnLogo() {
        $(logo).click();
        return page(Homepage.class);
    }

    public void checkCityText(String city) {
        $(cityTextExist).shouldBe(visible);
        $(cityTextExist).shouldHave(Condition.text(city));
    }

    public List<String> getLinkTexts() {
        $(quickLink).shouldBe(visible);
        return $$(quickLink).texts();
    }
}
