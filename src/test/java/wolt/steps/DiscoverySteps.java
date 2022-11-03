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

    @Then("I see {} Discovery page")
    public void iSeeCityDiscoveryPage(String city) {
        discoveryPage.checkCityText(city);
    }

    @When("I click on Sign up button")
    public void iClickOnSignUpButton() {
        discoveryPage.clickOnSignUpBtn();
    }

    @When("I input {} incorrect email")
    public void iInputIncorrectEmail(String incorrectEmail) {
        discoveryPage.inputIncorrectEmail(incorrectEmail);
    }

    @When("I click on Next button")
    public void iClickOnNextButton() {
        discoveryPage.clickOnNextBtn();
    }

    @Then("I see error message")
    public void iSeeErrorMessage() {
        discoveryPage.checkErrorMessageExists();
    }
}