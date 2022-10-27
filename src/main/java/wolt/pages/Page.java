package wolt.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Class contains locators and methods that can be used from many pages of the site.
 */
public abstract class Page {

    //locators
    protected static By logo = By.id("lottie");
    protected static By mainHeader = By.xpath("(//h1)[1]");

    public void accCookies() {
        SelenideElement element = $(By.xpath("//button[2]/div[2]"));
        if (element.exists()) {
            actions().moveToElement(element).click(element).perform();
        }
    }

    public Homepage clickOnLogo() {
        $(logo).shouldBe(visible).click();
        return page(Homepage.class);
    }

    public String getMainHeaderText() {
        $(mainHeader).shouldBe(visible);
        return $(mainHeader).getText();
    }
}
