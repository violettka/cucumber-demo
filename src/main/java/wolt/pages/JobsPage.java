package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * Class JobsPage contains all locators and methods page.
 */
public class JobsPage extends Page {
    // locators
    public static By joinUs = By.xpath("//*[@id='mainContent']/div/div/div[2]/div/div[1]/h2/span");

    // methods
    public void iSeeJoinUs(String text) {
        $(joinUs).shouldBe(visible);
        $(joinUs).shouldHave(Condition.text(text));
    }
}
