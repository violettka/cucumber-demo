package wolt.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public abstract class Page {

    protected static By logo = By.id("lottie");

    public void accCookies() {
        SelenideElement element = $(By.xpath("//button[2]/div[2]"));
        if (element.exists()) {
            actions().moveToElement(element).click(element).perform();
        }
    }

    public SelenideElement buildXpathTextLocator(String text) {
        return $(By.xpath("//span[text()='" + text + "']"));
    }
}
