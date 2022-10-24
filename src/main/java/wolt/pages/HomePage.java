package wolt.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends Page {

    public void clickOnMenu(String menuOption) {
        $(By.linkText(menuOption)).click();
    }

    public ElementsCollection getRestaurantCategoriesSize() {
        return $$(By.cssSelector(".CategoryCardBody__Header-sc-1quwqfy-2"));
    }
}
