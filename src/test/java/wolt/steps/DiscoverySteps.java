package wolt.steps;

import io.cucumber.java.en.And;
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
    public void iOpenADiscoveryPage(String city) {
        open(BASE_URL + city.toLowerCase());
        discoveryPage.accCookies();
    }

    @When("I click on {} menu option")
    public void iClickMenuOption(String menuOption) {
        discoveryPage.clickOnMenu(menuOption);
    }

    @Then("I see {} restaurant category")
    public void iSeeRestaurantCategory(String category) {
        List<String> categories = discoveryPage.getRestaurantCategoriesTexts();
        Assert.assertTrue(categories.contains(category));
    }

    @When("I click on Logo icon")
    public void iClickOnLogoIcon() {
        homepage = discoveryPage.clickOnLogo();
    }

    @When("I see {} link")
    public void iSeeQuickLinks(String quickLink) {
        List<String> quickLinks = discoveryPage.getLinkTexts();
        Assert.assertTrue(quickLinks.contains(quickLink));
    }

    @Then("I click on {} link")
    public void iClickOnQuickLink(String quickLink) {
        discoveryPage.clickOnMenu(quickLink);
    }

    @And("On the open page I see the title {}")
    public void onOpenPageISeeTitle(String headerText) {
        String text = discoveryPage.getMainHeaderText();
        Assert.assertTrue(text.contains(headerText));
    }
}