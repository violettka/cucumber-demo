package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static wolt.pages.DiscoveryPage.cityTextExist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

import java.util.List;

/**
 * Class contains all Homepage locators and methods.
 */
public class Homepage extends Page {

    //locators
    protected static By exploreCitiesText = By.xpath("//span[@data-localization-key='front-view.city-selection.header']");
    protected static By listOfCities = By.xpath("//*[@data-test-id ='ListOfCities']");
    protected static By allCountriesLink = By.xpath("//span[@data-localization-key='front-view.city-selection.all-countries']");
    protected static By allCountriesList = By.cssSelector(".List-module__listOfCountries___KWT6z");
    protected static By cityNames = By.xpath("//span[@data-test-id='ListOfCities']");
    protected static By countryName = By.xpath("//h3/span[2]");
    protected static By localCountry = By.xpath("(//h3/span)[3]");
    protected static By showAllCountriesBtn = By.xpath("//span[@data-localization-key='front-view.city-selection.see-all-countries']");

    //methods
    public void homePageTextExist() {
        $(exploreCitiesText).shouldHave(text("Explore cities"));
    }

    public void clickAllCountriesLink() {
        $(allCountriesLink).click();
    }

    public void checkAllCountriesList() {
        $(allCountriesList).should(exist);
    }

    public void getCountryOption(String country) {
        $(By.xpath("//span[text()='" + country + "']/../../..")).click();
    }

    public void checkListOfCities(String country) {
        $(listOfCities).should(exist);
        $(countryName).shouldHave(text(country));
    }

    public DiscoveryPage clickCityOption(String city) {
        $(By.xpath("//span[text()='" + city + "']/..")).click();
        return page(DiscoveryPage.class);
    }

    public DiscoveryPage clickingOnLogo() {
        $(logo).shouldBe(visible).click();
        return page(DiscoveryPage.class);
    }

    public void checkingCityText(String city) {
        $(cityTextExist).shouldBe(visible);
        $(cityTextExist).shouldHave(Condition.text(city));
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
        $(countryName).shouldBe(visible);
        return $$(countryName).texts();
    }

    public DiscoveryPage clickOnCityName(String cityOption) {
        $(By.linkText(cityOption)).click();
        return page(DiscoveryPage.class);
    }

    public void clickOnCountryName(String countryOption) {
        $(By.linkText(countryOption)).click();
    }
}
