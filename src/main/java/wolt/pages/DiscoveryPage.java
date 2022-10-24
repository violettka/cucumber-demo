package wolt.pages;

import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DiscoveryPage extends Page {

    protected static By categoryName = By.cssSelector(".CategoryCardBody__Header-sc-1quwqfy-2");

    public void clickOnMenu(String menuOption) {
        $(By.linkText(menuOption)).click();
    }

    public List<String> getRestaurantCategoriesTexts() {
        $(categoryName).shouldBe(visible);
        return $$(categoryName).texts();
    }

    public Homepage clickOnLogo () {
    $(logo).click();
    return page(Homepage.class);
    }

}
