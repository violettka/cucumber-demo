package wolt.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.BASE_URL;

/**
 * Class contains all the steps that can be done from the Homepage.
 */
public class HomepageSteps extends StepsBase {

    @Given("I open Wolt Homepage")
    public void iOpenADiscoveryPage() {
        open(BASE_URL);
        homepage.accCookies();
        homepage.homePageTextExist();
    }

    @Then("I should see Homepage")
    public void iShouldSeeHomepage() {
        homepage.homePageTextExist();
    }

    @Then("I choose {} in {}")
    public void iChooseCityInCountry(String city, String country) {
        if (!homepage.checkForLocalCountry().equals(country)) {
            homepage.showAllCountriesBtnClick();
            homepage.clickOnCountryName(country);
        }
        discoveryPage = homepage.clickOnCityName(city);
    }

    @Then("I choose {} pointer")
    public void iChooseCityName(String city) {
        List<String> cityNames = homepage.getCityNames();
        Assert.assertTrue(cityNames.contains(city));
        discoveryPage = homepage.clickOnCityName(city);
    }

    @Then("I choose {} button")
    public void iChooseCountryName(String country) {
        List<String> countryNames = homepage.getCountryNames();
        Assert.assertTrue(countryNames.contains(country));
        homepage.clickOnCountryName(country);
    }
}
