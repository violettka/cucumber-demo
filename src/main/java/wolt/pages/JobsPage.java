package wolt.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * Class contains all Homepage locators and methods.
 */
public class JobsPage extends Page {

    //locators
    public static By categoryField = By.className("//*[@class='Category']");

    //methods
    public void iSeeCategoryField() {
        $(categoryField).shouldBe(visible);

    }


}