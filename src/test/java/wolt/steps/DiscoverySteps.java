package wolt.steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import org.junit.Assert;
import wolt.pages.DiscoveryPage;
import io.cucumber.docstring.DocString;

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

    @Then("I see {} Discovery page")
    public void iSeeCityDiscoveryPage(String city) {
        discoveryPage.checkCityText(city);
    }

    @Given("I see {} link on Discovery Page in {}")
    public void iSeeQuickLinks(String quickLink, String city) {
        open(BASE_URL + city.toLowerCase());
        discoveryPage.accCookies();
        discoveryPage.getLinkElts().shouldHave(CollectionCondition.itemWithText(quickLink));
    }

    @When("I click on {} link")
    public void iClickOnQuickLink(String quickLink) {
        discoveryPage.clickOnMenu(quickLink);
    }

    @Then("I see the title {}")
    public void iSeeTitle(String headerText) {
        discoveryPage.getMainHeaderElt().shouldHave(Condition.text(headerText));
    }

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

    @When("I click on We want you card in Join our team! category")
    public void iClickOnCardInCategoryOnDiscoveryPage() {
        jobsPage = discoveryPage.clickOnWeWantYouCard();
    }

    @When("I click on Next button in {} category")
    public void iClickOnNextButtonInCategoriesCategoryOnDiscoveryPage(String category) {
        discoveryPage.clickOnNextBtnInCategory(category);
    }

    @Then("I should see {} card")
    public void iShouldSeeCardInCategoryOnDiscoveryPage(String card) {
        discoveryPage.iSeeLastCard(card);
    }

    @When("I click logo icon")
    public void iClickLogoIcon() {
        homepage = discoveryPage.clickOnLogo();
    }

    @When("I see {} link")
    public void iSeeQuickLinks(String quickLink) {
        discoveryPage.getLinkElts().contains(quickLink);
    }

    @And("I see a Discovery page")
    public void iSeeADiscoveryPage() {
        discoveryPage.discoveryPageLayoutPresent();
    }
}
