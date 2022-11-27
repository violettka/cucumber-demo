package wolt.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wolt.pages.Homepage;

import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.BASE_URL;

/**
 * Class HomePgeSteps contains all base steps.
 */
public class HomepageSteps extends StepsBase {

    @Then("I should see Homepage")
    public void iShouldSeeHomepage() {
        homepage.homePageTextExist();
    }

    @When("I click All countries link")
    public void iClickAllCountriesLink() {
        homepage.clickAllCountriesLink();
    }

    @Then("I see list of countries")
    public void iSeeListOfCountries() {
        homepage.checkAllCountriesList();
    }

    @When("I click {} country option")
    public void iClickCountryOption(String country) {
        homepage.getCountryOption(country);
    }

    @Then("I see list of cities in {}")
    public void iSeeListOfCities(String country) {
        homepage.checkListOfCities(country);
    }

    @When("I click {} city option")
    public void iClickCityOption(String city) {
        discoveryPage = homepage.clickCityOption(city);
    }

    @Given("I am on the Homepage")
    public void iAmOnTheHomepage() {
        open(BASE_URL);
        homepage = new Homepage();
        homepage.accCookies();
    }
}
