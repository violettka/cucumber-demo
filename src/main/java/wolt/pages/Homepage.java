package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Class contains all Homepage locators and methods.
 */
public class Homepage extends Page{

    //locators
    protected static By exploreCitiesText = By.xpath("//span[@data-localization-key='front-view.city-selection.header']");
    protected static By showAllCountriesBtn = By.xpath("//span[@data-localization-key='front-view.city-selection.see-all-countries']");
    protected static By localCountry = By.xpath("(//h3/span)[3]");
    protected static By cityNames = By.xpath("//span[@data-test-id='ListOfCities']");
    protected static By countryNames = By.xpath("//div[@class='List-module__listOfCountries___KWT6z']");

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

    public List<String> getCityNames() {
        $(cityNames).shouldBe(visible);
        return $$(cityNames).texts();
    }

    public List<String> getCountryNames() {
        $(countryNames).shouldBe(visible);
        return $$(countryNames).texts();
    }

    public DiscoveryPage clickOnCityName(String cityOption) {
        $(By.linkText(cityOption)).click();
        return page(DiscoveryPage.class);
    }

    public void clickOnCountryName(String countryOption) {
        $(By.linkText(countryOption)).click();
    }
}
