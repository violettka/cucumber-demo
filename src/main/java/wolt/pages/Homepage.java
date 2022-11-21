package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static wolt.pages.DiscoveryPage.cityTextExist;

/**
 * Class contains all Homepage locators and methods.
 */
public class Homepage extends Page {

    //locators
    protected static By exploreCitiesText = By.xpath("//span[@data-localization-key='front-view.city-selection.header']");
    protected static By listOfCities = By.xpath("//*[@data-test-id ='ListOfCities']");
    protected static By allCountriesLink = By.xpath("//span[@data-localization-key='front-view.city-selection.all-countries']");
    protected static By allCountriesList = By.cssSelector(".List-module__listOfCountries___KWT6z");
    protected static By countryName = By.xpath("//h3/span[2]");

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
}