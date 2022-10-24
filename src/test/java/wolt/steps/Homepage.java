package wolt.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import wolt.pages.HomePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.BASE_URL;


public class Homepage {
    HomePage homepPage = new HomePage();
    @Given("I open a Homepage in {}")
    public void iOpenAHomepage(String city) {
       open(BASE_URL + city.toLowerCase());
        homepPage.accCookies();
    }

    @When("I click on {} menu option")
    public void iSeeMenuOption(String menuOption) {
        homepPage.clickOnMenu(menuOption);
    }

    @Then("I see {} restaurant category")
    public void iSeeRestaurantCategory(String category) {
        List<String> categories =  homepPage.getRestaurantCategoriesSize().texts();
        Assert.assertTrue(categories.contains(category));
    }
}
