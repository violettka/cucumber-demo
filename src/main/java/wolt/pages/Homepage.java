package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Homepage extends Page {

    protected static By exploreCitiesText = By.xpath("//span[@data-localization-key='front-view.city-selection.header']");

    public void homePageTextExist () {
        $(exploreCitiesText).shouldHave(Condition.text("Explore cities"));
    }
}