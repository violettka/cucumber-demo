package wolt.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.BASE_URL;


/**
 * Class contains all the steps that can be done from the Discovery page.
 */

public class DiscoverySteps extends StepsBase {


    @Given("I open a Discovery Page in {}")
    public void iOpenADiscoveryPage(String city) {
        open(BASE_URL + city.toLowerCase());
        discoveryPage.accCookies();
    }

    @When("I click on NextBtn")
    public void clickOnNextBtn() {
        discoveryPage.clickOnNextBtn();

    }

    @And("I click on WeWantYouCard Join our team! category")
    public void clickOnWeWantYouCard() {
        jobsPage = discoveryPage.clickOnWeWantYouCard();

    }
}