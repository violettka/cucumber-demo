package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Class contains all Homepage locators and methods.
 */
public class Homepage extends Page{

    //locators
    protected static By exploreCitiesText = By.xpath("//span[@data-localization-key='front-view.city-selection.header']");
    protected static By showAllCountriesBtn = By.xpath("//span[@data-localization-key='front-view.city-selection.see-all-countries']");
    protected static By localCountry = By.xpath("(//h3/span)[3]");
    protected static By cityChoice = By.xpath("//span[@data-test-id='ListOfCities']");

    //methods
    public void homePageTextExist() {
        $(exploreCitiesText).shouldHave(Condition.text("Explore cities where you find Wolt"));
    }

    public void showAllCountriesBtnClick() {
        $(showAllCountriesBtn).click();
    }

    public String checkForLocalCountry() {
        return $(localCountry).getText();
    }


}
