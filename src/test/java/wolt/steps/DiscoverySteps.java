package wolt.steps;

import io.cucumber.java.en.And;
import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.BASE_URL;

/**
 * Class contains all the steps that can be done from the Discovery page.
 */
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

    @Given("I see {} link on Discovery Page in {}")
    public void iSeeQuickLinks(String quickLink, String city) {
        open(BASE_URL + city.toLowerCase());
        discoveryPage.accCookies();
        List<String> quickLinks = discoveryPage.getLinkTexts();
        Assert.assertTrue(quickLinks.contains(quickLink));
    }

    @When("I click on {} link")
    public void iClickOnQuickLink(String quickLink) {
        discoveryPage.clickOnMenu(quickLink);
    }

    @And("On the open page I see the title {}")
    public void onOpenPageISeeTitle(String headerText) {
        String text = discoveryPage.getMainHeaderText();
        Assert.assertTrue(text.contains(headerText));

    @When("I click on Sign up button")
    public void iClickOnSignUpButton() {
        discoveryPage.clickOnSignUpBtn();
    }

    @When("I input {} email")
    public void iInputEmail(String email) {
        discoveryPage.inputEmail(email);
    }

    @When("I click on Next button")
    public void iClickOnNextButton() {
        discoveryPage.clickOnNextBtn();
    }

    @Then("I see error message")
    public void iSeeErrorMessage(DocString errorMessage) {
        String message = errorMessage.getContent();
        discoveryPage.checkErrorMessageExists(message);
    }
}
