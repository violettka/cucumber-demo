package wolt.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import wolt.pages.DiscoveryPage;
import wolt.pages.Homepage;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.BASE_URL;


public class DiscoverySteps extends StepsBase {


    @Given("I open a Discovery page in {}")
    public void iOpenAHomepage(String city) {
        open(BASE_URL + city.toLowerCase());
        discoveryPage.accCookies();
    }

    @When("I click on {} menu option")
    public void iSeeMenuOption(String menuOption) {
        discoveryPage.clickOnMenu(menuOption);
    }

    @Then("I see {} restaurant category")
    public void iSeeRestaurantCategory(String category) {
        List<String> categories = discoveryPage.getRestaurantCategoriesTexts();
        Assert.assertTrue(categories.contains(category));
    }

    @When("I click logo icon")
    public void iClickLogoIcon() {
        homepage = discoveryPage.clickOnLogo();
    }

    @When("I click All countries link")
    public void iClickAllCountriesLink(){
       discoveryPage.clickAllCountriesLink();
    }

    @Then("I see list of countries")
    public void iSeeListOfCountries(){
        discoveryPage.getAllCountriesList();
    }

    @When("I click Sweden option")
    public void iClickSwedenOption(){
        discoveryPage.getSwedenOption();
    }

    @Then("I see list of cities in Sweden")
    public void iSeeListOfCitiesInSweden(){
        discoveryPage.getListOfCitiesInSweden();
    }

    @When("I click Malmö option")
    public void iClickMalmoOption(){
        discoveryPage.getMalmoOption();
    }

    @Then("I see Malmö Discovery page")
    public void iSeeMalmoDiscoveryPage(){
        discoveryPage.getMalmoText();
    }
}