package wolt.pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Class contains all Privacy page locators and methods.
 */
public class PrivacyPage extends Page{

    //locators
    protected static By headerLinks = By.cssSelector(".Header-module__headerLinks___WSM53");

    // на странице нет h1, надо как-то переопределить protected static By mainHeader = By.xpath("//h1");
    protected static By mainHeader = By.xpath("//strong[contains( text(),'WOLT PRIVACY STATEMENT')]");

    //methods
    public List<String> getHeaderLinksTexts() {
        $(headerLinks).shouldBe(visible);
        return $$(headerLinks).texts();
    }

    public void clickOnHeaderLink(String headerLink) {
        $(By.linkText(headerLink)).click();
    }

    public PrivacyPage clickOnMainHeaderText() {
        $(mainHeader).shouldBe(visible).click();
        return page(PrivacyPage.class);
    }
}
